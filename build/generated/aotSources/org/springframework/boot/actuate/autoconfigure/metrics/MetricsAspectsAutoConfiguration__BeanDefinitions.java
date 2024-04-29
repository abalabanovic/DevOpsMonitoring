package org.springframework.boot.actuate.autoconfigure.metrics;

import io.micrometer.core.aop.CountedAspect;
import io.micrometer.core.aop.TimedAspect;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link MetricsAspectsAutoConfiguration}.
 */
public class MetricsAspectsAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'metricsAspectsAutoConfiguration'.
   */
  public static BeanDefinition getMetricsAspectsAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(MetricsAspectsAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(MetricsAspectsAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'countedAspect'.
   */
  private static BeanInstanceSupplier<CountedAspect> getCountedAspectInstanceSupplier() {
    return BeanInstanceSupplier.<CountedAspect>forFactoryMethod(MetricsAspectsAutoConfiguration.class, "countedAspect", MeterRegistry.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(MetricsAspectsAutoConfiguration.class).countedAspect(args.get(0)));
  }

  /**
   * Get the bean definition for 'countedAspect'.
   */
  public static BeanDefinition getCountedAspectBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CountedAspect.class);
    beanDefinition.setInstanceSupplier(getCountedAspectInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'timedAspect'.
   */
  private static BeanInstanceSupplier<TimedAspect> getTimedAspectInstanceSupplier() {
    return BeanInstanceSupplier.<TimedAspect>forFactoryMethod(MetricsAspectsAutoConfiguration.class, "timedAspect", MeterRegistry.class, ObjectProvider.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(MetricsAspectsAutoConfiguration.class).timedAspect(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'timedAspect'.
   */
  public static BeanDefinition getTimedAspectBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(TimedAspect.class);
    beanDefinition.setInstanceSupplier(getTimedAspectInstanceSupplier());
    return beanDefinition;
  }
}
