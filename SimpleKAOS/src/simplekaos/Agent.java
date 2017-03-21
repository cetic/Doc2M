/**
 */
package simplekaos;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplekaos.Agent#getResponsibility <em>Responsibility</em>}</li>
 *   <li>{@link simplekaos.Agent#getAssignment <em>Assignment</em>}</li>
 *   <li>{@link simplekaos.Agent#getCategory <em>Category</em>}</li>
 * </ul>
 *
 * @see simplekaos.SimplekaosPackage#getAgent()
 * @model
 * @generated
 */
public interface Agent extends KObject {
	/**
	 * Returns the value of the '<em><b>Responsibility</b></em>' reference list.
	 * The list contents are of type {@link simplekaos.Responsibility}.
	 * It is bidirectional and its opposite is '{@link simplekaos.Responsibility#getResponsible <em>Responsible</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsibility</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsibility</em>' reference list.
	 * @see simplekaos.SimplekaosPackage#getAgent_Responsibility()
	 * @see simplekaos.Responsibility#getResponsible
	 * @model opposite="responsible"
	 * @generated
	 */
	EList<Responsibility> getResponsibility();

	/**
	 * Returns the value of the '<em><b>Assignment</b></em>' reference list.
	 * The list contents are of type {@link simplekaos.Assignment}.
	 * It is bidirectional and its opposite is '{@link simplekaos.Assignment#getAssignee <em>Assignee</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignment</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignment</em>' reference list.
	 * @see simplekaos.SimplekaosPackage#getAgent_Assignment()
	 * @see simplekaos.Assignment#getAssignee
	 * @model opposite="assignee"
	 * @generated
	 */
	EList<Assignment> getAssignment();

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * The default value is <code>"Undefined"</code>.
	 * The literals are from the enumeration {@link simplekaos.AgentCategory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see simplekaos.AgentCategory
	 * @see #setCategory(AgentCategory)
	 * @see simplekaos.SimplekaosPackage#getAgent_Category()
	 * @model default="Undefined"
	 * @generated
	 */
	AgentCategory getCategory();

	/**
	 * Sets the value of the '{@link simplekaos.Agent#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see simplekaos.AgentCategory
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(AgentCategory value);

} // Agent
