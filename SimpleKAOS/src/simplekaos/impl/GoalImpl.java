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

import simplekaos.Assignment;
import simplekaos.Conflict;
import simplekaos.GRefinement;
import simplekaos.Goal;
import simplekaos.GoalType;
import simplekaos.Obstruction;
import simplekaos.Resolution;
import simplekaos.Responsibility;
import simplekaos.SimplekaosPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simplekaos.impl.GoalImpl#getSonRef <em>Son Ref</em>}</li>
 *   <li>{@link simplekaos.impl.GoalImpl#getParentRef <em>Parent Ref</em>}</li>
 *   <li>{@link simplekaos.impl.GoalImpl#getAssignment <em>Assignment</em>}</li>
 *   <li>{@link simplekaos.impl.GoalImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link simplekaos.impl.GoalImpl#getConflict <em>Conflict</em>}</li>
 *   <li>{@link simplekaos.impl.GoalImpl#getObstruction <em>Obstruction</em>}</li>
 *   <li>{@link simplekaos.impl.GoalImpl#getResolution <em>Resolution</em>}</li>
 *   <li>{@link simplekaos.impl.GoalImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link simplekaos.impl.GoalImpl#getResponsibility <em>Responsibility</em>}</li>
 *   <li>{@link simplekaos.impl.GoalImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GoalImpl extends KRationaleImpl implements Goal {
	/**
	 * The cached value of the '{@link #getSonRef() <em>Son Ref</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSonRef()
	 * @generated
	 * @ordered
	 */
	protected EList<GRefinement> sonRef;

	/**
	 * The cached value of the '{@link #getParentRef() <em>Parent Ref</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentRef()
	 * @generated
	 * @ordered
	 */
	protected EList<GRefinement> parentRef;

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
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected String priority = PRIORITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConflict() <em>Conflict</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConflict()
	 * @generated
	 * @ordered
	 */
	protected EList<Conflict> conflict;

	/**
	 * The cached value of the '{@link #getObstruction() <em>Obstruction</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObstruction()
	 * @generated
	 * @ordered
	 */
	protected EList<Obstruction> obstruction;

	/**
	 * The cached value of the '{@link #getResolution() <em>Resolution</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolution()
	 * @generated
	 * @ordered
	 */
	protected EList<Resolution> resolution;

	/**
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected String category = CATEGORY_EDEFAULT;

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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final GoalType TYPE_EDEFAULT = GoalType.GOAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected GoalType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplekaosPackage.Literals.GOAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GRefinement> getSonRef() {
		if (sonRef == null) {
			sonRef = new EObjectWithInverseResolvingEList<GRefinement>(GRefinement.class, this, SimplekaosPackage.GOAL__SON_REF, SimplekaosPackage.GREFINEMENT__PARENT);
		}
		return sonRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GRefinement> getParentRef() {
		if (parentRef == null) {
			parentRef = new EObjectWithInverseResolvingEList.ManyInverse<GRefinement>(GRefinement.class, this, SimplekaosPackage.GOAL__PARENT_REF, SimplekaosPackage.GREFINEMENT__SONS);
		}
		return parentRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Assignment> getAssignment() {
		if (assignment == null) {
			assignment = new EObjectWithInverseResolvingEList<Assignment>(Assignment.class, this, SimplekaosPackage.GOAL__ASSIGNMENT, SimplekaosPackage.ASSIGNMENT__GOAL);
		}
		return assignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(String newPriority) {
		String oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplekaosPackage.GOAL__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Conflict> getConflict() {
		if (conflict == null) {
			conflict = new EObjectWithInverseResolvingEList.ManyInverse<Conflict>(Conflict.class, this, SimplekaosPackage.GOAL__CONFLICT, SimplekaosPackage.CONFLICT__GOAL);
		}
		return conflict;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Obstruction> getObstruction() {
		if (obstruction == null) {
			obstruction = new EObjectWithInverseResolvingEList<Obstruction>(Obstruction.class, this, SimplekaosPackage.GOAL__OBSTRUCTION, SimplekaosPackage.OBSTRUCTION__GOAL);
		}
		return obstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resolution> getResolution() {
		if (resolution == null) {
			resolution = new EObjectWithInverseResolvingEList<Resolution>(Resolution.class, this, SimplekaosPackage.GOAL__RESOLUTION, SimplekaosPackage.RESOLUTION__GOAL);
		}
		return resolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(String newCategory) {
		String oldCategory = category;
		category = newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplekaosPackage.GOAL__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Responsibility> getResponsibility() {
		if (responsibility == null) {
			responsibility = new EObjectWithInverseResolvingEList<Responsibility>(Responsibility.class, this, SimplekaosPackage.GOAL__RESPONSIBILITY, SimplekaosPackage.RESPONSIBILITY__LEAF_GOAL);
		}
		return responsibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(GoalType newType) {
		GoalType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplekaosPackage.GOAL__TYPE, oldType, type));
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
			case SimplekaosPackage.GOAL__SON_REF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSonRef()).basicAdd(otherEnd, msgs);
			case SimplekaosPackage.GOAL__PARENT_REF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParentRef()).basicAdd(otherEnd, msgs);
			case SimplekaosPackage.GOAL__ASSIGNMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssignment()).basicAdd(otherEnd, msgs);
			case SimplekaosPackage.GOAL__CONFLICT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConflict()).basicAdd(otherEnd, msgs);
			case SimplekaosPackage.GOAL__OBSTRUCTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getObstruction()).basicAdd(otherEnd, msgs);
			case SimplekaosPackage.GOAL__RESOLUTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResolution()).basicAdd(otherEnd, msgs);
			case SimplekaosPackage.GOAL__RESPONSIBILITY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResponsibility()).basicAdd(otherEnd, msgs);
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
			case SimplekaosPackage.GOAL__SON_REF:
				return ((InternalEList<?>)getSonRef()).basicRemove(otherEnd, msgs);
			case SimplekaosPackage.GOAL__PARENT_REF:
				return ((InternalEList<?>)getParentRef()).basicRemove(otherEnd, msgs);
			case SimplekaosPackage.GOAL__ASSIGNMENT:
				return ((InternalEList<?>)getAssignment()).basicRemove(otherEnd, msgs);
			case SimplekaosPackage.GOAL__CONFLICT:
				return ((InternalEList<?>)getConflict()).basicRemove(otherEnd, msgs);
			case SimplekaosPackage.GOAL__OBSTRUCTION:
				return ((InternalEList<?>)getObstruction()).basicRemove(otherEnd, msgs);
			case SimplekaosPackage.GOAL__RESOLUTION:
				return ((InternalEList<?>)getResolution()).basicRemove(otherEnd, msgs);
			case SimplekaosPackage.GOAL__RESPONSIBILITY:
				return ((InternalEList<?>)getResponsibility()).basicRemove(otherEnd, msgs);
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
			case SimplekaosPackage.GOAL__SON_REF:
				return getSonRef();
			case SimplekaosPackage.GOAL__PARENT_REF:
				return getParentRef();
			case SimplekaosPackage.GOAL__ASSIGNMENT:
				return getAssignment();
			case SimplekaosPackage.GOAL__PRIORITY:
				return getPriority();
			case SimplekaosPackage.GOAL__CONFLICT:
				return getConflict();
			case SimplekaosPackage.GOAL__OBSTRUCTION:
				return getObstruction();
			case SimplekaosPackage.GOAL__RESOLUTION:
				return getResolution();
			case SimplekaosPackage.GOAL__CATEGORY:
				return getCategory();
			case SimplekaosPackage.GOAL__RESPONSIBILITY:
				return getResponsibility();
			case SimplekaosPackage.GOAL__TYPE:
				return getType();
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
			case SimplekaosPackage.GOAL__SON_REF:
				getSonRef().clear();
				getSonRef().addAll((Collection<? extends GRefinement>)newValue);
				return;
			case SimplekaosPackage.GOAL__PARENT_REF:
				getParentRef().clear();
				getParentRef().addAll((Collection<? extends GRefinement>)newValue);
				return;
			case SimplekaosPackage.GOAL__ASSIGNMENT:
				getAssignment().clear();
				getAssignment().addAll((Collection<? extends Assignment>)newValue);
				return;
			case SimplekaosPackage.GOAL__PRIORITY:
				setPriority((String)newValue);
				return;
			case SimplekaosPackage.GOAL__CONFLICT:
				getConflict().clear();
				getConflict().addAll((Collection<? extends Conflict>)newValue);
				return;
			case SimplekaosPackage.GOAL__OBSTRUCTION:
				getObstruction().clear();
				getObstruction().addAll((Collection<? extends Obstruction>)newValue);
				return;
			case SimplekaosPackage.GOAL__RESOLUTION:
				getResolution().clear();
				getResolution().addAll((Collection<? extends Resolution>)newValue);
				return;
			case SimplekaosPackage.GOAL__CATEGORY:
				setCategory((String)newValue);
				return;
			case SimplekaosPackage.GOAL__RESPONSIBILITY:
				getResponsibility().clear();
				getResponsibility().addAll((Collection<? extends Responsibility>)newValue);
				return;
			case SimplekaosPackage.GOAL__TYPE:
				setType((GoalType)newValue);
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
			case SimplekaosPackage.GOAL__SON_REF:
				getSonRef().clear();
				return;
			case SimplekaosPackage.GOAL__PARENT_REF:
				getParentRef().clear();
				return;
			case SimplekaosPackage.GOAL__ASSIGNMENT:
				getAssignment().clear();
				return;
			case SimplekaosPackage.GOAL__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case SimplekaosPackage.GOAL__CONFLICT:
				getConflict().clear();
				return;
			case SimplekaosPackage.GOAL__OBSTRUCTION:
				getObstruction().clear();
				return;
			case SimplekaosPackage.GOAL__RESOLUTION:
				getResolution().clear();
				return;
			case SimplekaosPackage.GOAL__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
				return;
			case SimplekaosPackage.GOAL__RESPONSIBILITY:
				getResponsibility().clear();
				return;
			case SimplekaosPackage.GOAL__TYPE:
				setType(TYPE_EDEFAULT);
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
			case SimplekaosPackage.GOAL__SON_REF:
				return sonRef != null && !sonRef.isEmpty();
			case SimplekaosPackage.GOAL__PARENT_REF:
				return parentRef != null && !parentRef.isEmpty();
			case SimplekaosPackage.GOAL__ASSIGNMENT:
				return assignment != null && !assignment.isEmpty();
			case SimplekaosPackage.GOAL__PRIORITY:
				return PRIORITY_EDEFAULT == null ? priority != null : !PRIORITY_EDEFAULT.equals(priority);
			case SimplekaosPackage.GOAL__CONFLICT:
				return conflict != null && !conflict.isEmpty();
			case SimplekaosPackage.GOAL__OBSTRUCTION:
				return obstruction != null && !obstruction.isEmpty();
			case SimplekaosPackage.GOAL__RESOLUTION:
				return resolution != null && !resolution.isEmpty();
			case SimplekaosPackage.GOAL__CATEGORY:
				return CATEGORY_EDEFAULT == null ? category != null : !CATEGORY_EDEFAULT.equals(category);
			case SimplekaosPackage.GOAL__RESPONSIBILITY:
				return responsibility != null && !responsibility.isEmpty();
			case SimplekaosPackage.GOAL__TYPE:
				return type != TYPE_EDEFAULT;
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
		result.append(" (Priority: ");
		result.append(priority);
		result.append(", Category: ");
		result.append(category);
		result.append(", Type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //GoalImpl
