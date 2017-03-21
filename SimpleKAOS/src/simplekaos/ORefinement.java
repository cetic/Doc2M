/**
 */
package simplekaos;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ORefinement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplekaos.ORefinement#getParent <em>Parent</em>}</li>
 *   <li>{@link simplekaos.ORefinement#getSons <em>Sons</em>}</li>
 * </ul>
 *
 * @see simplekaos.SimplekaosPackage#getORefinement()
 * @model
 * @generated
 */
public interface ORefinement extends KAndOrRel {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link simplekaos.Obstacle#getSonRef <em>Son Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(Obstacle)
	 * @see simplekaos.SimplekaosPackage#getORefinement_Parent()
	 * @see simplekaos.Obstacle#getSonRef
	 * @model opposite="sonRef"
	 * @generated
	 */
	Obstacle getParent();

	/**
	 * Sets the value of the '{@link simplekaos.ORefinement#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Obstacle value);

	/**
	 * Returns the value of the '<em><b>Sons</b></em>' reference list.
	 * The list contents are of type {@link simplekaos.Obstacle}.
	 * It is bidirectional and its opposite is '{@link simplekaos.Obstacle#getParentRef <em>Parent Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sons</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sons</em>' reference list.
	 * @see simplekaos.SimplekaosPackage#getORefinement_Sons()
	 * @see simplekaos.Obstacle#getParentRef
	 * @model opposite="parentRef"
	 * @generated
	 */
	EList<Obstacle> getSons();

} // ORefinement
