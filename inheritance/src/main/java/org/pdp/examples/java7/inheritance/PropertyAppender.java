package org.pdp.examples.java7.inheritance;

import java.io.IOException;

public interface PropertyAppender {

  void appendProperty(String key, Object value) throws IOException;
}