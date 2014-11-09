package pdp.apprentice.java.sharedcode.composition;

import java.io.IOException;

public class CompositionExample {

  public static void main(String[] args) {
    try {
      final BeanPropertyFile beanPropertyFile = new BeanPropertyFile("composition.beans.xml");
      beanPropertyFile.appendProperty("name", "value");
      beanPropertyFile.close();

      final PropertyFile propertyFile = new PropertyFile("composition.feature.properties");
      propertyFile.appendProperty("name", "value");
      propertyFile.close();
    }
    catch (IOException e) {
      System.err.println("IOException: " + e.getMessage());
      e.printStackTrace(System.err);
    }
  }
}
