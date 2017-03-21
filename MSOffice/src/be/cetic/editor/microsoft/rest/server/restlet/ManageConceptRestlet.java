package be.cetic.editor.microsoft.rest.server.restlet;

import java.util.logging.Level;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import org.restlet.Request;
import org.restlet.Response;
import org.restlet.data.MediaType;
import org.restlet.data.Method;
import org.restlet.data.Status;
import org.restlet.representation.StringRepresentation;

import be.cetic.editor.microsoft.rest.server.resource.Concept;
import be.cetic.editor.microsoft.rest.server.resource.ManageConcept;


public class ManageConceptRestlet extends MSOfficeRestlet{
	
	private ManageConcept manageConcept;

    public ManageConceptRestlet(){
    	super();
        this.manageConcept = new ManageConcept();
        
    }

    @Override
    public void handle(Request request, Response response) {
    	String charset = "iso-8859-1";
        if(request.getMethod().equals(Method.POST)) {          	
        	try{        		
        		if(request.getEntity().getCharacterSet() != null)
    				charset = request.getEntity().getCharacterSet().getName();        	
    			String requestContent = request.getEntity().getText();    			    		
    			Concept concept = mapper.readValue(requestContent,  Concept.class);
    			logger.log(Level.INFO,  "Create concept: {0}", concept.getName());
        		Concept newConcept = manageConcept.createConcept(concept);        		
        		response.setEntity(new StringRepresentation(mapper.writeValueAsString(newConcept), MediaType.APPLICATION_JSON));
        	}
        	catch(NullPointerException ex){
        		logger.log(Level.WARNING, ex.getMessage(), ex);
        		response.setStatus(Status.CLIENT_ERROR_BAD_REQUEST);
        		response.setEntity(buildError(ex), MediaType.APPLICATION_JSON);        		
        	}
        	catch(Exception ex){
        		logger.log(Level.WARNING, ex.getMessage(), ex);
        		response.setStatus(Status.CLIENT_ERROR_BAD_REQUEST);
        		response.setEntity(buildError(ex), MediaType.APPLICATION_JSON);        		
        	}        		        
    	}
        else if(request.getMethod().equals(Method.PUT)){
        	try{   			
    			
    			Concept concept = mapper.readValue(request.getEntity().getText(), Concept.class);
            	logger.log(Level.INFO,  "Update concept: {0}", concept.getName());   	       
        		manageConcept.updateConcept(concept);
        		response.setStatus(Status.SUCCESS_NO_CONTENT);
        	}
        	catch(Exception ex){
        		logger.log(Level.WARNING, ex.getMessage(), ex);
        		response.setStatus(Status.CLIENT_ERROR_BAD_REQUEST);
        		response.setEntity(buildError(ex), MediaType.APPLICATION_JSON);
        		
        	}        		        
        }               
        else{
            response.setStatus(Status.CLIENT_ERROR_BAD_REQUEST);
        }
   }
}
