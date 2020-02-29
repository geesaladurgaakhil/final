
package com.ashish.custom.sonar.java.plugin;

import java.util.Arrays;
import java.util.List;

import org.sonar.api.SonarPlugin;

/*********************************
 * Entry point of the sonar plug-in
 ********************************/
public class CustomJavaRulesEntry extends SonarPlugin {

  @Override
  public List getExtensions() {
    return Arrays.asList(
      // server extensions -> objects are instantiated during sonarqube startup
      CustomRulesDefinition.class,

      // batch extensions -> objects are instantiated during the code analysis
      CustomJavaFileCheckRegistrar.class);
  }
}