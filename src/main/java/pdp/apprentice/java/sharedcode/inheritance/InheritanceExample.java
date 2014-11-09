package pdp.apprentice.java.sharedcode.inheritance;

import java.io.IOException;

public class InheritanceExample {

  public static void main(String[] args) {
    try {
      final BeanPropertyFile beanPropertyFile = new BeanPropertyFile("inheritance.beans.xml");
      beanPropertyFile.appendProperty("name", "value");
      beanPropertyFile.close();

      final PropertyFile propertyFile = new PropertyFile("inheritance.feature.properties");
      propertyFile.appendProperty("name", "value");
      propertyFile.close();
    }
    catch (IOException e) {
      System.err.println("IOException: " + e.getMessage());
      e.printStackTrace(System.err);
    }
  }
}
