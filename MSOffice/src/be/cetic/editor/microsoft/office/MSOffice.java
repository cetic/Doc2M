package be.cetic.editor.microsoft.office;


import java.io.File;
import java.util.ArrayList;

import java.util.List;
import java.util.logging.Logger;


public class MSOffice {
	public static final Logger logger = Logger.getLogger(MSOffice.class.getName());
	private static MSOffice instance = null;
	private ArrayList<MSOfficeDocument> documents;
	private int port;
	
	private MSOffice(){
		documents = new ArrayList<MSOfficeDocument>();
		
	}
	
	public static MSOffice getInstance(){
		if(instance == null)
			instance = new MSOffice();
		
		return instance;		
	}
	
	public void disconnect(){
		// Close the template file
		for(MSOfficeDocument document: documents){
			document.close();
		}
		documents.clear();
	}
	
	
	
	public MSOfficeDocument openDocument(File file) {					
		MSOfficeDocument document = getOpenedDocument(file);
		if(document == null){
			document = new MSOfficeDocument(file);
			
			documents.add(document);
			document.open();
		
			document.updateAllReferences();
		}
		else document.focus();	
		return document;
	}
	

	private MSOfficeDocument getOpenedDocument(File file) {
		for(MSOfficeDocument document: documents){
			if(document.getFile().equals(file))
				return document;
		}
		return null;
	}
	
	public void closeDocument(MSOfficeDocument document){
		documents.remove(document);
	}
	
	public List<MSOfficeDocument> getOpenedDocuments(){
		return documents;
	}
	
	public void updateAllWordDocuments(MSReference reference){
		for(MSOfficeDocument document: documents){
			//document.focus();		
			document.updateReference(reference);
		}
	}
	
	


	public void serPort(int port) {
		this.port = port;
	}
	
	public int getPort(){
		return port;
	}
}
