package org.pdp.examples.java7.share.composition;

import java.io.IOException;

public class PropertyFile implements PropertyAppender {

  PropertyFileWriter writer;

  public PropertyFile(String fileName) throws IOException {
    writer = new PropertyFileWriter(fileName);
  }

  public void close() throws IOException {
    writer.close();
  }

  @Override
  public void appendProperty(String key, Object value) throws IOException {
    writer.append(key);
    writer.append("=");
    writer.append(String.valueOf(value));
    writer.appendln();
  }
}
