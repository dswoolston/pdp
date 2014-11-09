package pdp.apprentice.java.sharedcode.staticmethods;

import java.io.FileWriter;
import java.io.IOException;

public class BeanPropertyFile implements PropertyAppender {

  final FileWriter writer;

  public BeanPropertyFile(String fileName) throws IOException {
    writer = PropertyFileWriter.construct(fileName);
  }

  public void close() throws IOException {
    PropertyFileWriter.close(writer);
  }

  @Override
  public void appendProperty(String key, Object value) throws IOException {
    PropertyFileWriter.append(writer, "<property name=");
    PropertyFileWriter.append(writer, "\"");
    PropertyFileWriter.append(writer, key);
    PropertyFileWriter.append(writer, "\"");
    PropertyFileWriter.append(writer, " value=");
    PropertyFileWriter.append(writer, "\"");
    PropertyFileWriter.append(writer, String.valueOf(value));
    PropertyFileWriter.append(writer, "\"");
    PropertyFileWriter.append(writer, "/>");
    PropertyFileWriter.appendln(writer);
  }
}
