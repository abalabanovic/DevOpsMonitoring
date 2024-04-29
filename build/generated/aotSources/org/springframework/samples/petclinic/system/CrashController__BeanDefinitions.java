package org.springframework.samples.petclinic.system;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link CrashController}.
 */
public class CrashController__BeanDefinitions {
  /**
   * Get the bean definition for 'crashController'.
   */
  public static BeanDefinition getCrashControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CrashController.class);
    beanDefinition.setInstanceSupplier(CrashController::new);
    return beanDefinition;
  }
}
