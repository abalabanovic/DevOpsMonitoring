package org.springframework.samples.petclinic.system;

import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.autoconfigure.cache.JCacheManagerCustomizer;

/**
 * Bean definitions for {@link CacheConfiguration}.
 */
public class CacheConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'cacheConfiguration'.
   */
  public static BeanDefinition getCacheConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CacheConfiguration.class);
    beanDefinition.setInstanceSupplier(CacheConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'petclinicCacheConfigurationCustomizer'.
   */
  private static BeanInstanceSupplier<JCacheManagerCustomizer> getPetclinicCacheConfigurationCustomizerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<JCacheManagerCustomizer>forFactoryMethod(CacheConfiguration.class, "petclinicCacheConfigurationCustomizer")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(CacheConfiguration.class).petclinicCacheConfigurationCustomizer());
  }

  /**
   * Get the bean definition for 'petclinicCacheConfigurationCustomizer'.
   */
  public static BeanDefinition getPetclinicCacheConfigurationCustomizerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(JCacheManagerCustomizer.class);
    beanDefinition.setInstanceSupplier(getPetclinicCacheConfigurationCustomizerInstanceSupplier());
    return beanDefinition;
  }
}
