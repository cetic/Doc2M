/**
 */
package simplekaos.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import simplekaos.ORefinement;
import simplekaos.Obstacle;
import simplekaos.Obstruction;
import simplekaos.Resolution;
import simplekaos.SimplekaosPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Obstacle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simplekaos.impl.ObstacleImpl#getSonRef <em>Son Ref</em>}</li>
 *   <li>{@link simplekaos.impl.ObstacleImpl#getParentRef <em>Parent Ref</em>}</li>
 *   <li>{@link simplekaos.impl.ObstacleImpl#getObstruction <em>Obstruction</em>}</li>
 *   <li>{@link simplekaos.impl.ObstacleImpl#getResolution <em>Resolution</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObstacleImpl extends KRationaleImpl implements Obstacle {
	/**
	 * The cached value of the '{@link #getSonRef() <em>Son Ref</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSonRef()
	 * @generated
	 * @ordered
	 */
	protected EList<ORefinement> sonRef;

	/**
	 * The cached value of the '{@link #getParentRef() <em>Parent Ref</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentRef()
	 * @generated
	 * @ordered
	 */
	protected EList<ORefinement> parentRef;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObstacleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplekaosPackage.Literals.OBSTACLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ORefinement> getSonRef() {
		if (sonRef == null) {
			sonRef = new EObjectWithInverseResolvingEList<ORefinement>(ORefinement.class, this, SimplekaosPackage.OBSTACLE__SON_REF, SimplekaosPackage.OREFINEMENT__PARENT);
		}
		return sonRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ORefinement> getParentRef() {
		if (parentRef == null) {
			parentRef = new EObjectWithInverseResolvingEList.ManyInverse<ORefinement>(ORefinement.class, this, SimplekaosPackage.OBSTACLE__PARENT_REF, SimplekaosPackage.OREFINEMENT__SONS);
		}
		return parentRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Obstruction> getObstruction() {
		if (obstruction == null) {
			obstruction = new EObjectWithInverseResolvingEList<Obstruction>(Obstruction.class, this, SimplekaosPackage.OBSTACLE__OBSTRUCTION, SimplekaosPackage.OBSTRUCTION__OBSTACLE);
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
			resolution = new EObjectWithInverseResolvingEList<Resolution>(Resolution.class, this, SimplekaosPackage.OBSTACLE__RESOLUTION, SimplekaosPackage.RESOLUTION__OBSTACLE);
		}
		return resolution;
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
			case SimplekaosPackage.OBSTACLE__SON_REF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSonRef()).basicAdd(otherEnd, msgs);
			case SimplekaosPackage.OBSTACLE__PARENT_REF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParentRef()).basicAdd(otherEnd, msgs);
			case SimplekaosPackage.OBSTACLE__OBSTRUCTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getObstruction()).basicAdd(otherEnd, msgs);
			case SimplekaosPackage.OBSTACLE__RESOLUTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResolution()).basicAdd(otherEnd, msgs);
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
			case SimplekaosPackage.OBSTACLE__SON_REF:
				return ((InternalEList<?>)getSonRef()).basicRemove(otherEnd, msgs);
			case SimplekaosPackage.OBSTACLE__PARENT_REF:
				return ((InternalEList<?>)getParentRef()).basicRemove(otherEnd, msgs);
			case SimplekaosPackage.OBSTACLE__OBSTRUCTION:
				return ((InternalEList<?>)getObstruction()).basicRemove(otherEnd, msgs);
			case SimplekaosPackage.OBSTACLE__RESOLUTION:
				return ((InternalEList<?>)getResolution()).basicRemove(otherEnd, msgs);
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
			case SimplekaosPackage.OBSTACLE__SON_REF:
				return getSonRef();
			case SimplekaosPackage.OBSTACLE__PARENT_REF:
				return getParentRef();
			case SimplekaosPackage.OBSTACLE__OBSTRUCTION:
				return getObstruction();
			case SimplekaosPackage.OBSTACLE__RESOLUTION:
				return getResolution();
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
			case SimplekaosPackage.OBSTACLE__SON_REF:
				getSonRef().clear();
				getSonRef().addAll((Collection<? extends ORefinement>)newValue);
				return;
			case SimplekaosPackage.OBSTACLE__PARENT_REF:
				getParentRef().clear();
				getParentRef().addAll((Collection<? extends ORefinement>)newValue);
				return;
			case SimplekaosPackage.OBSTACLE__OBSTRUCTION:
				getObstruction().clear();
				getObstruction().addAll((Collection<? extends Obstruction>)newValue);
				return;
			case SimplekaosPackage.OBSTACLE__RESOLUTION:
				getResolution().clear();
				getResolution().addAll((Collection<? extends Resolution>)newValue);
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
			case SimplekaosPackage.OBSTACLE__SON_REF:
				getSonRef().clear();
				return;
			case SimplekaosPackage.OBSTACLE__PARENT_REF:
				getParentRef().clear();
				return;
			case SimplekaosPackage.OBSTACLE__OBSTRUCTION:
				getObstruction().clear();
				return;
			case SimplekaosPackage.OBSTACLE__RESOLUTION:
				getResolution().clear();
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
			case SimplekaosPackage.OBSTACLE__SON_REF:
				return sonRef != null && !sonRef.isEmpty();
			case SimplekaosPackage.OBSTACLE__PARENT_REF:
				return parentRef != null && !parentRef.isEmpty();
			case SimplekaosPackage.OBSTACLE__OBSTRUCTION:
				return obstruction != null && !obstruction.isEmpty();
			case SimplekaosPackage.OBSTACLE__RESOLUTION:
				return resolution != null && !resolution.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ObstacleImpl
