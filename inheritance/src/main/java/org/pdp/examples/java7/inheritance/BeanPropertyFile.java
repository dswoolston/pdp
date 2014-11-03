package org.pdp.examples.java7.inheritance;

import java.io.IOException;

public class BeanPropertyFile extends PropertyFileWriter implements PropertyAppender {

  public BeanPropertyFile(String fileName) throws IOException {
    super(fileName);
  }

  @Override
  public void appendProperty(String key, Object value) throws IOException {
    append("<property name=");
    append("\"");
    append(key);
    append("\"");
    append(" value=");
    append("\"");
    append(String.valueOf(value));
    append("\"");
    append("/>");
    appendln();
  }
}
