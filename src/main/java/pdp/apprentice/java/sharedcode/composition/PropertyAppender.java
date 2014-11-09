package pdp.apprentice.java.sharedcode.composition;

import java.io.IOException;

public interface PropertyAppender {

  void appendProperty(String key, Object value) throws IOException;
}
