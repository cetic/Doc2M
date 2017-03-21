/**
 */
package simplekaos;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KAnd Or Rel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplekaos.KAndOrRel#getSysRef <em>Sys Ref</em>}</li>
 * </ul>
 *
 * @see simplekaos.SimplekaosPackage#getKAndOrRel()
 * @model abstract="true"
 * @generated
 */
public interface KAndOrRel extends KConcept {
	/**
	 * Returns the value of the '<em><b>Sys Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sys Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sys Ref</em>' attribute.
	 * @see #setSysRef(String)
	 * @see simplekaos.SimplekaosPackage#getKAndOrRel_SysRef()
	 * @model
	 * @generated
	 */
	String getSysRef();

	/**
	 * Sets the value of the '{@link simplekaos.KAndOrRel#getSysRef <em>Sys Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sys Ref</em>' attribute.
	 * @see #getSysRef()
	 * @generated
	 */
	void setSysRef(String value);

} // KAndOrRel
