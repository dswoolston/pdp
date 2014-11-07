package org.pdp.examples.java7.encapsulation;

import java.util.Arrays;
import java.util.List;

/**
 * Clients can alter the collection
 */
public class BadEncapsulation {

  private List<String> weekendDays = Arrays.asList("Saturday", "Sunday");

  public List<String> getWeekendDays() {
    return weekendDays;
  }
}
