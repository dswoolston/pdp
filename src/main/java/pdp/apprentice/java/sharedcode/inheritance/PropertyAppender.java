package pdp.apprentice.java.sharedcode.inheritance;

import java.io.IOException;

public interface PropertyAppender {

  void appendProperty(String key, Object value) throws IOException;
}
