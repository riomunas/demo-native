package dev.aadf.demonative;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link DemoNativeApplication}.
 */
@Generated
public class DemoNativeApplication__BeanDefinitions {
  /**
   * Get the bean definition for 'demoNativeApplication'.
   */
  public static BeanDefinition getDemoNativeApplicationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(DemoNativeApplication.class);
    beanDefinition.setTargetType(DemoNativeApplication.class);
    ConfigurationClassUtils.initializeConfigurationClass(DemoNativeApplication.class);
    beanDefinition.setInstanceSupplier(DemoNativeApplication$$SpringCGLIB$$0::new);
    return beanDefinition;
  }
}
