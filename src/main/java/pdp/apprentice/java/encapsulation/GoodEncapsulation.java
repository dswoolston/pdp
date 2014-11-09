package pdp.apprentice.java.encapsulation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Clients cannot alter the collection
 */
public class GoodEncapsulation {

  private List<String> weekendDays = Collections.unmodifiableList(Arrays.asList("Saturday", "Sunday"));

  public List<String> getWeekendDays() {
    return weekendDays;
  }
}
