/**
 */
package simplekaos;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resolution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplekaos.Resolution#getGoal <em>Goal</em>}</li>
 *   <li>{@link simplekaos.Resolution#getObstacle <em>Obstacle</em>}</li>
 * </ul>
 *
 * @see simplekaos.SimplekaosPackage#getResolution()
 * @model
 * @generated
 */
public interface Resolution extends KRelationship {
	/**
	 * Returns the value of the '<em><b>Goal</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link simplekaos.Goal#getResolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal</em>' reference.
	 * @see #setGoal(Goal)
	 * @see simplekaos.SimplekaosPackage#getResolution_Goal()
	 * @see simplekaos.Goal#getResolution
	 * @model opposite="resolution"
	 * @generated
	 */
	Goal getGoal();

	/**
	 * Sets the value of the '{@link simplekaos.Resolution#getGoal <em>Goal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal</em>' reference.
	 * @see #getGoal()
	 * @generated
	 */
	void setGoal(Goal value);

	/**
	 * Returns the value of the '<em><b>Obstacle</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link simplekaos.Obstacle#getResolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Obstacle</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Obstacle</em>' reference.
	 * @see #setObstacle(Obstacle)
	 * @see simplekaos.SimplekaosPackage#getResolution_Obstacle()
	 * @see simplekaos.Obstacle#getResolution
	 * @model opposite="resolution"
	 * @generated
	 */
	Obstacle getObstacle();

	/**
	 * Sets the value of the '{@link simplekaos.Resolution#getObstacle <em>Obstacle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Obstacle</em>' reference.
	 * @see #getObstacle()
	 * @generated
	 */
	void setObstacle(Obstacle value);

} // Resolution
