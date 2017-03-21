/**
 */
package simplekaos.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import simplekaos.Conflict;
import simplekaos.Goal;
import simplekaos.SimplekaosPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conflict</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simplekaos.impl.ConflictImpl#getBoundaryCondition <em>Boundary Condition</em>}</li>
 *   <li>{@link simplekaos.impl.ConflictImpl#getGoal <em>Goal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConflictImpl extends KRelationshipImpl implements Conflict {
	/**
	 * The default value of the '{@link #getBoundaryCondition() <em>Boundary Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundaryCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String BOUNDARY_CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBoundaryCondition() <em>Boundary Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundaryCondition()
	 * @generated
	 * @ordered
	 */
	protected String boundaryCondition = BOUNDARY_CONDITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGoal() <em>Goal</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoal()
	 * @generated
	 * @ordered
	 */
	protected EList<Goal> goal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConflictImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplekaosPackage.Literals.CONFLICT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBoundaryCondition() {
		return boundaryCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoundaryCondition(String newBoundaryCondition) {
		String oldBoundaryCondition = boundaryCondition;
		boundaryCondition = newBoundaryCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplekaosPackage.CONFLICT__BOUNDARY_CONDITION, oldBoundaryCondition, boundaryCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Goal> getGoal() {
		if (goal == null) {
			goal = new EObjectWithInverseResolvingEList.ManyInverse<Goal>(Goal.class, this, SimplekaosPackage.CONFLICT__GOAL, SimplekaosPackage.GOAL__CONFLICT);
		}
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimplekaosPackage.CONFLICT__GOAL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGoal()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimplekaosPackage.CONFLICT__GOAL:
				return ((InternalEList<?>)getGoal()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimplekaosPackage.CONFLICT__BOUNDARY_CONDITION:
				return getBoundaryCondition();
			case SimplekaosPackage.CONFLICT__GOAL:
				return getGoal();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SimplekaosPackage.CONFLICT__BOUNDARY_CONDITION:
				setBoundaryCondition((String)newValue);
				return;
			case SimplekaosPackage.CONFLICT__GOAL:
				getGoal().clear();
				getGoal().addAll((Collection<? extends Goal>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SimplekaosPackage.CONFLICT__BOUNDARY_CONDITION:
				setBoundaryCondition(BOUNDARY_CONDITION_EDEFAULT);
				return;
			case SimplekaosPackage.CONFLICT__GOAL:
				getGoal().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SimplekaosPackage.CONFLICT__BOUNDARY_CONDITION:
				return BOUNDARY_CONDITION_EDEFAULT == null ? boundaryCondition != null : !BOUNDARY_CONDITION_EDEFAULT.equals(boundaryCondition);
			case SimplekaosPackage.CONFLICT__GOAL:
				return goal != null && !goal.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (BoundaryCondition: ");
		result.append(boundaryCondition);
		result.append(')');
		return result.toString();
	}

} //ConflictImpl
