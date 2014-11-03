package org.pdp.examples.java7.inheritance;

import java.io.IOException;

public class App {

  public static void main(String[] args) {
    try {
      final BeanPropertyFile beanPropertyFile = new BeanPropertyFile("beans.xml");
      beanPropertyFile.appendProperty("name", "value");
      beanPropertyFile.close();

      final PropertyFile propertyFile = new PropertyFile("feature.properties");
      propertyFile.appendProperty("name", "value");
      propertyFile.close();
    }
    catch (IOException e) {
      System.err.println("IOException: " + e.getMessage());
      e.printStackTrace(System.err);
    }
  }
}
