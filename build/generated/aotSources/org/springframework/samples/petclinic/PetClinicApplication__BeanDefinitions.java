package org.springframework.samples.petclinic;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link PetClinicApplication}.
 */
public class PetClinicApplication__BeanDefinitions {
  /**
   * Get the bean definition for 'petClinicApplication'.
   */
  public static BeanDefinition getPetClinicApplicationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(PetClinicApplication.class);
    beanDefinition.setTargetType(PetClinicApplication.class);
    ConfigurationClassUtils.initializeConfigurationClass(PetClinicApplication.class);
    beanDefinition.setInstanceSupplier(PetClinicApplication$$SpringCGLIB$$0::new);
    return beanDefinition;
  }
}
