package org.pdp.examples.java7.composition;

import java.io.IOException;

public interface PropertyAppender {

  void appendProperty(String key, Object value) throws IOException;
}
