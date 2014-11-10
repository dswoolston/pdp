package pdp.apprentice.java;

import java.util.LinkedList;
import java.util.List;

/**
 * Set -Xmx16m to reduce execution time
 */
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

/*
Exception: GC overhead limit exceeded
java.lang.OutOfMemoryError: GC overhead limit exceeded
	at java.util.Arrays.copyOfRange(Arrays.java:2694)
	at java.lang.String.<init>(String.java:203)
	at java.lang.StringBuilder.toString(StringBuilder.java:405)
	at pdp.apprentice.java.StringOverheadExample.generateString(StringOverheadExample.java:19)
	at pdp.apprentice.java.StringOverheadExample.main(StringOverheadExample.java:27)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:606)
	at com.intellij.rt.execution.application.AppMain.main(AppMain.java:134)
Ran out of memory after 45073 strings were created.
That corresponds to 4507300 charCount.
And it corresponds to 10817520 bytes of memory.
 */
