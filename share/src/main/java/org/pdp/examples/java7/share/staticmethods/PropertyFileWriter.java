package org.pdp.examples.java7.share.staticmethods;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PropertyFileWriter {

  public static FileWriter construct(String fileName) throws IOException {
    final File file = new File(fileName);
    file.createNewFile();
    return new FileWriter(file);
  }

  public static void close(FileWriter fileWriter) throws IOException {
    fileWriter.close();
  }

  public static void append(FileWriter fileWriter, String text) throws IOException {
    fileWriter.append(text);
  }

  public static void appendln(FileWriter fileWriter) throws IOException {
    fileWriter.append("\n");
  }

}
