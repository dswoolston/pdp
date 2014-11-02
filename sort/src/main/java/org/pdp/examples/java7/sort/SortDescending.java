package org.pdp.examples.java7.sort;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class SortDescending {

  public static void main(String[] args) throws IOException {
    final Path target = Paths.get("in.txt");
    final List<String> lines = Files.readAllLines(target, Charset.defaultCharset());
    Collections.sort(lines, Collections.reverseOrder());
    for (String s : lines) {
      System.out.println(s);
    }
  }
}
