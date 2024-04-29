package org.springframework.boot.autoconfigure.cache;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.cache.caffeine.CaffeineCacheManager;

/**
 * Bean definitions for {@link CaffeineCacheConfiguration}.
 */
public class CaffeineCacheConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'caffeineCacheConfiguration'.
   */
  public static BeanDefinition getCaffeineCacheConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CaffeineCacheConfiguration.class);
    beanDefinition.setInstanceSupplier(CaffeineCacheConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'cacheManager'.
   */
  private static BeanInstanceSupplier<CaffeineCacheManager> getCacheManagerInstanceSupplier() {
    return BeanInstanceSupplier.<CaffeineCacheManager>forFactoryMethod(CaffeineCacheConfiguration.class, "cacheManager", CacheProperties.class, CacheManagerCustomizers.class, ObjectProvider.class, ObjectProvider.class, ObjectProvider.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(CaffeineCacheConfiguration.class).cacheManager(args.get(0), args.get(1), args.get(2), args.get(3), args.get(4)));
  }

  /**
   * Get the bean definition for 'cacheManager'.
   */
  public static BeanDefinition getCacheManagerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CaffeineCacheManager.class);
    beanDefinition.setInstanceSupplier(getCacheManagerInstanceSupplier());
    return beanDefinition;
  }
}
