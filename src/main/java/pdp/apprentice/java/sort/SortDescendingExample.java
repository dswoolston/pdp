package pdp.apprentice.java.sort;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class SortDescendingExample {

  public static void main(String[] args) throws IOException {
    final Path path = Paths.get("input.txt");
    final List<String> lines = Files.readAllLines(path, Charset.defaultCharset());
    Collections.sort(lines, Collections.reverseOrder());
    for (String line : lines) {
      System.out.println(line);
    }
  }
}
