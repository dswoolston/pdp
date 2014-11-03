package org.pdp.examples.java7.share.staticmethods;

import java.io.IOException;

public interface PropertyAppender {

  void appendProperty(String key, Object value) throws IOException;
}
