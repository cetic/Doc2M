package be.cetic.doc2m.rest.server;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;

import be.cetic.doc2m.rest.server.restlet.*;


public class Doc2MRestApplication extends Application{


	public static Restlet manageConceptRestlet;
	public static Restlet locateConceptRestlet;
	public static Restlet informationConceptRestlet;
	

	private static final Logger logger = Logger.getLogger(Doc2MRestApplication.class.getName());
	
	static{
		try{
			manageConceptRestlet = new ManageConceptRestlet();
			locateConceptRestlet = new LocateConceptRestlet();
			informationConceptRestlet = new InformationConceptRestlet();
		}
		catch(Exception ex){
			logger.log(Level.WARNING,  ex.getMessage(), ex);
		}
	}

	
	

	@Override
    public synchronized Restlet createInboundRoot() {
	  Router router = new Router(getContext());
	  // Attach a guard to secure access to the directory
	  //Guard guard = new Guard(getContext(), ChallengeScheme.HTTP_BASIC,
	  //        "Restlet tutorial");
	  //guard.getSecrets().put("scott", "tiger".toCharArray());
	  //router.attach("/", guard);
	  router.attach("/concepts", manageConceptRestlet);
	  router.attach("/concepts/{id}", locateConceptRestlet);
	  router.attach("/util/conceptTypes", informationConceptRestlet);
	  
	  return router;
	}
	
	
}
