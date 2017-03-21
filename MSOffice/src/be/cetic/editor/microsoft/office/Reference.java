package be.cetic.editor.microsoft.office;

/**
 * Representation of a reference that can be insert into OpenOffice document
 * @author arm
 *
 */
public class Reference {

	protected String id;
	protected String content;
	protected String url;
	
	protected static String PREFIX = ".uno:Reference:";
	
	/**
	 * Default constructor
	 */
	public Reference(){
		
	}
	
	/**
	 * Constructor that allows as parameter id and content
	 * @param id: the id of the reference
	 * @param content: the content of the reference
	 */
	public Reference(String id, String content){
		this.id = PREFIX + id;
		this.content = content;
		url = id;
	}
	
	/**
	 * Get the URL of the reference
	 * @return the URL of the reference
	 */
	public String getURL() {
		return url;
	}
	
	/**
	 * Set the ULR of the reference
	 * @param url: the url of the reference
	 */
	public void setURL(String url){
		if(url.startsWith(PREFIX))
			this.url = url;
		else this.url = PREFIX + url; 
	}
	
	/**
	 * Get the id of the reference
	 * @return the id of the reference
	 */
	public String getId(){
		return id;
	}

	/**
	 * Set the id of the reference
	 * @param id: the id of the reference
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Get the content of the reference
	 * @return the content of the reference
	 */
	public String getContent() {
		return content;
	}

	/**
	 * Set the content of the reference
	 * @param content: the content of the reference
	 */
	public void setContent(String content) {
		this.content = content;
	}
	
}
