package pdp.apprentice.java.sharedcode.composition;

import java.io.IOException;

public class BeanPropertyFile implements PropertyAppender {

  PropertyFileWriter writer;

  public BeanPropertyFile(String fileName) throws IOException {
    writer = new PropertyFileWriter(fileName);
  }

  public void close() throws IOException {
    writer.close();
  }

  @Override
  public void appendProperty(String key, Object value) throws IOException {
    writer.append("<property name=");
    writer.append("\"");
    writer.append(key);
    writer.append("\"");
    writer.append(" value=");
    writer.append("\"");
    writer.append(String.valueOf(value));
    writer.append("\"");
    writer.append("/>");
    writer.appendln();
  }
}
