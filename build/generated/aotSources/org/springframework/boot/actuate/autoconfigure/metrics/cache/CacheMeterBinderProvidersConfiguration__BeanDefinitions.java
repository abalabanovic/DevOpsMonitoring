package org.springframework.boot.actuate.autoconfigure.metrics.cache;

import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.actuate.metrics.cache.CaffeineCacheMeterBinderProvider;
import org.springframework.boot.actuate.metrics.cache.JCacheCacheMeterBinderProvider;

/**
 * Bean definitions for {@link CacheMeterBinderProvidersConfiguration}.
 */
public class CacheMeterBinderProvidersConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'cacheMeterBinderProvidersConfiguration'.
   */
  public static BeanDefinition getCacheMeterBinderProvidersConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CacheMeterBinderProvidersConfiguration.class);
    beanDefinition.setInstanceSupplier(CacheMeterBinderProvidersConfiguration::new);
    return beanDefinition;
  }

  /**
   * Bean definitions for {@link CacheMeterBinderProvidersConfiguration.JCacheCacheMeterBinderProviderConfiguration}.
   */
  public static class JCacheCacheMeterBinderProviderConfiguration {
    /**
     * Get the bean definition for 'jCacheCacheMeterBinderProviderConfiguration'.
     */
    public static BeanDefinition getJCacheCacheMeterBinderProviderConfigurationBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(CacheMeterBinderProvidersConfiguration.JCacheCacheMeterBinderProviderConfiguration.class);
      beanDefinition.setInstanceSupplier(CacheMeterBinderProvidersConfiguration.JCacheCacheMeterBinderProviderConfiguration::new);
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'jCacheCacheMeterBinderProvider'.
     */
    private static BeanInstanceSupplier<JCacheCacheMeterBinderProvider> getJCacheCacheMeterBinderProviderInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<JCacheCacheMeterBinderProvider>forFactoryMethod(CacheMeterBinderProvidersConfiguration.JCacheCacheMeterBinderProviderConfiguration.class, "jCacheCacheMeterBinderProvider")
              .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(CacheMeterBinderProvidersConfiguration.JCacheCacheMeterBinderProviderConfiguration.class).jCacheCacheMeterBinderProvider());
    }

    /**
     * Get the bean definition for 'jCacheCacheMeterBinderProvider'.
     */
    public static BeanDefinition getJCacheCacheMeterBinderProviderBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(JCacheCacheMeterBinderProvider.class);
      beanDefinition.setInstanceSupplier(getJCacheCacheMeterBinderProviderInstanceSupplier());
      return beanDefinition;
    }
  }

  /**
   * Bean definitions for {@link CacheMeterBinderProvidersConfiguration.CaffeineCacheMeterBinderProviderConfiguration}.
   */
  public static class CaffeineCacheMeterBinderProviderConfiguration {
    /**
     * Get the bean definition for 'caffeineCacheMeterBinderProviderConfiguration'.
     */
    public static BeanDefinition getCaffeineCacheMeterBinderProviderConfigurationBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(CacheMeterBinderProvidersConfiguration.CaffeineCacheMeterBinderProviderConfiguration.class);
      beanDefinition.setInstanceSupplier(CacheMeterBinderProvidersConfiguration.CaffeineCacheMeterBinderProviderConfiguration::new);
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'caffeineCacheMeterBinderProvider'.
     */
    private static BeanInstanceSupplier<CaffeineCacheMeterBinderProvider> getCaffeineCacheMeterBinderProviderInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<CaffeineCacheMeterBinderProvider>forFactoryMethod(CacheMeterBinderProvidersConfiguration.CaffeineCacheMeterBinderProviderConfiguration.class, "caffeineCacheMeterBinderProvider")
              .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(CacheMeterBinderProvidersConfiguration.CaffeineCacheMeterBinderProviderConfiguration.class).caffeineCacheMeterBinderProvider());
    }

    /**
     * Get the bean definition for 'caffeineCacheMeterBinderProvider'.
     */
    public static BeanDefinition getCaffeineCacheMeterBinderProviderBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(CaffeineCacheMeterBinderProvider.class);
      beanDefinition.setInstanceSupplier(getCaffeineCacheMeterBinderProviderInstanceSupplier());
      return beanDefinition;
    }
  }
}
