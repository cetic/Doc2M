package be.cetic.doc2m.rest.server.restlet;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.codehaus.jackson.map.ObjectMapper;
import org.jdom.Document;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.restlet.Restlet;

import be.cetic.doc2m.rest.server.resource.Concept;

public abstract class Doc2MRestlet extends Restlet{
	protected static final Logger logger = Logger.getLogger(Doc2MRestlet.class.getName());
	
	protected JAXBContext context;
	protected Unmarshaller unmarshaller;
	protected Marshaller marshaller;
	protected ObjectMapper mapper;
	
	public Doc2MRestlet(){
		mapper = new ObjectMapper();
	}
	
	public Concept buildConcept(InputStream input) throws JDOMException, IOException{
		Concept concept = new Concept();
		
		Document document = new SAXBuilder().build(input);
		if(document.getRootElement().getChild("name") != null){
			String name = document.getRootElement().getChild("name").getText();
			concept.setName(name);
		}
		if(document.getRootElement().getChild("type") != null){
			String type = document.getRootElement().getChild("type").getText();
			concept.setType(type);
		}
		
		if(document.getRootElement().getChild("id") != null){
			String id = document.getRootElement().getChild("id").getText();
			concept.setId(id);
		}
		
		
		return concept;
	}
	
	
	public String buildError(Exception ex){
		StringBuffer buffer = new StringBuffer();
		buffer.append("{\"message\":\"");
		buffer.append(ex.getMessage());		
		buffer.append("\"}");
		return buffer.toString();
	}
	
	
}
