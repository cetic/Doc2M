/**
 */
package simplekaos;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KDocument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplekaos.KDocument#getContaining <em>Containing</em>}</li>
 * </ul>
 *
 * @see simplekaos.SimplekaosPackage#getKDocument()
 * @model abstract="true"
 * @generated
 */
public interface KDocument extends KConcept {
	/**
	 * Returns the value of the '<em><b>Containing</b></em>' containment reference list.
	 * The list contents are of type {@link simplekaos.KReference}.
	 * It is bidirectional and its opposite is '{@link simplekaos.KReference#getDocumentOf <em>Document Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containing</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containing</em>' containment reference list.
	 * @see simplekaos.SimplekaosPackage#getKDocument_Containing()
	 * @see simplekaos.KReference#getDocumentOf
	 * @model opposite="documentOf" containment="true"
	 * @generated
	 */
	EList<KReference> getContaining();

} // KDocument
