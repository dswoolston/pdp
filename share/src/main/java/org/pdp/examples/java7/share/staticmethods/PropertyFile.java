package org.pdp.examples.java7.share.staticmethods;

import java.io.FileWriter;
import java.io.IOException;

public class PropertyFile implements PropertyAppender {

  final FileWriter writer;

  public PropertyFile(String fileName) throws IOException {
    writer = PropertyFileWriter.construct(fileName);
  }

  public void close() throws IOException {
    PropertyFileWriter.close(writer);
  }

  @Override
  public void appendProperty(String key, Object value) throws IOException {
    PropertyFileWriter.append(writer, key);
    PropertyFileWriter.append(writer, "=");
    PropertyFileWriter.append(writer, String.valueOf(value));
    PropertyFileWriter.appendln(writer);
  }
}
