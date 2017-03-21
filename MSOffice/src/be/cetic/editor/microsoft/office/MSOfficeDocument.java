package be.cetic.editor.microsoft.office;

import java.io.File;


public  class MSOfficeDocument{
	private File file;
	private WordOLEFrame frame;
	private String title;
	
	public String getExternalId(){
		return file.getName().replace("_",  ":").substring(0,  file.getName().lastIndexOf("."));
	}
	
	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	
	public MSOfficeDocument(){
		frame = new WordOLEFrame();
	}
	
	public MSOfficeDocument(File file){
		this();
		this.file = file;		
		this.title = file.getName();		
	}
	
	public void open(){
		if(file.exists())
			frame.open(this);

	}
	
	
	public String getTitle(){
		return this.title;
	}
	
	public void focus(){
		frame.focus();
	}
	
	public void setTitle(String title){
		this.title = title; 
		frame.changeTitle(title);
	}
	
	
	
	public void locateConcept(MSReference reference){		
		frame.locateReference(reference);
	}
	
	public void export(File destination){
		frame.export(this, destination);
		
	}
	
	public void removeReference(MSReference reference){
		
		frame.removeReference(reference);
	}
	
	public void updateReference(MSReference reference){
		
		frame.updateReference(reference);
		
	}
	
	public void updateAllReferences(){
		if(isReadOnly())
			return;
		
		frame.updateAllReferences();		
	}
	
	private boolean isReadOnly(){
		return false;
	}
	
	
	
	
	
	public void close(){
		frame.close();
	}

	
	
	public String getDocumentExternalId(){
		return frame.getDocumentExternalId(this);
	}
}
