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

import simplekaos.Agent;
import simplekaos.Goal;
import simplekaos.Responsibility;
import simplekaos.SimplekaosPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Responsibility</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simplekaos.impl.ResponsibilityImpl#getLeafGoal <em>Leaf Goal</em>}</li>
 *   <li>{@link simplekaos.impl.ResponsibilityImpl#getResponsible <em>Responsible</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResponsibilityImpl extends KAndOrRelImpl implements Responsibility {
	/**
	 * The cached value of the '{@link #getLeafGoal() <em>Leaf Goal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeafGoal()
	 * @generated
	 * @ordered
	 */
	protected Goal leafGoal;

	/**
	 * The cached value of the '{@link #getResponsible() <em>Responsible</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsible()
	 * @generated
	 * @ordered
	 */
	protected EList<Agent> responsible;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponsibilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplekaosPackage.Literals.RESPONSIBILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal getLeafGoal() {
		if (leafGoal != null && leafGoal.eIsProxy()) {
			InternalEObject oldLeafGoal = (InternalEObject)leafGoal;
			leafGoal = (Goal)eResolveProxy(oldLeafGoal);
			if (leafGoal != oldLeafGoal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimplekaosPackage.RESPONSIBILITY__LEAF_GOAL, oldLeafGoal, leafGoal));
			}
		}
		return leafGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal basicGetLeafGoal() {
		return leafGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeafGoal(Goal newLeafGoal, NotificationChain msgs) {
		Goal oldLeafGoal = leafGoal;
		leafGoal = newLeafGoal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimplekaosPackage.RESPONSIBILITY__LEAF_GOAL, oldLeafGoal, newLeafGoal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeafGoal(Goal newLeafGoal) {
		if (newLeafGoal != leafGoal) {
			NotificationChain msgs = null;
			if (leafGoal != null)
				msgs = ((InternalEObject)leafGoal).eInverseRemove(this, SimplekaosPackage.GOAL__RESPONSIBILITY, Goal.class, msgs);
			if (newLeafGoal != null)
				msgs = ((InternalEObject)newLeafGoal).eInverseAdd(this, SimplekaosPackage.GOAL__RESPONSIBILITY, Goal.class, msgs);
			msgs = basicSetLeafGoal(newLeafGoal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplekaosPackage.RESPONSIBILITY__LEAF_GOAL, newLeafGoal, newLeafGoal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Agent> getResponsible() {
		if (responsible == null) {
			responsible = new EObjectWithInverseResolvingEList.ManyInverse<Agent>(Agent.class, this, SimplekaosPackage.RESPONSIBILITY__RESPONSIBLE, SimplekaosPackage.AGENT__RESPONSIBILITY);
		}
		return responsible;
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
			case SimplekaosPackage.RESPONSIBILITY__LEAF_GOAL:
				if (leafGoal != null)
					msgs = ((InternalEObject)leafGoal).eInverseRemove(this, SimplekaosPackage.GOAL__RESPONSIBILITY, Goal.class, msgs);
				return basicSetLeafGoal((Goal)otherEnd, msgs);
			case SimplekaosPackage.RESPONSIBILITY__RESPONSIBLE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResponsible()).basicAdd(otherEnd, msgs);
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
			case SimplekaosPackage.RESPONSIBILITY__LEAF_GOAL:
				return basicSetLeafGoal(null, msgs);
			case SimplekaosPackage.RESPONSIBILITY__RESPONSIBLE:
				return ((InternalEList<?>)getResponsible()).basicRemove(otherEnd, msgs);
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
			case SimplekaosPackage.RESPONSIBILITY__LEAF_GOAL:
				if (resolve) return getLeafGoal();
				return basicGetLeafGoal();
			case SimplekaosPackage.RESPONSIBILITY__RESPONSIBLE:
				return getResponsible();
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
			case SimplekaosPackage.RESPONSIBILITY__LEAF_GOAL:
				setLeafGoal((Goal)newValue);
				return;
			case SimplekaosPackage.RESPONSIBILITY__RESPONSIBLE:
				getResponsible().clear();
				getResponsible().addAll((Collection<? extends Agent>)newValue);
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
			case SimplekaosPackage.RESPONSIBILITY__LEAF_GOAL:
				setLeafGoal((Goal)null);
				return;
			case SimplekaosPackage.RESPONSIBILITY__RESPONSIBLE:
				getResponsible().clear();
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
			case SimplekaosPackage.RESPONSIBILITY__LEAF_GOAL:
				return leafGoal != null;
			case SimplekaosPackage.RESPONSIBILITY__RESPONSIBLE:
				return responsible != null && !responsible.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResponsibilityImpl
