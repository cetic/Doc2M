/**
 */
package simplekaos;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GRefinement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplekaos.GRefinement#getParent <em>Parent</em>}</li>
 *   <li>{@link simplekaos.GRefinement#getSons <em>Sons</em>}</li>
 * </ul>
 *
 * @see simplekaos.SimplekaosPackage#getGRefinement()
 * @model
 * @generated
 */
public interface GRefinement extends KAndOrRel {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link simplekaos.Goal#getSonRef <em>Son Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(Goal)
	 * @see simplekaos.SimplekaosPackage#getGRefinement_Parent()
	 * @see simplekaos.Goal#getSonRef
	 * @model opposite="sonRef"
	 * @generated
	 */
	Goal getParent();

	/**
	 * Sets the value of the '{@link simplekaos.GRefinement#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Goal value);

	/**
	 * Returns the value of the '<em><b>Sons</b></em>' reference list.
	 * The list contents are of type {@link simplekaos.Goal}.
	 * It is bidirectional and its opposite is '{@link simplekaos.Goal#getParentRef <em>Parent Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sons</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sons</em>' reference list.
	 * @see simplekaos.SimplekaosPackage#getGRefinement_Sons()
	 * @see simplekaos.Goal#getParentRef
	 * @model opposite="parentRef"
	 * @generated
	 */
	EList<Goal> getSons();

} // GRefinement
