package pdp.apprentice.java.sharedcode.inheritance;

import java.io.IOException;

public class PropertyFile extends PropertyFileWriter implements PropertyAppender {

  public PropertyFile(String fileName) throws IOException {
    super(fileName);
  }

  @Override
  public void appendProperty(String key, Object value) throws IOException {
    append(key);
    append("=");
    append(String.valueOf(value));
    appendln();
  }
}
