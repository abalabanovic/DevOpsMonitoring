package org.springframework.samples.petclinic.owner;

import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link PetTypeFormatter}.
 */
public class PetTypeFormatter__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'petTypeFormatter'.
   */
  private static BeanInstanceSupplier<PetTypeFormatter> getPetTypeFormatterInstanceSupplier() {
    return BeanInstanceSupplier.<PetTypeFormatter>forConstructor(OwnerRepository.class)
            .withGenerator((registeredBean, args) -> new PetTypeFormatter(args.get(0)));
  }

  /**
   * Get the bean definition for 'petTypeFormatter'.
   */
  public static BeanDefinition getPetTypeFormatterBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(PetTypeFormatter.class);
    beanDefinition.setInstanceSupplier(getPetTypeFormatterInstanceSupplier());
    return beanDefinition;
  }
}
