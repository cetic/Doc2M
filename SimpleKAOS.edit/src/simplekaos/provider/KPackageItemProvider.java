/**
 */
package simplekaos.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import simplekaos.KPackage;
import simplekaos.SimplekaosFactory;
import simplekaos.SimplekaosPackage;

/**
 * This is the item provider adapter for a {@link simplekaos.KPackage} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class KPackageItemProvider extends KConceptItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KPackageItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(SimplekaosPackage.Literals.KPACKAGE__CONTAINING);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns KPackage.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/KPackage"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((KPackage)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_KPackage_type") :
			getString("_UI_KPackage_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(KPackage.class)) {
			case SimplekaosPackage.KPACKAGE__CONTAINING:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(SimplekaosPackage.Literals.KPACKAGE__CONTAINING,
				 SimplekaosFactory.eINSTANCE.createKDiagram()));

		newChildDescriptors.add
			(createChildParameter
				(SimplekaosPackage.Literals.KPACKAGE__CONTAINING,
				 SimplekaosFactory.eINSTANCE.createObstacle()));

		newChildDescriptors.add
			(createChildParameter
				(SimplekaosPackage.Literals.KPACKAGE__CONTAINING,
				 SimplekaosFactory.eINSTANCE.createGoal()));

		newChildDescriptors.add
			(createChildParameter
				(SimplekaosPackage.Literals.KPACKAGE__CONTAINING,
				 SimplekaosFactory.eINSTANCE.createGRefinement()));

		newChildDescriptors.add
			(createChildParameter
				(SimplekaosPackage.Literals.KPACKAGE__CONTAINING,
				 SimplekaosFactory.eINSTANCE.createORefinement()));

		newChildDescriptors.add
			(createChildParameter
				(SimplekaosPackage.Literals.KPACKAGE__CONTAINING,
				 SimplekaosFactory.eINSTANCE.createAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(SimplekaosPackage.Literals.KPACKAGE__CONTAINING,
				 SimplekaosFactory.eINSTANCE.createKPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SimplekaosPackage.Literals.KPACKAGE__CONTAINING,
				 SimplekaosFactory.eINSTANCE.createConflict()));

		newChildDescriptors.add
			(createChildParameter
				(SimplekaosPackage.Literals.KPACKAGE__CONTAINING,
				 SimplekaosFactory.eINSTANCE.createResponsibility()));

		newChildDescriptors.add
			(createChildParameter
				(SimplekaosPackage.Literals.KPACKAGE__CONTAINING,
				 SimplekaosFactory.eINSTANCE.createObstruction()));

		newChildDescriptors.add
			(createChildParameter
				(SimplekaosPackage.Literals.KPACKAGE__CONTAINING,
				 SimplekaosFactory.eINSTANCE.createResolution()));

		newChildDescriptors.add
			(createChildParameter
				(SimplekaosPackage.Literals.KPACKAGE__CONTAINING,
				 SimplekaosFactory.eINSTANCE.createAgent()));

		newChildDescriptors.add
			(createChildParameter
				(SimplekaosPackage.Literals.KPACKAGE__CONTAINING,
				 SimplekaosFactory.eINSTANCE.createTextDocument()));

		newChildDescriptors.add
			(createChildParameter
				(SimplekaosPackage.Literals.KPACKAGE__CONTAINING,
				 SimplekaosFactory.eINSTANCE.createKReport()));
	}

}
