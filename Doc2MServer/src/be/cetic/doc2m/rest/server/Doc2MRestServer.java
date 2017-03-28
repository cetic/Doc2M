package be.cetic.doc2m.rest.server;

import java.io.IOException;
import java.net.DatagramSocket;
import java.net.ServerSocket;
import java.util.Arrays;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.restlet.Component;
import org.restlet.Server;
import org.restlet.data.Protocol;
import org.restlet.service.CorsService;

public class Doc2MRestServer {
	private static final Logger logger = Logger.getLogger(Doc2MRestServer.class.getName());
	private Doc2MRestApplication application;
	private Component component = null;
	private Server server;
	public static int port;
	private Protocol protocol;
	
	public Doc2MRestServer(Protocol protocol, int port){
		try{
			this.protocol = protocol;
			Doc2MRestServer.port = port;
			application = new Doc2MRestApplication();
			CorsService corsService = new CorsService();
		    corsService.setAllowingAllRequestedHeaders(true);
		    corsService.setAllowedOrigins(new HashSet(Arrays.asList("*")));
		    corsService.setAllowedCredentials(true);
		    corsService.setSkippingResourceForCorsOptions(true);
			application.getServices().add(corsService);
			component = new Component();
			
			server = component.getServers().add(protocol, port);
			
			component.getDefaultHost().attach("/doc2M", application);			
			component.getLogService().setEnabled(false);
			
			
		}
		catch(Exception ex){
			logger.log(Level.WARNING,  ex.getMessage(), ex);
		}
	}
	
	/**
	 * Checks to see if a specific port is available.
	 *
	 * @param port the port to check for availability
	 */
	public static boolean available(int port) {	    

	    ServerSocket ss = null;
	    DatagramSocket ds = null;
	    try {
	        ss = new ServerSocket(port);
	        ss.setReuseAddress(true);
	        ds = new DatagramSocket(port);
	        ds.setReuseAddress(true);
	        return true;
	    } catch (IOException e) {
	    } finally {
	        if (ds != null) {
	            ds.close();
	        }

	        if (ss != null) {
	            try {
	                ss.close();
	            } catch (IOException e) {
	                /* should not be thrown */
	            }
	        }
	    }

	    return false;
	}
	
	public synchronized void start(){
		try{			
			component.start();
		}
		catch(java.net.BindException ex){	
			logger.log(Level.WARNING,  ex.getMessage());			
		}
		catch(Exception ex){
			logger.log(Level.WARNING,  ex.getMessage(), ex);
		}
	}
	
	public synchronized void stop(){
		try{			
			component.stop();
		}
		catch(java.net.BindException ex){	
			logger.log(Level.WARNING,  ex.getMessage());			
		}
		catch(Exception ex){
			logger.log(Level.WARNING,  ex.getMessage(), ex);
		}
	}
	
	
	public static void main(String[] args){
		new Doc2MRestServer(Protocol.HTTP, 8182).start();
	}
}
