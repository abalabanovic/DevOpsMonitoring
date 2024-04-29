package org.springframework.cache.annotation;

import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.cache.interceptor.BeanFactoryCacheOperationSourceAdvisor;
import org.springframework.cache.interceptor.CacheInterceptor;
import org.springframework.cache.interceptor.CacheOperationSource;

/**
 * Bean definitions for {@link ProxyCachingConfiguration}.
 */
public class ProxyCachingConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'proxyCachingConfiguration'.
   */
  public static BeanDefinition getProxyCachingConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ProxyCachingConfiguration.class);
    beanDefinition.setRole(BeanDefinition.ROLE_INFRASTRUCTURE);
    InstanceSupplier<ProxyCachingConfiguration> instanceSupplier = InstanceSupplier.using(ProxyCachingConfiguration::new);
    instanceSupplier = instanceSupplier.andThen(ProxyCachingConfiguration__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'org.springframework.cache.config.internalCacheAdvisor'.
   */
  private static BeanInstanceSupplier<BeanFactoryCacheOperationSourceAdvisor> getInternalCacheAdvisorInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<BeanFactoryCacheOperationSourceAdvisor>forFactoryMethod(ProxyCachingConfiguration.class, "cacheAdvisor", CacheOperationSource.class, CacheInterceptor.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(ProxyCachingConfiguration.class).cacheAdvisor(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'internalCacheAdvisor'.
   */
  public static BeanDefinition getInternalCacheAdvisorBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(BeanFactoryCacheOperationSourceAdvisor.class);
    beanDefinition.setRole(BeanDefinition.ROLE_INFRASTRUCTURE);
    beanDefinition.setInstanceSupplier(getInternalCacheAdvisorInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'cacheOperationSource'.
   */
  private static BeanInstanceSupplier<CacheOperationSource> getCacheOperationSourceInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<CacheOperationSource>forFactoryMethod(ProxyCachingConfiguration.class, "cacheOperationSource")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(ProxyCachingConfiguration.class).cacheOperationSource());
  }

  /**
   * Get the bean definition for 'cacheOperationSource'.
   */
  public static BeanDefinition getCacheOperationSourceBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CacheOperationSource.class);
    beanDefinition.setRole(BeanDefinition.ROLE_INFRASTRUCTURE);
    beanDefinition.setInstanceSupplier(getCacheOperationSourceInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'cacheInterceptor'.
   */
  private static BeanInstanceSupplier<CacheInterceptor> getCacheInterceptorInstanceSupplier() {
    return BeanInstanceSupplier.<CacheInterceptor>forFactoryMethod(ProxyCachingConfiguration.class, "cacheInterceptor", CacheOperationSource.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(ProxyCachingConfiguration.class).cacheInterceptor(args.get(0)));
  }

  /**
   * Get the bean definition for 'cacheInterceptor'.
   */
  public static BeanDefinition getCacheInterceptorBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CacheInterceptor.class);
    beanDefinition.setRole(BeanDefinition.ROLE_INFRASTRUCTURE);
    beanDefinition.setInstanceSupplier(getCacheInterceptorInstanceSupplier());
    return beanDefinition;
  }
}
