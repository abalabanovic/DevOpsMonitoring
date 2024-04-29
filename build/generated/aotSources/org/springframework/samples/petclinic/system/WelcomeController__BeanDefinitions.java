package org.springframework.samples.petclinic.system;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link WelcomeController}.
 */
public class WelcomeController__BeanDefinitions {
  /**
   * Get the bean definition for 'welcomeController'.
   */
  public static BeanDefinition getWelcomeControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(WelcomeController.class);
    beanDefinition.setInstanceSupplier(WelcomeController::new);
    return beanDefinition;
  }
}
