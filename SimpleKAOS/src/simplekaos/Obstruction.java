/**
 */
package simplekaos;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Obstruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplekaos.Obstruction#getGoal <em>Goal</em>}</li>
 *   <li>{@link simplekaos.Obstruction#getObstacle <em>Obstacle</em>}</li>
 * </ul>
 *
 * @see simplekaos.SimplekaosPackage#getObstruction()
 * @model
 * @generated
 */
public interface Obstruction extends KRelationship {
	/**
	 * Returns the value of the '<em><b>Goal</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link simplekaos.Goal#getObstruction <em>Obstruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal</em>' reference.
	 * @see #setGoal(Goal)
	 * @see simplekaos.SimplekaosPackage#getObstruction_Goal()
	 * @see simplekaos.Goal#getObstruction
	 * @model opposite="obstruction" required="true"
	 * @generated
	 */
	Goal getGoal();

	/**
	 * Sets the value of the '{@link simplekaos.Obstruction#getGoal <em>Goal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal</em>' reference.
	 * @see #getGoal()
	 * @generated
	 */
	void setGoal(Goal value);

	/**
	 * Returns the value of the '<em><b>Obstacle</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link simplekaos.Obstacle#getObstruction <em>Obstruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Obstacle</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Obstacle</em>' reference.
	 * @see #setObstacle(Obstacle)
	 * @see simplekaos.SimplekaosPackage#getObstruction_Obstacle()
	 * @see simplekaos.Obstacle#getObstruction
	 * @model opposite="obstruction" required="true"
	 * @generated
	 */
	Obstacle getObstacle();

	/**
	 * Sets the value of the '{@link simplekaos.Obstruction#getObstacle <em>Obstacle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Obstacle</em>' reference.
	 * @see #getObstacle()
	 * @generated
	 */
	void setObstacle(Obstacle value);

} // Obstruction
