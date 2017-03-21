/**
 */
package simplekaos;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplekaos.TextDocument#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see simplekaos.SimplekaosPackage#getTextDocument()
 * @model
 * @generated
 */
public interface TextDocument extends KDocument {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(byte[])
	 * @see simplekaos.SimplekaosPackage#getTextDocument_Content()
	 * @model
	 * @generated
	 */
	byte[] getContent();

	/**
	 * Sets the value of the '{@link simplekaos.TextDocument#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(byte[] value);

} // TextDocument
