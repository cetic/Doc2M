/**
 */
package simplekaos.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import simplekaos.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see simplekaos.SimplekaosPackage
 * @generated
 */
public class SimplekaosSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SimplekaosPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplekaosSwitch() {
		if (modelPackage == null) {
			modelPackage = SimplekaosPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SimplekaosPackage.KCONCEPT: {
				KConcept kConcept = (KConcept)theEObject;
				T result = caseKConcept(kConcept);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplekaosPackage.KOBJECT: {
				KObject kObject = (KObject)theEObject;
				T result = caseKObject(kObject);
				if (result == null) result = caseKConcept(kObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplekaosPackage.KDOCUMENT: {
				KDocument kDocument = (KDocument)theEObject;
				T result = caseKDocument(kDocument);
				if (result == null) result = caseKConcept(kDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplekaosPackage.KDIAGRAM: {
				KDiagram kDiagram = (KDiagram)theEObject;
				T result = caseKDiagram(kDiagram);
				if (result == null) result = caseKDocument(kDiagram);
				if (result == null) result = caseKConcept(kDiagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplekaosPackage.OBSTACLE: {
				Obstacle obstacle = (Obstacle)theEObject;
				T result = caseObstacle(obstacle);
				if (result == null) result = caseKRationale(obstacle);
				if (result == null) result = caseKConcept(obstacle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplekaosPackage.KAND_OR_REL: {
				KAndOrRel kAndOrRel = (KAndOrRel)theEObject;
				T result = caseKAndOrRel(kAndOrRel);
				if (result == null) result = caseKConcept(kAndOrRel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplekaosPackage.GOAL: {
				Goal goal = (Goal)theEObject;
				T result = caseGoal(goal);
				if (result == null) result = caseKRationale(goal);
				if (result == null) result = caseKConcept(goal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplekaosPackage.GREFINEMENT: {
				GRefinement gRefinement = (GRefinement)theEObject;
				T result = caseGRefinement(gRefinement);
				if (result == null) result = caseKAndOrRel(gRefinement);
				if (result == null) result = caseKConcept(gRefinement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplekaosPackage.OREFINEMENT: {
				ORefinement oRefinement = (ORefinement)theEObject;
				T result = caseORefinement(oRefinement);
				if (result == null) result = caseKAndOrRel(oRefinement);
				if (result == null) result = caseKConcept(oRefinement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplekaosPackage.ASSIGNMENT: {
				Assignment assignment = (Assignment)theEObject;
				T result = caseAssignment(assignment);
				if (result == null) result = caseKAndOrRel(assignment);
				if (result == null) result = caseKConcept(assignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplekaosPackage.KREFERENCE: {
				KReference kReference = (KReference)theEObject;
				T result = caseKReference(kReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplekaosPackage.KPACKAGE: {
				KPackage kPackage = (KPackage)theEObject;
				T result = caseKPackage(kPackage);
				if (result == null) result = caseKConcept(kPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplekaosPackage.KG_REFERENCE: {
				KGReference kgReference = (KGReference)theEObject;
				T result = caseKGReference(kgReference);
				if (result == null) result = caseKReference(kgReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplekaosPackage.KRATIONALE: {
				KRationale kRationale = (KRationale)theEObject;
				T result = caseKRationale(kRationale);
				if (result == null) result = caseKConcept(kRationale);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplekaosPackage.KRELATIONSHIP: {
				KRelationship kRelationship = (KRelationship)theEObject;
				T result = caseKRelationship(kRelationship);
				if (result == null) result = caseKConcept(kRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplekaosPackage.CONFLICT: {
				Conflict conflict = (Conflict)theEObject;
				T result = caseConflict(conflict);
				if (result == null) result = caseKRelationship(conflict);
				if (result == null) result = caseKConcept(conflict);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplekaosPackage.RESPONSIBILITY: {
				Responsibility responsibility = (Responsibility)theEObject;
				T result = caseResponsibility(responsibility);
				if (result == null) result = caseKAndOrRel(responsibility);
				if (result == null) result = caseKConcept(responsibility);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplekaosPackage.OBSTRUCTION: {
				Obstruction obstruction = (Obstruction)theEObject;
				T result = caseObstruction(obstruction);
				if (result == null) result = caseKRelationship(obstruction);
				if (result == null) result = caseKConcept(obstruction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplekaosPackage.RESOLUTION: {
				Resolution resolution = (Resolution)theEObject;
				T result = caseResolution(resolution);
				if (result == null) result = caseKRelationship(resolution);
				if (result == null) result = caseKConcept(resolution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplekaosPackage.AGENT: {
				Agent agent = (Agent)theEObject;
				T result = caseAgent(agent);
				if (result == null) result = caseKObject(agent);
				if (result == null) result = caseKConcept(agent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplekaosPackage.TEXT_DOCUMENT: {
				TextDocument textDocument = (TextDocument)theEObject;
				T result = caseTextDocument(textDocument);
				if (result == null) result = caseKDocument(textDocument);
				if (result == null) result = caseKConcept(textDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplekaosPackage.KREPORT: {
				KReport kReport = (KReport)theEObject;
				T result = caseKReport(kReport);
				if (result == null) result = caseKDocument(kReport);
				if (result == null) result = caseKConcept(kReport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KConcept</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KConcept</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKConcept(KConcept object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKObject(KObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KDocument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KDocument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKDocument(KDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KDiagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KDiagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKDiagram(KDiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Obstacle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Obstacle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObstacle(Obstacle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KAnd Or Rel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KAnd Or Rel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKAndOrRel(KAndOrRel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Goal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Goal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoal(Goal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GRefinement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GRefinement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGRefinement(GRefinement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ORefinement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ORefinement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseORefinement(ORefinement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignment(Assignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KReference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KReference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKReference(KReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KPackage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KPackage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKPackage(KPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KG Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KG Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKGReference(KGReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KRationale</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KRationale</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKRationale(KRationale object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KRelationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KRelationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKRelationship(KRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conflict</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConflict(Conflict object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Responsibility</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Responsibility</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponsibility(Responsibility object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Obstruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Obstruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObstruction(Obstruction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resolution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resolution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResolution(Resolution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgent(Agent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextDocument(TextDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KReport</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KReport</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKReport(KReport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SimplekaosSwitch
