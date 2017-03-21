package be.cetic.editor.microsoft.office;


/**
 * ObjectiverReference is the representation of a concept into ODT Documents
 * @author arm
 *
 */
public class MSReference extends Reference{
	// The instanceId of the concept
	
	
	private String type;
	private boolean isRemoved = false;
	
	

	/**
	 * Constructor that allows as parameter an id and a content
	 * @param id: the id of the reference (".uno:Objectiver:*)
	 * @see getPrefix()
	 * @param content: the content of the reference (the name of the concept by example)
	 */
	public MSReference(String id, String content, String type) {
		this.id = id;
		this.content = content;
		this.type = type;
	}
	
	public MSReference(String id){
		this.id = id;
	}
	
	public void isRemoved(boolean isRemoved){
		this.isRemoved = isRemoved;
	}
	
	public boolean isRemoved(){
		return isRemoved;
	}

	/**
	 * Get the URL of the reference
	 * Usefull for the locate operation of concept into Objectiver
	 * @return the URL of the reference
	 */
	public String getURL(){
		return url;
	}
	
	/**
	 * Get the prefix of the reference
	 * @return the prefix of the reference 
	 */
	public static String getPrefix(){
		return ".uno:Objectiver:";
	}
	
	public String getExternalId(){
		if(id.startsWith(PREFIX))		
			return id.substring(getPrefix().length());
		else return id;
	}
	

	public static boolean isObjectiverReference(String reference){
		return (reference.toUpperCase().startsWith(getPrefix().toUpperCase()));
	}

	public static String getReference(String name) {
		return name.substring(getPrefix().length());
	}
	
	public String getType(){
		return type;
	}
}
