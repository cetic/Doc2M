/**
 */
package simplekaos;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplekaos.Goal#getSonRef <em>Son Ref</em>}</li>
 *   <li>{@link simplekaos.Goal#getParentRef <em>Parent Ref</em>}</li>
 *   <li>{@link simplekaos.Goal#getAssignment <em>Assignment</em>}</li>
 *   <li>{@link simplekaos.Goal#getPriority <em>Priority</em>}</li>
 *   <li>{@link simplekaos.Goal#getConflict <em>Conflict</em>}</li>
 *   <li>{@link simplekaos.Goal#getObstruction <em>Obstruction</em>}</li>
 *   <li>{@link simplekaos.Goal#getResolution <em>Resolution</em>}</li>
 *   <li>{@link simplekaos.Goal#getCategory <em>Category</em>}</li>
 *   <li>{@link simplekaos.Goal#getResponsibility <em>Responsibility</em>}</li>
 *   <li>{@link simplekaos.Goal#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see simplekaos.SimplekaosPackage#getGoal()
 * @model
 * @generated
 */
public interface Goal extends KRationale {
	/**
	 * Returns the value of the '<em><b>Son Ref</b></em>' reference list.
	 * The list contents are of type {@link simplekaos.GRefinement}.
	 * It is bidirectional and its opposite is '{@link simplekaos.GRefinement#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Son Ref</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Son Ref</em>' reference list.
	 * @see simplekaos.SimplekaosPackage#getGoal_SonRef()
	 * @see simplekaos.GRefinement#getParent
	 * @model opposite="parent"
	 * @generated
	 */
	EList<GRefinement> getSonRef();

	/**
	 * Returns the value of the '<em><b>Parent Ref</b></em>' reference list.
	 * The list contents are of type {@link simplekaos.GRefinement}.
	 * It is bidirectional and its opposite is '{@link simplekaos.GRefinement#getSons <em>Sons</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Ref</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Ref</em>' reference list.
	 * @see simplekaos.SimplekaosPackage#getGoal_ParentRef()
	 * @see simplekaos.GRefinement#getSons
	 * @model opposite="sons"
	 * @generated
	 */
	EList<GRefinement> getParentRef();

	/**
	 * Returns the value of the '<em><b>Assignment</b></em>' reference list.
	 * The list contents are of type {@link simplekaos.Assignment}.
	 * It is bidirectional and its opposite is '{@link simplekaos.Assignment#getGoal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignment</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignment</em>' reference list.
	 * @see simplekaos.SimplekaosPackage#getGoal_Assignment()
	 * @see simplekaos.Assignment#getGoal
	 * @model opposite="goal"
	 * @generated
	 */
	EList<Assignment> getAssignment();

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(String)
	 * @see simplekaos.SimplekaosPackage#getGoal_Priority()
	 * @model
	 * @generated
	 */
	String getPriority();

	/**
	 * Sets the value of the '{@link simplekaos.Goal#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(String value);

	/**
	 * Returns the value of the '<em><b>Conflict</b></em>' reference list.
	 * The list contents are of type {@link simplekaos.Conflict}.
	 * It is bidirectional and its opposite is '{@link simplekaos.Conflict#getGoal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conflict</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conflict</em>' reference list.
	 * @see simplekaos.SimplekaosPackage#getGoal_Conflict()
	 * @see simplekaos.Conflict#getGoal
	 * @model opposite="goal"
	 * @generated
	 */
	EList<Conflict> getConflict();

	/**
	 * Returns the value of the '<em><b>Obstruction</b></em>' reference list.
	 * The list contents are of type {@link simplekaos.Obstruction}.
	 * It is bidirectional and its opposite is '{@link simplekaos.Obstruction#getGoal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Obstruction</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Obstruction</em>' reference list.
	 * @see simplekaos.SimplekaosPackage#getGoal_Obstruction()
	 * @see simplekaos.Obstruction#getGoal
	 * @model opposite="goal"
	 * @generated
	 */
	EList<Obstruction> getObstruction();

	/**
	 * Returns the value of the '<em><b>Resolution</b></em>' reference list.
	 * The list contents are of type {@link simplekaos.Resolution}.
	 * It is bidirectional and its opposite is '{@link simplekaos.Resolution#getGoal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolution</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolution</em>' reference list.
	 * @see simplekaos.SimplekaosPackage#getGoal_Resolution()
	 * @see simplekaos.Resolution#getGoal
	 * @model opposite="goal"
	 * @generated
	 */
	EList<Resolution> getResolution();

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see #setCategory(String)
	 * @see simplekaos.SimplekaosPackage#getGoal_Category()
	 * @model
	 * @generated
	 */
	String getCategory();

	/**
	 * Sets the value of the '{@link simplekaos.Goal#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(String value);

	/**
	 * Returns the value of the '<em><b>Responsibility</b></em>' reference list.
	 * The list contents are of type {@link simplekaos.Responsibility}.
	 * It is bidirectional and its opposite is '{@link simplekaos.Responsibility#getLeafGoal <em>Leaf Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsibility</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsibility</em>' reference list.
	 * @see simplekaos.SimplekaosPackage#getGoal_Responsibility()
	 * @see simplekaos.Responsibility#getLeafGoal
	 * @model opposite="leafGoal"
	 * @generated
	 */
	EList<Responsibility> getResponsibility();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link simplekaos.GoalType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see simplekaos.GoalType
	 * @see #setType(GoalType)
	 * @see simplekaos.SimplekaosPackage#getGoal_Type()
	 * @model
	 * @generated
	 */
	GoalType getType();

	/**
	 * Sets the value of the '{@link simplekaos.Goal#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see simplekaos.GoalType
	 * @see #getType()
	 * @generated
	 */
	void setType(GoalType value);

} // Goal
