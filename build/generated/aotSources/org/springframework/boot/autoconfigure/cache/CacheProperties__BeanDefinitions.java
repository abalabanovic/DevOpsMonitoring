package org.springframework.boot.autoconfigure.cache;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link CacheProperties}.
 */
public class CacheProperties__BeanDefinitions {
  /**
   * Get the bean definition for 'cacheProperties'.
   */
  public static BeanDefinition getCachePropertiesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CacheProperties.class);
    beanDefinition.setInstanceSupplier(CacheProperties::new);
    return beanDefinition;
  }
}
