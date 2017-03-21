package be.cetic.doc2m.rest.server.resource;

import java.io.IOException;
import java.util.logging.Logger;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import simplekaos.Goal;
import simplekaos.GoalType;
import simplekaos.KConcept;
import simplekaos.SimplekaosFactory;
import simplekaos.presentation.SimplekaosEditor;


public class ManageConcept {
	private static final Logger logger = Logger.getLogger(ManageConcept.class.getName());
	
	public Concept createConcept(Concept concept) throws IOException{
		IEditorPart editor = getActiveEditor();
    	if(editor instanceof SimplekaosEditor){
    		SimplekaosEditor simpleKaosEditor = (SimplekaosEditor) editor;
    		Resource resource = simpleKaosEditor.getEditingDomain().getResourceSet().getResources().get(0);
			KConcept kConcept =  buildConcept(concept);
			if(concept != null){
				//kConcept.setName(concept.getName());
	    		resource.getContents().add(kConcept);
	    		resource.save(null);    		
	    		concept.setId(kConcept.getId());
			}
    	}
		return concept;
	}
	
	private KConcept buildConcept(Concept concept){
		KConcept kConcept = null;
		String type = concept.getType();
		if(type.equals("Goal"))
			kConcept = SimplekaosFactory.eINSTANCE.createGoal();		
		else if(type.equals("Agent"))
			kConcept = SimplekaosFactory.eINSTANCE.createAgent();				
		else if(type.equals("Obstacle"))
			kConcept = SimplekaosFactory.eINSTANCE.createObstacle();
		else if(type.equals("Requirement")){
			kConcept = SimplekaosFactory.eINSTANCE.createGoal();
			((Goal) kConcept).setType(GoalType.REQUIREMENT);
		}
		else if(type.equals("Expectation")){
			kConcept = SimplekaosFactory.eINSTANCE.createGoal();
			((Goal) kConcept).setType(GoalType.EXPECTATION);
		}
		else if(type.equals("DomProp")){
			kConcept = SimplekaosFactory.eINSTANCE.createGoal();
			((Goal) kConcept).setType(GoalType.DOM_PROP);
		}
		else if(type.equals("SoftGoal")){
			kConcept = SimplekaosFactory.eINSTANCE.createGoal();
			((Goal) kConcept).setType(GoalType.SOFT_GOAL);
		}
	
		if(kConcept != null)
			kConcept.setName(concept.getName());
		
		return kConcept;
	}
	
	protected IEditorPart getActiveEditor(){
    	IWorkbench wb = PlatformUI.getWorkbench();
    	
	    IWorkbenchWindow window = wb.getWorkbenchWindows()[0];
	    IEditorPart editor = window.getActivePage().getActiveEditor();
	    return editor;
    }
  
    
    protected KConcept findElement(String key){
    	KConcept kConcept = null;
    	IEditorPart editor = getActiveEditor();
    	if(editor instanceof SimplekaosEditor){
    		SimplekaosEditor simpleKaosEditor = (SimplekaosEditor) editor;
    		Resource resource = simpleKaosEditor.getEditingDomain().getResourceSet().getResources().get(0);
			kConcept = findElement(resource, key);			
    	}
    	return kConcept;
    }
    
    
    private KConcept findElement(Resource resource, String key){		
		for(EObject obj: resource.getContents()){					
			KConcept kConcept = (KConcept) obj;
			String id = kConcept.getId();
			if(id.equals(key)){
				return kConcept;
			}						
		}
		return null;
	}
	
	
	public void updateConcept(Concept concept){
		String id = concept.getId();
		KConcept kConcept = findElement(id);
		if(kConcept != null)
			kConcept.setName(concept.getName());
		
	}
	
}
