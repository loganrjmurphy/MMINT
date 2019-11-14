/**
 */
package edu.toronto.cs.se.mmint3.mm.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import edu.toronto.cs.se.mmint3.mm.MMFactory;
import edu.toronto.cs.se.mmint3.mm.MMPackage;
import edu.toronto.cs.se.mmint3.mm.ModelInstance;

/**
 * This is the item provider adapter for a {@link edu.toronto.cs.se.mmint3.mm.ModelInstance} object. <!-- begin-user-doc
 * --> <!-- end-user-doc -->
 *
 * @generated
 */
public class ModelInstanceItemProvider extends ModelItemProvider {
  /**
   * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public ModelInstanceItemProvider(AdapterFactory adapterFactory) {
    super(adapterFactory);
  }

  /**
   * This returns the property descriptors for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
    if (this.itemPropertyDescriptors == null) {
      super.getPropertyDescriptors(object);

      addIPropertyDescriptor(object);
    }
    return this.itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the I feature. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  protected void addIPropertyDescriptor(Object object) {
    this.itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                                                             getResourceLocator(), getString(
                                                                                             "_UI_ModelInstance_i_feature"),
                                                             getString("_UI_PropertyDescriptor_description",
                                                                       "_UI_ModelInstance_i_feature",
                                                                       "_UI_ModelInstance_type"),
                                                             MMPackage.Literals.MODEL_INSTANCE__I, true, false, true,
                                                             null, null, null));
  }

  /**
   * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
   * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
   * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   *
   * @generated
   */
  @Override
  public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
    if (this.childrenFeatures == null) {
      super.getChildrenFeatures(object);
      this.childrenFeatures.add(MMPackage.Literals.MODEL_INSTANCE__I);
    }
    return this.childrenFeatures;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  protected EStructuralFeature getChildFeature(Object object, Object child) {
    // Check the type of the specified child object and return the proper feature to use for
    // adding (see {@link AddCommand}) it as a child.

    return super.getChildFeature(object, child);
  }

  /**
   * This returns ModelInstance.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public Object getImage(Object object) {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/ModelInstance"));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  protected boolean shouldComposeCreationImage() {
    return true;
  }

  /**
   * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public String getText(Object object) {
    return getString("_UI_ModelInstance_type");
  }

  /**
   * This handles model notifications by calling {@link #updateChildren} to update any cached children and by creating a
   * viewer notification, which it passes to {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public void notifyChanged(Notification notification) {
    updateChildren(notification);

    switch (notification.getFeatureID(ModelInstance.class)) {
    case MMPackage.MODEL_INSTANCE__I:
      fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
      return;
    }
    super.notifyChanged(notification);
  }

  /**
   * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children that can be created under
   * this object. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
    super.collectNewChildDescriptors(newChildDescriptors, object);

    newChildDescriptors.add(createChildParameter(MMPackage.Literals.MODEL_INSTANCE__I, MMFactory.eINSTANCE
                                                                                                          .createMMInstance()));
  }

}
