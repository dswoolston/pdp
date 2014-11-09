package pdp.apprentice.java;

public class EnumExample {

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

  public static void main(String[] args) {

    System.out.println(String.format("name: %s, isMale: %b", NorseGods.ODIN, NorseGods.ODIN.isMale()));
    System.out.println(String.format("name: %s, isMale: %b", NorseGods.FREYA, NorseGods.FREYA.isMale()));
  }
}
