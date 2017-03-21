/**
 */
package simplekaos;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Obstacle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplekaos.Obstacle#getSonRef <em>Son Ref</em>}</li>
 *   <li>{@link simplekaos.Obstacle#getParentRef <em>Parent Ref</em>}</li>
 *   <li>{@link simplekaos.Obstacle#getObstruction <em>Obstruction</em>}</li>
 *   <li>{@link simplekaos.Obstacle#getResolution <em>Resolution</em>}</li>
 * </ul>
 *
 * @see simplekaos.SimplekaosPackage#getObstacle()
 * @model
 * @generated
 */
public interface Obstacle extends KRationale {
	/**
	 * Returns the value of the '<em><b>Son Ref</b></em>' reference list.
	 * The list contents are of type {@link simplekaos.ORefinement}.
	 * It is bidirectional and its opposite is '{@link simplekaos.ORefinement#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Son Ref</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Son Ref</em>' reference list.
	 * @see simplekaos.SimplekaosPackage#getObstacle_SonRef()
	 * @see simplekaos.ORefinement#getParent
	 * @model opposite="parent"
	 * @generated
	 */
	EList<ORefinement> getSonRef();

	/**
	 * Returns the value of the '<em><b>Parent Ref</b></em>' reference list.
	 * The list contents are of type {@link simplekaos.ORefinement}.
	 * It is bidirectional and its opposite is '{@link simplekaos.ORefinement#getSons <em>Sons</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Ref</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Ref</em>' reference list.
	 * @see simplekaos.SimplekaosPackage#getObstacle_ParentRef()
	 * @see simplekaos.ORefinement#getSons
	 * @model opposite="sons"
	 * @generated
	 */
	EList<ORefinement> getParentRef();

	/**
	 * Returns the value of the '<em><b>Obstruction</b></em>' reference list.
	 * The list contents are of type {@link simplekaos.Obstruction}.
	 * It is bidirectional and its opposite is '{@link simplekaos.Obstruction#getObstacle <em>Obstacle</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Obstruction</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Obstruction</em>' reference list.
	 * @see simplekaos.SimplekaosPackage#getObstacle_Obstruction()
	 * @see simplekaos.Obstruction#getObstacle
	 * @model opposite="obstacle"
	 * @generated
	 */
	EList<Obstruction> getObstruction();

	/**
	 * Returns the value of the '<em><b>Resolution</b></em>' reference list.
	 * The list contents are of type {@link simplekaos.Resolution}.
	 * It is bidirectional and its opposite is '{@link simplekaos.Resolution#getObstacle <em>Obstacle</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolution</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolution</em>' reference list.
	 * @see simplekaos.SimplekaosPackage#getObstacle_Resolution()
	 * @see simplekaos.Resolution#getObstacle
	 * @model opposite="obstacle"
	 * @generated
	 */
	EList<Resolution> getResolution();

} // Obstacle
