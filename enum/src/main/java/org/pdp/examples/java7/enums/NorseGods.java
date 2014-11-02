package org.pdp.examples.java7.enums;

public enum NorseGods {
  ODIN('M'),
  THOR('M'),
  LOKI('M'),
  FREYA('F'),
  HEL('F'),
  TYR('M'),
  FENRIR('M');

  private final char gender;

  private NorseGods(char gender) {
    this.gender = Character.toUpperCase(gender);
  }

  public boolean isMale() {
    return 'M' == gender;
  }

  public boolean isFemale() {
    return !isMale();
  }
}

