/**
 */
package simplekaos;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KConcept</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplekaos.KConcept#getReferences <em>References</em>}</li>
 *   <li>{@link simplekaos.KConcept#getPackageOf <em>Package Of</em>}</li>
 *   <li>{@link simplekaos.KConcept#getName <em>Name</em>}</li>
 *   <li>{@link simplekaos.KConcept#getDef <em>Def</em>}</li>
 *   <li>{@link simplekaos.KConcept#getIssue <em>Issue</em>}</li>
 *   <li>{@link simplekaos.KConcept#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see simplekaos.SimplekaosPackage#getKConcept()
 * @model abstract="true"
 * @generated
 */
public interface KConcept extends EObject {
	/**
	 * Returns the value of the '<em><b>References</b></em>' reference list.
	 * The list contents are of type {@link simplekaos.KReference}.
	 * It is bidirectional and its opposite is '{@link simplekaos.KReference#getConceptOf <em>Concept Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' reference list.
	 * @see simplekaos.SimplekaosPackage#getKConcept_References()
	 * @see simplekaos.KReference#getConceptOf
	 * @model opposite="conceptOf"
	 * @generated
	 */
	EList<KReference> getReferences();

	/**
	 * Returns the value of the '<em><b>Package Of</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link simplekaos.KPackage#getContaining <em>Containing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Of</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Of</em>' container reference.
	 * @see #setPackageOf(KPackage)
	 * @see simplekaos.SimplekaosPackage#getKConcept_PackageOf()
	 * @see simplekaos.KPackage#getContaining
	 * @model opposite="containing" transient="false"
	 * @generated
	 */
	KPackage getPackageOf();

	/**
	 * Sets the value of the '{@link simplekaos.KConcept#getPackageOf <em>Package Of</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Of</em>' container reference.
	 * @see #getPackageOf()
	 * @generated
	 */
	void setPackageOf(KPackage value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see simplekaos.SimplekaosPackage#getKConcept_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link simplekaos.KConcept#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Def</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Def</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Def</em>' attribute.
	 * @see #setDef(String)
	 * @see simplekaos.SimplekaosPackage#getKConcept_Def()
	 * @model
	 * @generated
	 */
	String getDef();

	/**
	 * Sets the value of the '{@link simplekaos.KConcept#getDef <em>Def</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Def</em>' attribute.
	 * @see #getDef()
	 * @generated
	 */
	void setDef(String value);

	/**
	 * Returns the value of the '<em><b>Issue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issue</em>' attribute.
	 * @see #setIssue(String)
	 * @see simplekaos.SimplekaosPackage#getKConcept_Issue()
	 * @model
	 * @generated
	 */
	String getIssue();

	/**
	 * Sets the value of the '{@link simplekaos.KConcept#getIssue <em>Issue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue</em>' attribute.
	 * @see #getIssue()
	 * @generated
	 */
	void setIssue(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see simplekaos.SimplekaosPackage#getKConcept_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link simplekaos.KConcept#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // KConcept
