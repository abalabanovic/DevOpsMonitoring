package org.springframework.samples.petclinic.owner;

import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link VisitController}.
 */
public class VisitController__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'visitController'.
   */
  private static BeanInstanceSupplier<VisitController> getVisitControllerInstanceSupplier() {
    return BeanInstanceSupplier.<VisitController>forConstructor(OwnerRepository.class)
            .withGenerator((registeredBean, args) -> new VisitController(args.get(0)));
  }

  /**
   * Get the bean definition for 'visitController'.
   */
  public static BeanDefinition getVisitControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(VisitController.class);
    beanDefinition.setInstanceSupplier(getVisitControllerInstanceSupplier());
    return beanDefinition;
  }
}
