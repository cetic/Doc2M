package be.cetic.editor.microsoft.office;

import java.io.File;

import be.cetic.editor.microsoft.office.MSOfficeDocument;

public class WordOLEFrame extends OLEFrame{
  
  final static int DocumentBeforeSaveEvent = 0x00000008;
  
  
  public WordOLEFrame(){
	 super("Word.Document");
	
  }

  
  public static void main(String[] args){
	  File template = new File("./docs/DEMO.docx");	  
	  MSOfficeDocument document= new MSOfficeDocument(template);
	  document.open();
  }






  
}
