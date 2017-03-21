/**
 */
package simplekaos.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import simplekaos.Goal;
import simplekaos.Obstacle;
import simplekaos.Resolution;
import simplekaos.SimplekaosPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resolution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simplekaos.impl.ResolutionImpl#getGoal <em>Goal</em>}</li>
 *   <li>{@link simplekaos.impl.ResolutionImpl#getObstacle <em>Obstacle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResolutionImpl extends KRelationshipImpl implements Resolution {
	/**
	 * The cached value of the '{@link #getGoal() <em>Goal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoal()
	 * @generated
	 * @ordered
	 */
	protected Goal goal;

	/**
	 * The cached value of the '{@link #getObstacle() <em>Obstacle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObstacle()
	 * @generated
	 * @ordered
	 */
	protected Obstacle obstacle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResolutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplekaosPackage.Literals.RESOLUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal getGoal() {
		if (goal != null && goal.eIsProxy()) {
			InternalEObject oldGoal = (InternalEObject)goal;
			goal = (Goal)eResolveProxy(oldGoal);
			if (goal != oldGoal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimplekaosPackage.RESOLUTION__GOAL, oldGoal, goal));
			}
		}
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal basicGetGoal() {
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGoal(Goal newGoal, NotificationChain msgs) {
		Goal oldGoal = goal;
		goal = newGoal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimplekaosPackage.RESOLUTION__GOAL, oldGoal, newGoal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoal(Goal newGoal) {
		if (newGoal != goal) {
			NotificationChain msgs = null;
			if (goal != null)
				msgs = ((InternalEObject)goal).eInverseRemove(this, SimplekaosPackage.GOAL__RESOLUTION, Goal.class, msgs);
			if (newGoal != null)
				msgs = ((InternalEObject)newGoal).eInverseAdd(this, SimplekaosPackage.GOAL__RESOLUTION, Goal.class, msgs);
			msgs = basicSetGoal(newGoal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplekaosPackage.RESOLUTION__GOAL, newGoal, newGoal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Obstacle getObstacle() {
		if (obstacle != null && obstacle.eIsProxy()) {
			InternalEObject oldObstacle = (InternalEObject)obstacle;
			obstacle = (Obstacle)eResolveProxy(oldObstacle);
			if (obstacle != oldObstacle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimplekaosPackage.RESOLUTION__OBSTACLE, oldObstacle, obstacle));
			}
		}
		return obstacle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Obstacle basicGetObstacle() {
		return obstacle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObstacle(Obstacle newObstacle, NotificationChain msgs) {
		Obstacle oldObstacle = obstacle;
		obstacle = newObstacle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimplekaosPackage.RESOLUTION__OBSTACLE, oldObstacle, newObstacle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObstacle(Obstacle newObstacle) {
		if (newObstacle != obstacle) {
			NotificationChain msgs = null;
			if (obstacle != null)
				msgs = ((InternalEObject)obstacle).eInverseRemove(this, SimplekaosPackage.OBSTACLE__RESOLUTION, Obstacle.class, msgs);
			if (newObstacle != null)
				msgs = ((InternalEObject)newObstacle).eInverseAdd(this, SimplekaosPackage.OBSTACLE__RESOLUTION, Obstacle.class, msgs);
			msgs = basicSetObstacle(newObstacle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplekaosPackage.RESOLUTION__OBSTACLE, newObstacle, newObstacle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimplekaosPackage.RESOLUTION__GOAL:
				if (goal != null)
					msgs = ((InternalEObject)goal).eInverseRemove(this, SimplekaosPackage.GOAL__RESOLUTION, Goal.class, msgs);
				return basicSetGoal((Goal)otherEnd, msgs);
			case SimplekaosPackage.RESOLUTION__OBSTACLE:
				if (obstacle != null)
					msgs = ((InternalEObject)obstacle).eInverseRemove(this, SimplekaosPackage.OBSTACLE__RESOLUTION, Obstacle.class, msgs);
				return basicSetObstacle((Obstacle)otherEnd, msgs);
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
			case SimplekaosPackage.RESOLUTION__GOAL:
				return basicSetGoal(null, msgs);
			case SimplekaosPackage.RESOLUTION__OBSTACLE:
				return basicSetObstacle(null, msgs);
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
			case SimplekaosPackage.RESOLUTION__GOAL:
				if (resolve) return getGoal();
				return basicGetGoal();
			case SimplekaosPackage.RESOLUTION__OBSTACLE:
				if (resolve) return getObstacle();
				return basicGetObstacle();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SimplekaosPackage.RESOLUTION__GOAL:
				setGoal((Goal)newValue);
				return;
			case SimplekaosPackage.RESOLUTION__OBSTACLE:
				setObstacle((Obstacle)newValue);
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
			case SimplekaosPackage.RESOLUTION__GOAL:
				setGoal((Goal)null);
				return;
			case SimplekaosPackage.RESOLUTION__OBSTACLE:
				setObstacle((Obstacle)null);
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
			case SimplekaosPackage.RESOLUTION__GOAL:
				return goal != null;
			case SimplekaosPackage.RESOLUTION__OBSTACLE:
				return obstacle != null;
		}
		return super.eIsSet(featureID);
	}

} //ResolutionImpl
