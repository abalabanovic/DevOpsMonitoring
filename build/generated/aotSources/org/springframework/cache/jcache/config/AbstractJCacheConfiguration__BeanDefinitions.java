package org.springframework.cache.jcache.config;

import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.cache.jcache.interceptor.JCacheOperationSource;

/**
 * Bean definitions for {@link AbstractJCacheConfiguration}.
 */
public class AbstractJCacheConfiguration__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'jCacheOperationSource'.
   */
  private static BeanInstanceSupplier<JCacheOperationSource> getJCacheOperationSourceInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<JCacheOperationSource>forFactoryMethod(AbstractJCacheConfiguration.class, "cacheOperationSource")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(AbstractJCacheConfiguration.class).cacheOperationSource());
  }

  /**
   * Get the bean definition for 'jCacheOperationSource'.
   */
  public static BeanDefinition getJCacheOperationSourceBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(JCacheOperationSource.class);
    beanDefinition.setRole(BeanDefinition.ROLE_INFRASTRUCTURE);
    beanDefinition.setInstanceSupplier(getJCacheOperationSourceInstanceSupplier());
    return beanDefinition;
  }
}
