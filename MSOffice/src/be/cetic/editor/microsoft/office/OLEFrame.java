package be.cetic.editor.microsoft.office;


import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.swt.SWT;
import org.eclipse.swt.SWTException;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.ole.win32.OLE;
import org.eclipse.swt.ole.win32.OleAutomation;
import org.eclipse.swt.ole.win32.OleClientSite;
import org.eclipse.swt.ole.win32.OleFrame;
import org.eclipse.swt.ole.win32.Variant;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import be.cetic.editor.microsoft.office.Action.ActionType;

class Action{
	public enum ActionType{NOACTION, EXPORT, SETTITLE, UPDATEREFERENCE, LOCATEREFERENCE, REMOVEREFERENCE, GETREFERENCES, FOCUS, CLOSE};
	public ActionType type;
	public MSReference reference;
	public String title;
	public File destination;	
	
	public Action(ActionType type){
		this.type = type;
	}
}

public abstract class OLEFrame {
	public static final Logger logger = Logger.getLogger(OLEFrame.class.getName());	
	protected  OleFrame frame;
	protected OleClientSite clientSite;
	private static MSOfficeDocument document;
	protected static String resultMacro;
	protected static boolean finished = false; 
	
	private static int WIDTH = 1024;
	private static int HEIGHT = 600;	
	
	protected static boolean opened = false; 
	
	final static int DocumentBeforeSaveEvent = 0x00000008;
	protected String applicationType;
	
	protected Stack<Action> action = new Stack<Action>();
	private static final String TEMPLATE_FILENAME = "ObjectiverTemplate.dotm";
	private static final String OBJECTIVEREXTERNALIDKEY = "ExternalId";
	
	
	public static void defaultSize(int width, int height){
		// TODO Check size
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int screenWidth = (int)screenSize.getWidth();
		int screenHeight = (int)screenSize.getHeight();
		if(width > screenWidth)
			width = screenWidth;
		if(height > screenHeight)
			height = screenHeight;
		
		WIDTH = width;
		HEIGHT = height;
	}
	

	
	public OLEFrame(String applicationType){
		this.applicationType = applicationType;
		opened = false;
	}
	  
	/**
	 * Static method to get the OTT Template
	 * @return the OTT template
	 */
	public static File getDefaultTemplate() {
		
			return new File(System.getProperty("user.dir") + File.separator + "docs" + File.separator + "templates", TEMPLATE_FILENAME);
		
	}
		
	private void init(final OleClientSite clientSite, int port, String externalId){
		runMacro(clientSite, "ObjectiverMacros.Init", new String[]{Integer.toString(port), externalId});
		
	}
	
	public List<MSReference>  getAllReferences(){
		while(!opened);		
		action.push(new Action(ActionType.GETREFERENCES));
		while(!finished);
		finished = false;
		
		return  parseReferences(resultMacro);
	}
	
	public void open(final MSOfficeDocument document){
		this.document = document;	
		
		Thread thread = new Thread(new Runnable(){
			public void listenEvents(final Shell shell){
				while(!action.isEmpty()){
					computeEvent(shell, action.pop());
					
				}
			}
				
			public void computeEvent(Shell shell, Action action){	
				if(action.type.equals(ActionType.SETTITLE)){				
					shell.setText(action.title);	
					
					shell.update();
					shell.redraw();
				}
				else if(action.type.equals(ActionType.UPDATEREFERENCE)){
					update(clientSite, action.reference);			
				}
				else if(action.type.equals(ActionType.LOCATEREFERENCE)){
					locate(clientSite, action.reference);			
				}
				else if(action.type.equals(ActionType.FOCUS)){					
					clientSite.doVerb(OLE.OLEIVERB_SHOW);
				}
				else if(action.type.equals(ActionType.REMOVEREFERENCE)){
					remove(clientSite, action.reference);					
				}
				else if(action.type.equals(ActionType.GETREFERENCES)){
					getReferences(clientSite);
				}
				else if(action.type.equals(ActionType.CLOSE)){
					clientSite.dispose();
					shell.dispose();
					
				}
				
				
			}
			public void run(){
				try{
					final Display display = new Display();
				    final Shell shell = new Shell(display);
				   
				    shell.setLayout(new FillLayout());
				    shell.setText(document.getTitle());
			    	File file = document.getFile();
			        frame = new OleFrame(shell, SWT.NONE);
			        clientSite = new OleClientSite(frame, SWT.NONE, applicationType, file);
			        clientSite.doVerb(OLE.OLEIVERB_INPLACEACTIVATE);
			        logger.log(Level.INFO, "Load Template {0}", getDefaultTemplate().getAbsolutePath());
			        attachTemplate(clientSite, getDefaultTemplate());
			        init(clientSite, MSOffice.getInstance().getPort(), document.getExternalId());
			          			     
			    
			
				    shell.setSize(WIDTH, HEIGHT);
				    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
					int screenWidth = (int)screenSize.getWidth();
					int screenHeight = (int)screenSize.getHeight();
				    int x = (int) (screenWidth - WIDTH)/2;
					int y = (int) (screenHeight - HEIGHT)/2;
				    shell.setLocation(x, y);
				    shell.open();
				    shell.forceActive();
			    
			    
				    opened = true;
				    clientSite.addFocusListener(new FocusListener(){
	
						@Override
						public void focusGained(FocusEvent arg0) {
							// TODO Auto-generated method stub
							
						}
	
						@Override
						public void focusLost(FocusEvent arg0) {
							try{
							if(clientSite != null && clientSite.isDirty())
				        		save();
							}
							catch(NullPointerException ex){
								//logger.log(Level.WARNING, ex.getMessage());
							}
						}
				    	
				    });
				    shell.addDisposeListener(new DisposeListener(){
				    		
						@Override
						public void widgetDisposed(DisposeEvent arg0) {
							save();
							MSOffice.getInstance().closeDocument(document);							
							clientSite.dispose();
						}
				    	
				    	
				    });
				    
				    
				    while (!shell.isDisposed()) {
				    	
				        if (!display.readAndDispatch()){
				        	listenEvents(shell);
				            display.sleep();
				        }
				    }
			    
				    display.dispose();
				    clientSite.dispose();
				    opened = false;
			}
			catch(NullPointerException ex){
				ex.printStackTrace();
			}
			catch(SWTException ex){
					ex.printStackTrace();
			}		
			
			}
			});
		thread.start();	
		
	}
	
	
	
 public void close(){
	 action.push(new Action(ActionType.CLOSE));
 }
	
	private void runMacro(OleClientSite clientSite, String macroName, String[] parameters){		
		if(clientSite.isDisposed()){
			MSOffice.getInstance().closeDocument(document);
			opened = false;
		}
		
		OleAutomation auto = new OleAutomation(clientSite);
		int[] dispIDs = auto.getIDsOfNames(new String[] {"Application"});
		Variant varResult = auto.getProperty(dispIDs[0]);
		if (varResult != null && varResult.getType() != OLE.VT_EMPTY) {
			OleAutomation application = varResult.getAutomation();			
			varResult.dispose();
			dispIDs = application.getIDsOfNames(new String[] {"Run"});
			Variant[] cmdParameters;
			if(parameters == null){
				cmdParameters =  new Variant[1];				
			}
			else{
				cmdParameters = new Variant[parameters.length+1];
				int index=1;
				for(String param: parameters){
					cmdParameters[index] = new Variant(param);
					index++;
				}		
			}
			cmdParameters[0] = new Variant(macroName);
			
			varResult = application.invoke(dispIDs[0], cmdParameters);			
			if (varResult != null && varResult.getType() != OLE.VT_EMPTY) {
				resultMacro = varResult.getString();
				varResult.dispose();
			}
			application.dispose();
		}		
		
		auto.dispose();
		
		
	
	}
	
	private void attachTemplate(final OleClientSite clientSite, File template){	
		OleAutomation auto = new OleAutomation(clientSite);
		int[] dispIDs = auto.getIDsOfNames(new String[] {"Application"});
		Variant varResult = auto.getProperty(dispIDs[0]);
		OleAutomation application = varResult.getAutomation();			
		varResult.dispose();
		int[] dispIdMember = application.getIDsOfNames(new String[]{"ActiveDocument"});
		Variant docResult = application.getProperty(dispIdMember[0]);
		OleAutomation document = docResult.getAutomation();
		docResult.dispose();
		int[] dispIdAttachedTemplate = document.getIDsOfNames(new String[]{"AttachedTemplate"});
		document.setProperty(dispIdAttachedTemplate[0], new Variant(template.getAbsolutePath()));
		clientSite.doVerb(OLE.OLEIVERB_UIACTIVATE);
		document.dispose();
		application.dispose();
		auto.dispose();
		
	}
	
	private  void deattachTemplate(final OleClientSite clientSite){		
		OleAutomation auto = new OleAutomation(clientSite);
		int[] dispIDs = auto.getIDsOfNames(new String[] {"Application"});
		Variant varResult = auto.getProperty(dispIDs[0]);
		OleAutomation application = varResult.getAutomation();			
		varResult.dispose();
		int[] dispIdMember = application.getIDsOfNames(new String[]{"ActiveDocument"});
		Variant docResult = application.getProperty(dispIdMember[0]);
		OleAutomation document = docResult.getAutomation();
		docResult.dispose();
		int[] dispIdAttachedTemplate = document.getIDsOfNames(new String[]{"AttachedTemplate"});
		document.setProperty(dispIdAttachedTemplate[0], new Variant(""));
		document.dispose();
		application.dispose();
		auto.dispose();
		
	}
	
	private  void setDocumentExternalId(String externalId){		
		
		OleAutomation auto = new OleAutomation(clientSite);
		int[] dispIDs = auto.getIDsOfNames(new String[] {"Application"});
		Variant varResult = auto.getProperty(dispIDs[0]);
		OleAutomation application = varResult.getAutomation();			
		varResult.dispose();
		int[] dispIdMember = application.getIDsOfNames(new String[]{"ActiveDocument"});
		Variant docResult = application.getProperty(dispIdMember[0]);
		OleAutomation document = docResult.getAutomation();
		docResult.dispose();
		int[] dispIdCustomProperties = document.getIDsOfNames(new String[]{"CustomDocumentProperties"});
		Variant customPropertiesResult = document.getProperty(dispIdCustomProperties[0]);
		OleAutomation customProperties = customPropertiesResult.getAutomation();
		customPropertiesResult.dispose();
		int[] itemId = customProperties
				.getIDsOfNames(new String[] { "Item" });
		customProperties.setProperty(itemId[0], new Variant[] {
				new Variant(OBJECTIVEREXTERNALIDKEY), new Variant(externalId) });

		customProperties.dispose();
		//document.dispose();
		//auto.dispose();
	}
	
	public  String getDocumentExternalId(MSOfficeDocument document) throws NullPointerException{	
		
		if(!opened){
			final Display display = new Display();
			
			final Shell shell = new Shell(display);
			shell.setLayout(new FillLayout());	   
			File file = document.getFile();		
			frame = new OleFrame(shell, SWT.NONE);	        
			clientSite = new OleClientSite(frame, SWT.NONE, applicationType, file);	        
			clientSite.doVerb(OLE.OLEIVERB_OPEN);
			opened = true;
			String value = getDocumentExternalId(document);
			opened = false;
			clientSite.dispose();
			display.dispose();			
			shell.dispose();
			return value;
		}
		else{
		
			OleAutomation auto = new OleAutomation(clientSite);
			int[] dispIDs = auto.getIDsOfNames(new String[] {"Application"});
			Variant varResult = auto.getProperty(dispIDs[0]);
			OleAutomation application = varResult.getAutomation();			
			varResult.dispose();
			int[] dispIdMember = application.getIDsOfNames(new String[]{"ActiveDocument"});
			Variant docResult = application.getProperty(dispIdMember[0]);
			OleAutomation documentOle = docResult.getAutomation();
			docResult.dispose();
			int[] dispIdCustomProperties = documentOle.getIDsOfNames(new String[]{"CustomDocumentProperties"});
			Variant customPropertiesResult = documentOle.getProperty(dispIdCustomProperties[0]);
			OleAutomation customProperties = customPropertiesResult.getAutomation();
			customPropertiesResult.dispose();
			int[] itemId = customProperties
					.getIDsOfNames(new String[] { "Item" });
			Variant value = customProperties.getProperty(
					itemId[0], new Variant[] { new Variant("ObjectiverExternalId")});
					
			customProperties.dispose();
			documentOle.dispose();
			auto.dispose();
			if(value != null)
				return value.getString();
			else return null;
		}
	}
	
	
	protected void save(){
		File file = document.getFile();
		clientSite.save(file, true);
		
	}
	
	void closeEditor(){		
		if(clientSite != null){
			
			clientSite.dispose();			
		}
	}
	
	
	public void export(MSOfficeDocument document, File destination){
		if(!opened){	
			try{
				final Display display = new Display();
				final Shell shell = new Shell(display);
				
				shell.setLayout(new FillLayout());	   
				File file = document.getFile();
				frame = new OleFrame(shell, SWT.NONE);	        
				final OleClientSite clientSite = new OleClientSite(frame, SWT.NONE, applicationType, file);	        
				clientSite.doVerb(OLE.OLEIVERB_OPEN);
				opened = true;
				
				init(clientSite, MSOffice.getInstance().getPort(), document.getExternalId());	        
				attachTemplate(clientSite, getDefaultTemplate());
				//updateBeforeExport(clientSite);			
				deattachTemplate(clientSite);
				
				clientSite.save(destination, true);					
				opened = false;
				clientSite.dispose();
				display.dispose();
				shell.dispose();	
			}
			catch(SWTException ex){
				Display.getCurrent().dispose();
				ex.printStackTrace();
				export(document, destination);
			}
			
			catch(NullPointerException ex){
				ex.printStackTrace();
			}
		}		 	
	}	
	
	
	
	
	
	private List<MSReference> parseReferences(String resultMacro){
		List<MSReference> references = new ArrayList<MSReference>();
		if(resultMacro != null && !resultMacro.trim().equals("")){
			/*
		    try  
		    {  
		        String charset = "utf-8";
		        InputStream input = new ByteArrayInputStream(resultMacro.getBytes(charset));		      
		        Document document = new SAXBuilder().build(input);
		        List refs = document.getRootElement().getChildren();
		        for(int i=0; i < refs.size(); i++){
		        	Element element = (Element) refs.get(i);
		        	String content = element.getChild("name").getText(); 
		        	String ref = element.getChildText("externalId");
		        			        	
		        	String	type = element.getChildText("type");
		        	if(type.equals(ref)){
		        		type = getConceptType(ref.substring(".Objectiver:".length()));
		        	}		        
	        		String objectiverConceptType = getConceptType(ref.substring(".Objectiver:".length()));
	        		if(objectiverConceptType != null)
	        			type = objectiverConceptType;
	        	
		        	ref = ref.substring(".Objectiver:".length());
		        	MSReference objRef = new MSReference(ref, content, type);
		        	
		        
		        	references.add(objRef);		        
		        }
		    } catch (Exception e) {  
		        e.printStackTrace();  
		    } 	*/	
		}
		resultMacro = null;
		return references;
	}

	
	
		public void updateAllReferences(){
	
	
		List<MSReference> referencesInWordDocument = getWordReferences();		
				
		for(MSReference reference: referencesInWordDocument){
			if(reference.isRemoved()){
					removeReference(reference);	
			}
			else{
				
				updateReference(reference);				
			}
		}
		
		
		save();
		}
		
		protected List<MSReference> getWordReferences(){
			return getAllReferences();			
		}

	public void focus(){
		action.push(new Action(ActionType.FOCUS));
	}
	
	public void changeTitle(String title) {	   
		Action a = new Action(ActionType.SETTITLE);
		a.title = title;
	    action.push(a);
	}
	
	public void updateReference(MSReference reference){	
		
		Action a = new Action(ActionType.UPDATEREFERENCE);
		a.reference = reference;
		action.push(a);
		
	}
	
	public void removeReference(MSReference reference){
		
		Action a = new Action(ActionType.REMOVEREFERENCE);
		a.reference = reference;
		action.push(a);
	}
	
	public void locateReference(MSReference reference){
		
		Action a = new Action(ActionType.LOCATEREFERENCE);
		a.reference = reference;
		action.push(a);
	}


	private void getReferences(final OleClientSite clientSite){
		finished = false;
		runMacro(clientSite, "ObjectiverMacros.GetObjectiverReferences", null);
		finished = true;
	}
	
	private void update(final OleClientSite clientSite, MSReference reference){
		String externalId = reference.getExternalId();
		runMacro(clientSite, "ObjectiverMacros.UpdateReference", new String[]{externalId, reference.getContent(), reference.getType()});
		
	}
	
	private void remove(final OleClientSite clientSite, MSReference reference){		
		String externalId = reference.getExternalId();
		runMacro(clientSite, "ObjectiverMacros.RemoveReference", new String[]{externalId});		
	}
	
	private void locate(final OleClientSite clientSite, MSReference reference){
		String externalId = reference.getExternalId();		
		runMacro(clientSite, "ObjectiverMacros.LocateConceptInDocument", new String[]{externalId});		
	}
	
	
}
