package pdp.apprentice.java;

import java.util.LinkedList;
import java.util.List;

public class StringOverheadExample {

  private static final int STRING_LENGTH = 100;
  private static final int STRING_OVERHEAD = (8 * (((STRING_LENGTH * 2) + 45) / 8));
  private static final String PAD_STRING = "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000";

  private static String generateString(int index) {
    final StringBuilder builder = new StringBuilder(STRING_LENGTH);
    builder.append(PAD_STRING);
    builder.insert(index, System.nanoTime());
    return builder.toString();
  }

  public static void main(String[] args) throws InterruptedException {
    final List<String> strings = new LinkedList<>();
    int stringCount = 0;
    try {
      while (true) {
        strings.add(generateString(stringCount % 50));
        stringCount++;
      }
    }
    catch (OutOfMemoryError e) {
      strings.clear(); // allow the garbage collector to reclaim the space
      System.err.println("Exception: " + e.getMessage());
      e.printStackTrace(System.err);
    }
    catch (Exception e) {
      strings.clear(); //  allow the garbage collector to reclaim the space
      System.err.println("Exception: " + e.getMessage());
      e.printStackTrace(System.err);
    }
    Thread.sleep(1000); // unnecessary
    // Minimum String memory usage (bytes) = 8 * (int) ((((char count) * 2) + 45) / 8)
    // from: http://www.javamex.com/tutorials/memory/string_memory_usage.shtml
    System.out.println("Ran out of memory after " + stringCount + " strings were created.");
    final int charCount = stringCount * STRING_LENGTH;
    System.out.println("That corresponds to " + charCount + " charCount.");
    final int bytes = stringCount * STRING_OVERHEAD;
    System.out.println("And it corresponds to " + bytes + " bytes of memory.");
  }
}
