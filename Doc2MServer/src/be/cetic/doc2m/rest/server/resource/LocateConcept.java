package be.cetic.doc2m.rest.server.resource;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.ui.util.EditUIUtil;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

import simplekaos.KConcept;
import simplekaos.presentation.SimplekaosEditor;

public class LocateConcept {
	private static final Logger logger = Logger.getLogger(LocateConcept.class.getName());
	
	
	public void locate(String externalId) {
		Display.getDefault().asyncExec(new Runnable() {
		    @Override
		    public void run() {
		    	IEditorPart editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
				if(editor instanceof SimplekaosEditor){
					
					SimplekaosEditor sEditor = (SimplekaosEditor) editor;
					Resource resource = sEditor.getEditingDomain().getResourceSet().getResources().get(0);
					for(EObject obj: resource.getContents()){
						if(obj instanceof KConcept){
							KConcept kConcept = (KConcept) obj;
							if(kConcept.getId().equals(externalId)){
								Collection<EObject> collection = new ArrayList<EObject>();
								collection.add(kConcept);
								sEditor.setSelectionToViewer(collection);		
								//sEditor.getViewer().setSelection(new StructuredSelection(kConcept), true);
								break;
							}
						}
					}
				}
		    }
		});
		
	}
}
