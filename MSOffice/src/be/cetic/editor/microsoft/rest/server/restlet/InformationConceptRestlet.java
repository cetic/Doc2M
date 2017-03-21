package be.cetic.editor.microsoft.rest.server.restlet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;

import org.restlet.Request;
import org.restlet.Response;
import org.restlet.data.MediaType;
import org.restlet.data.Method;
import org.restlet.data.Status;
import org.restlet.representation.StringRepresentation;


public class InformationConceptRestlet extends MSOfficeRestlet{
	
		
	 public InformationConceptRestlet(){
	       
	    }

	    @Override
	    public void handle(Request request, Response response) {
	    	
	        if(request.getMethod().equals(Method.GET)) {
	        	try{
	        		response.setStatus(Status.SUCCESS_OK);
	        		List<String> types = new ArrayList<String>();
	        		types.add("Agent");
	        		types.add("DomProp");
	        		types.add("Entity");
	        		types.add("Event");
	        		types.add("Expectation");
	        		types.add("Goal");
	        		types.add("Obstacle");
	        		types.add("Requirement");	        		
	        		types.add("SoftGoal");
	        		Map<String, Object> t = new HashMap<String, Object>();
	        		t.put("types",  types);
	        		response.setEntity(new StringRepresentation(mapper.writeValueAsString(t), MediaType.APPLICATION_JSON));	        	       
	        	}
	        	catch(Exception ex){
	        		logger.log(Level.WARNING,  ex.getMessage(), ex);
	        		response.setStatus(Status.CLIENT_ERROR_BAD_REQUEST);
	        		response.setEntity(buildError(ex),  MediaType.APPLICATION_JSON);
	        	}
	        }		
		
	    }
	    
}
