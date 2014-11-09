package pdp.apprentice.java.sharedcode.composition;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PropertyFileWriter {

  final FileWriter fileWriter;

  public PropertyFileWriter(String fileName) throws IOException {
    final File file = new File(fileName);
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
