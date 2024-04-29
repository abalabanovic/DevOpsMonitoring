package org.springframework.cache.jcache.config;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.AutowiredMethodArgumentsResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link ProxyJCacheConfiguration}.
 */
public class ProxyJCacheConfiguration__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static ProxyJCacheConfiguration apply(RegisteredBean registeredBean,
      ProxyJCacheConfiguration instance) {
    AutowiredMethodArgumentsResolver.forRequiredMethod("setConfigurers", ObjectProvider.class).resolveAndInvoke(registeredBean, instance);
    return instance;
  }
}
