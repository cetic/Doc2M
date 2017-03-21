/**
 */
package simplekaos;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Responsibility</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplekaos.Responsibility#getLeafGoal <em>Leaf Goal</em>}</li>
 *   <li>{@link simplekaos.Responsibility#getResponsible <em>Responsible</em>}</li>
 * </ul>
 *
 * @see simplekaos.SimplekaosPackage#getResponsibility()
 * @model
 * @generated
 */
public interface Responsibility extends KAndOrRel {
	/**
	 * Returns the value of the '<em><b>Leaf Goal</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link simplekaos.Goal#getResponsibility <em>Responsibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Leaf Goal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leaf Goal</em>' reference.
	 * @see #setLeafGoal(Goal)
	 * @see simplekaos.SimplekaosPackage#getResponsibility_LeafGoal()
	 * @see simplekaos.Goal#getResponsibility
	 * @model opposite="responsibility"
	 * @generated
	 */
	Goal getLeafGoal();

	/**
	 * Sets the value of the '{@link simplekaos.Responsibility#getLeafGoal <em>Leaf Goal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leaf Goal</em>' reference.
	 * @see #getLeafGoal()
	 * @generated
	 */
	void setLeafGoal(Goal value);

	/**
	 * Returns the value of the '<em><b>Responsible</b></em>' reference list.
	 * The list contents are of type {@link simplekaos.Agent}.
	 * It is bidirectional and its opposite is '{@link simplekaos.Agent#getResponsibility <em>Responsibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsible</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible</em>' reference list.
	 * @see simplekaos.SimplekaosPackage#getResponsibility_Responsible()
	 * @see simplekaos.Agent#getResponsibility
	 * @model opposite="responsibility"
	 * @generated
	 */
	EList<Agent> getResponsible();

} // Responsibility
