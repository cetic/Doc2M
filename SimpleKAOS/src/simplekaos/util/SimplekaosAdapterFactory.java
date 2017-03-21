/**
 */
package simplekaos.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import simplekaos.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see simplekaos.SimplekaosPackage
 * @generated
 */
public class SimplekaosAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SimplekaosPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplekaosAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SimplekaosPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimplekaosSwitch<Adapter> modelSwitch =
		new SimplekaosSwitch<Adapter>() {
			@Override
			public Adapter caseKConcept(KConcept object) {
				return createKConceptAdapter();
			}
			@Override
			public Adapter caseKObject(KObject object) {
				return createKObjectAdapter();
			}
			@Override
			public Adapter caseKDocument(KDocument object) {
				return createKDocumentAdapter();
			}
			@Override
			public Adapter caseKDiagram(KDiagram object) {
				return createKDiagramAdapter();
			}
			@Override
			public Adapter caseObstacle(Obstacle object) {
				return createObstacleAdapter();
			}
			@Override
			public Adapter caseKAndOrRel(KAndOrRel object) {
				return createKAndOrRelAdapter();
			}
			@Override
			public Adapter caseGoal(Goal object) {
				return createGoalAdapter();
			}
			@Override
			public Adapter caseGRefinement(GRefinement object) {
				return createGRefinementAdapter();
			}
			@Override
			public Adapter caseORefinement(ORefinement object) {
				return createORefinementAdapter();
			}
			@Override
			public Adapter caseAssignment(Assignment object) {
				return createAssignmentAdapter();
			}
			@Override
			public Adapter caseKReference(KReference object) {
				return createKReferenceAdapter();
			}
			@Override
			public Adapter caseKPackage(KPackage object) {
				return createKPackageAdapter();
			}
			@Override
			public Adapter caseKGReference(KGReference object) {
				return createKGReferenceAdapter();
			}
			@Override
			public Adapter caseKRationale(KRationale object) {
				return createKRationaleAdapter();
			}
			@Override
			public Adapter caseKRelationship(KRelationship object) {
				return createKRelationshipAdapter();
			}
			@Override
			public Adapter caseConflict(Conflict object) {
				return createConflictAdapter();
			}
			@Override
			public Adapter caseResponsibility(Responsibility object) {
				return createResponsibilityAdapter();
			}
			@Override
			public Adapter caseObstruction(Obstruction object) {
				return createObstructionAdapter();
			}
			@Override
			public Adapter caseResolution(Resolution object) {
				return createResolutionAdapter();
			}
			@Override
			public Adapter caseAgent(Agent object) {
				return createAgentAdapter();
			}
			@Override
			public Adapter caseTextDocument(TextDocument object) {
				return createTextDocumentAdapter();
			}
			@Override
			public Adapter caseKReport(KReport object) {
				return createKReportAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link simplekaos.KConcept <em>KConcept</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simplekaos.KConcept
	 * @generated
	 */
	public Adapter createKConceptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simplekaos.KObject <em>KObject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simplekaos.KObject
	 * @generated
	 */
	public Adapter createKObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simplekaos.KDocument <em>KDocument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simplekaos.KDocument
	 * @generated
	 */
	public Adapter createKDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simplekaos.KDiagram <em>KDiagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simplekaos.KDiagram
	 * @generated
	 */
	public Adapter createKDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simplekaos.Obstacle <em>Obstacle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simplekaos.Obstacle
	 * @generated
	 */
	public Adapter createObstacleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simplekaos.KAndOrRel <em>KAnd Or Rel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simplekaos.KAndOrRel
	 * @generated
	 */
	public Adapter createKAndOrRelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simplekaos.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simplekaos.Goal
	 * @generated
	 */
	public Adapter createGoalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simplekaos.GRefinement <em>GRefinement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simplekaos.GRefinement
	 * @generated
	 */
	public Adapter createGRefinementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simplekaos.ORefinement <em>ORefinement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simplekaos.ORefinement
	 * @generated
	 */
	public Adapter createORefinementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simplekaos.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simplekaos.Assignment
	 * @generated
	 */
	public Adapter createAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simplekaos.KReference <em>KReference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simplekaos.KReference
	 * @generated
	 */
	public Adapter createKReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simplekaos.KPackage <em>KPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simplekaos.KPackage
	 * @generated
	 */
	public Adapter createKPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simplekaos.KGReference <em>KG Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simplekaos.KGReference
	 * @generated
	 */
	public Adapter createKGReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simplekaos.KRationale <em>KRationale</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simplekaos.KRationale
	 * @generated
	 */
	public Adapter createKRationaleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simplekaos.KRelationship <em>KRelationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simplekaos.KRelationship
	 * @generated
	 */
	public Adapter createKRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simplekaos.Conflict <em>Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simplekaos.Conflict
	 * @generated
	 */
	public Adapter createConflictAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simplekaos.Responsibility <em>Responsibility</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simplekaos.Responsibility
	 * @generated
	 */
	public Adapter createResponsibilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simplekaos.Obstruction <em>Obstruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simplekaos.Obstruction
	 * @generated
	 */
	public Adapter createObstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simplekaos.Resolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simplekaos.Resolution
	 * @generated
	 */
	public Adapter createResolutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simplekaos.Agent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simplekaos.Agent
	 * @generated
	 */
	public Adapter createAgentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simplekaos.TextDocument <em>Text Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simplekaos.TextDocument
	 * @generated
	 */
	public Adapter createTextDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simplekaos.KReport <em>KReport</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simplekaos.KReport
	 * @generated
	 */
	public Adapter createKReportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SimplekaosAdapterFactory
