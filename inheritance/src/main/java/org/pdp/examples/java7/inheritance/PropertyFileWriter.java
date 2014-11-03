package org.pdp.examples.java7.inheritance;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PropertyFileWriter {

  final File file;
  final FileWriter fileWriter;

  public PropertyFileWriter(String fileName) throws IOException {
    file = new File(fileName);
    file.createNewFile();
    fileWriter = new FileWriter(file);
  }

  public void close() throws IOException {
    fileWriter.close();
  }

  public PropertyFileWriter append(String text) throws IOException {
    fileWriter.append(text);
    return this;
  }

  public void appendln() throws IOException {
    append("\n");
  }

}
