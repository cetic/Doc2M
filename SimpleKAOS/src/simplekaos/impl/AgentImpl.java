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
import simplekaos.AgentCategory;
import simplekaos.Assignment;
import simplekaos.Responsibility;
import simplekaos.SimplekaosPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simplekaos.impl.AgentImpl#getResponsibility <em>Responsibility</em>}</li>
 *   <li>{@link simplekaos.impl.AgentImpl#getAssignment <em>Assignment</em>}</li>
 *   <li>{@link simplekaos.impl.AgentImpl#getCategory <em>Category</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AgentImpl extends KObjectImpl implements Agent {
	/**
	 * The cached value of the '{@link #getResponsibility() <em>Responsibility</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsibility()
	 * @generated
	 * @ordered
	 */
	protected EList<Responsibility> responsibility;

	/**
	 * The cached value of the '{@link #getAssignment() <em>Assignment</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignment()
	 * @generated
	 * @ordered
	 */
	protected EList<Assignment> assignment;

	/**
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final AgentCategory CATEGORY_EDEFAULT = AgentCategory.UNDEFINED;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected AgentCategory category = CATEGORY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplekaosPackage.Literals.AGENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Responsibility> getResponsibility() {
		if (responsibility == null) {
			responsibility = new EObjectWithInverseResolvingEList.ManyInverse<Responsibility>(Responsibility.class, this, SimplekaosPackage.AGENT__RESPONSIBILITY, SimplekaosPackage.RESPONSIBILITY__RESPONSIBLE);
		}
		return responsibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Assignment> getAssignment() {
		if (assignment == null) {
			assignment = new EObjectWithInverseResolvingEList.ManyInverse<Assignment>(Assignment.class, this, SimplekaosPackage.AGENT__ASSIGNMENT, SimplekaosPackage.ASSIGNMENT__ASSIGNEE);
		}
		return assignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgentCategory getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(AgentCategory newCategory) {
		AgentCategory oldCategory = category;
		category = newCategory == null ? CATEGORY_EDEFAULT : newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplekaosPackage.AGENT__CATEGORY, oldCategory, category));
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
			case SimplekaosPackage.AGENT__RESPONSIBILITY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResponsibility()).basicAdd(otherEnd, msgs);
			case SimplekaosPackage.AGENT__ASSIGNMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssignment()).basicAdd(otherEnd, msgs);
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
			case SimplekaosPackage.AGENT__RESPONSIBILITY:
				return ((InternalEList<?>)getResponsibility()).basicRemove(otherEnd, msgs);
			case SimplekaosPackage.AGENT__ASSIGNMENT:
				return ((InternalEList<?>)getAssignment()).basicRemove(otherEnd, msgs);
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
			case SimplekaosPackage.AGENT__RESPONSIBILITY:
				return getResponsibility();
			case SimplekaosPackage.AGENT__ASSIGNMENT:
				return getAssignment();
			case SimplekaosPackage.AGENT__CATEGORY:
				return getCategory();
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
			case SimplekaosPackage.AGENT__RESPONSIBILITY:
				getResponsibility().clear();
				getResponsibility().addAll((Collection<? extends Responsibility>)newValue);
				return;
			case SimplekaosPackage.AGENT__ASSIGNMENT:
				getAssignment().clear();
				getAssignment().addAll((Collection<? extends Assignment>)newValue);
				return;
			case SimplekaosPackage.AGENT__CATEGORY:
				setCategory((AgentCategory)newValue);
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
			case SimplekaosPackage.AGENT__RESPONSIBILITY:
				getResponsibility().clear();
				return;
			case SimplekaosPackage.AGENT__ASSIGNMENT:
				getAssignment().clear();
				return;
			case SimplekaosPackage.AGENT__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
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
			case SimplekaosPackage.AGENT__RESPONSIBILITY:
				return responsibility != null && !responsibility.isEmpty();
			case SimplekaosPackage.AGENT__ASSIGNMENT:
				return assignment != null && !assignment.isEmpty();
			case SimplekaosPackage.AGENT__CATEGORY:
				return category != CATEGORY_EDEFAULT;
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
		result.append(" (Category: ");
		result.append(category);
		result.append(')');
		return result.toString();
	}

} //AgentImpl
