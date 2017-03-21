/**
 */
package simplekaos;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KPackage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplekaos.KPackage#getContaining <em>Containing</em>}</li>
 * </ul>
 *
 * @see simplekaos.SimplekaosPackage#getKPackage()
 * @model
 * @generated
 */
public interface KPackage extends KConcept {
	/**
	 * Returns the value of the '<em><b>Containing</b></em>' containment reference list.
	 * The list contents are of type {@link simplekaos.KConcept}.
	 * It is bidirectional and its opposite is '{@link simplekaos.KConcept#getPackageOf <em>Package Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containing</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containing</em>' containment reference list.
	 * @see simplekaos.SimplekaosPackage#getKPackage_Containing()
	 * @see simplekaos.KConcept#getPackageOf
	 * @model opposite="packageOf" containment="true"
	 * @generated
	 */
	EList<KConcept> getContaining();

} // KPackage
