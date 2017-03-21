/**
 */
package simplekaos;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KReference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplekaos.KReference#getConceptOf <em>Concept Of</em>}</li>
 *   <li>{@link simplekaos.KReference#getDocumentOf <em>Document Of</em>}</li>
 * </ul>
 *
 * @see simplekaos.SimplekaosPackage#getKReference()
 * @model abstract="true"
 * @generated
 */
public interface KReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Concept Of</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link simplekaos.KConcept#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concept Of</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concept Of</em>' reference.
	 * @see #setConceptOf(KConcept)
	 * @see simplekaos.SimplekaosPackage#getKReference_ConceptOf()
	 * @see simplekaos.KConcept#getReferences
	 * @model opposite="references"
	 * @generated
	 */
	KConcept getConceptOf();

	/**
	 * Sets the value of the '{@link simplekaos.KReference#getConceptOf <em>Concept Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concept Of</em>' reference.
	 * @see #getConceptOf()
	 * @generated
	 */
	void setConceptOf(KConcept value);

	/**
	 * Returns the value of the '<em><b>Document Of</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link simplekaos.KDocument#getContaining <em>Containing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Of</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Of</em>' container reference.
	 * @see #setDocumentOf(KDocument)
	 * @see simplekaos.SimplekaosPackage#getKReference_DocumentOf()
	 * @see simplekaos.KDocument#getContaining
	 * @model opposite="containing" transient="false"
	 * @generated
	 */
	KDocument getDocumentOf();

	/**
	 * Sets the value of the '{@link simplekaos.KReference#getDocumentOf <em>Document Of</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Of</em>' container reference.
	 * @see #getDocumentOf()
	 * @generated
	 */
	void setDocumentOf(KDocument value);

} // KReference
