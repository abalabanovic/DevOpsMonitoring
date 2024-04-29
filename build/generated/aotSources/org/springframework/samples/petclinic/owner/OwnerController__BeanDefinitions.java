package org.springframework.samples.petclinic.owner;

import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link OwnerController}.
 */
public class OwnerController__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'ownerController'.
   */
  private static BeanInstanceSupplier<OwnerController> getOwnerControllerInstanceSupplier() {
    return BeanInstanceSupplier.<OwnerController>forConstructor(OwnerRepository.class)
            .withGenerator((registeredBean, args) -> new OwnerController(args.get(0)));
  }

  /**
   * Get the bean definition for 'ownerController'.
   */
  public static BeanDefinition getOwnerControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(OwnerController.class);
    beanDefinition.setInstanceSupplier(getOwnerControllerInstanceSupplier());
    return beanDefinition;
  }
}
