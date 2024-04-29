package org.springframework.boot.actuate.autoconfigure.metrics.cache;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link CacheMetricsAutoConfiguration}.
 */
public class CacheMetricsAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'cacheMetricsAutoConfiguration'.
   */
  public static BeanDefinition getCacheMetricsAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CacheMetricsAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(CacheMetricsAutoConfiguration::new);
    return beanDefinition;
  }
}
