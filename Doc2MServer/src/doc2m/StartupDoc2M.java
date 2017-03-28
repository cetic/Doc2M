package doc2m;

import org.eclipse.ui.IStartup;
import org.restlet.data.Protocol;

import be.cetic.doc2m.rest.server.Doc2MRestServer;

public class StartupDoc2M implements IStartup {

	private Doc2MRestServer server;
	
	@Override
	public void earlyStartup() {
		// TODO Auto-generated method stub
		server = new Doc2MRestServer(Protocol.HTTP, 1234);
		server.start();
	}
	
	

}
