/**
 */
package simplekaos;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplekaos.Assignment#getGoal <em>Goal</em>}</li>
 *   <li>{@link simplekaos.Assignment#getAssignee <em>Assignee</em>}</li>
 * </ul>
 *
 * @see simplekaos.SimplekaosPackage#getAssignment()
 * @model
 * @generated
 */
public interface Assignment extends KAndOrRel {
	/**
	 * Returns the value of the '<em><b>Goal</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link simplekaos.Goal#getAssignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal</em>' reference.
	 * @see #setGoal(Goal)
	 * @see simplekaos.SimplekaosPackage#getAssignment_Goal()
	 * @see simplekaos.Goal#getAssignment
	 * @model opposite="assignment"
	 * @generated
	 */
	Goal getGoal();

	/**
	 * Sets the value of the '{@link simplekaos.Assignment#getGoal <em>Goal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal</em>' reference.
	 * @see #getGoal()
	 * @generated
	 */
	void setGoal(Goal value);

	/**
	 * Returns the value of the '<em><b>Assignee</b></em>' reference list.
	 * The list contents are of type {@link simplekaos.Agent}.
	 * It is bidirectional and its opposite is '{@link simplekaos.Agent#getAssignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignee</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignee</em>' reference list.
	 * @see simplekaos.SimplekaosPackage#getAssignment_Assignee()
	 * @see simplekaos.Agent#getAssignment
	 * @model opposite="assignment"
	 * @generated
	 */
	EList<Agent> getAssignee();

} // Assignment
