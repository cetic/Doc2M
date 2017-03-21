/**
 */
package simplekaos;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conflict</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplekaos.Conflict#getBoundaryCondition <em>Boundary Condition</em>}</li>
 *   <li>{@link simplekaos.Conflict#getGoal <em>Goal</em>}</li>
 * </ul>
 *
 * @see simplekaos.SimplekaosPackage#getConflict()
 * @model
 * @generated
 */
public interface Conflict extends KRelationship {
	/**
	 * Returns the value of the '<em><b>Boundary Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boundary Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boundary Condition</em>' attribute.
	 * @see #setBoundaryCondition(String)
	 * @see simplekaos.SimplekaosPackage#getConflict_BoundaryCondition()
	 * @model
	 * @generated
	 */
	String getBoundaryCondition();

	/**
	 * Sets the value of the '{@link simplekaos.Conflict#getBoundaryCondition <em>Boundary Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boundary Condition</em>' attribute.
	 * @see #getBoundaryCondition()
	 * @generated
	 */
	void setBoundaryCondition(String value);

	/**
	 * Returns the value of the '<em><b>Goal</b></em>' reference list.
	 * The list contents are of type {@link simplekaos.Goal}.
	 * It is bidirectional and its opposite is '{@link simplekaos.Goal#getConflict <em>Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goal</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal</em>' reference list.
	 * @see simplekaos.SimplekaosPackage#getConflict_Goal()
	 * @see simplekaos.Goal#getConflict
	 * @model opposite="conflict" lower="2"
	 * @generated
	 */
	EList<Goal> getGoal();

} // Conflict
