package pdp.apprentice.java.sharedcode.staticmethods;

import java.io.IOException;

public class StaticMethodsExample {

  public static void main(String[] args) {
    try {
      final BeanPropertyFile beanPropertyFile = new BeanPropertyFile("staticmethods.beans.xml");
      beanPropertyFile.appendProperty("name", "value");
      beanPropertyFile.close();

      final PropertyFile propertyFile = new PropertyFile("staticmethods.feature.properties");
      propertyFile.appendProperty("name", "value");
      propertyFile.close();
    }
    catch (IOException e) {
      System.err.println("IOException: " + e.getMessage());
      e.printStackTrace(System.err);
    }
  }
}
