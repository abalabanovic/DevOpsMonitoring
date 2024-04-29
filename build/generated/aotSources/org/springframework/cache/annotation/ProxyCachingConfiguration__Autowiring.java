package org.springframework.cache.annotation;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.AutowiredMethodArgumentsResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link ProxyCachingConfiguration}.
 */
public class ProxyCachingConfiguration__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static ProxyCachingConfiguration apply(RegisteredBean registeredBean,
      ProxyCachingConfiguration instance) {
    AutowiredMethodArgumentsResolver.forRequiredMethod("setConfigurers", ObjectProvider.class).resolve(registeredBean, args -> instance.setConfigurers(args.get(0)));
    return instance;
  }
}
