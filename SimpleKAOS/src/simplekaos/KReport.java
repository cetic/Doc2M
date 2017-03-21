/**
 */
package simplekaos;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KReport</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplekaos.KReport#getContained <em>Contained</em>}</li>
 * </ul>
 *
 * @see simplekaos.SimplekaosPackage#getKReport()
 * @model
 * @generated
 */
public interface KReport extends KDocument {
	/**
	 * Returns the value of the '<em><b>Contained</b></em>' reference list.
	 * The list contents are of type {@link simplekaos.KDocument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained</em>' reference list.
	 * @see simplekaos.SimplekaosPackage#getKReport_Contained()
	 * @model
	 * @generated
	 */
	EList<KDocument> getContained();

} // KReport
