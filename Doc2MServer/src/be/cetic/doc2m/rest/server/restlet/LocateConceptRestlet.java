package be.cetic.doc2m.rest.server.restlet;

import java.util.logging.Level;

import org.eclipse.core.commands.ParameterizedCommand;
import org.eclipse.ui.commands.ICommandService;
import org.eclipse.ui.handlers.IHandlerService;
import org.restlet.Request;
import org.restlet.Response;
import org.restlet.data.MediaType;
import org.restlet.data.Method;
import org.restlet.data.Status;
import org.restlet.representation.StringRepresentation;

import be.cetic.doc2m.rest.server.resource.LocateConcept;


public class LocateConceptRestlet extends Doc2MRestlet{
	private LocateConcept locateConcept;
	
	 public LocateConceptRestlet(){
	        this.locateConcept = new LocateConcept();
	    }

	    @Override
	    public void handle(Request request, Response response) {
	    	
	        if(request.getMethod().equals(Method.GET)) {
	        	try{
	        		String id = (String) request.getAttributes().get("id");
	        		locateConcept.locate(id);	        	        
		        	response.setStatus(Status.SUCCESS_OK);
		        	response.setEntity(new StringRepresentation(id));
	        	        
	        	}
	        	catch(Exception ex){
	        		logger.log(Level.WARNING,  ex.getMessage(), ex);
	        		response.setStatus(Status.CLIENT_ERROR_BAD_REQUEST);
	        		response.setEntity(buildError(ex),  MediaType.APPLICATION_XML);
	        	}
	        }		
		
	    }
	    
}
