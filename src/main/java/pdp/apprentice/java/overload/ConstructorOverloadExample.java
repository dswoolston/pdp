package pdp.apprentice.java.overload;

public class ConstructorOverloadExample {

  public static void main(String[] args) {
    Overloaded overloaded = new Overloaded(false, 0, 0.0, "zero");
    System.out.println(overloaded);
    Overloaded overloadedA = new Overloaded(true);
    System.out.println(overloadedA);
    Overloaded overloadedB = new Overloaded(1);
    System.out.println(overloadedB);
    Overloaded overloadedC = new Overloaded(1.0);
    System.out.println(overloadedC);
    Overloaded overloadedD = new Overloaded("One");
    System.out.println(overloadedD);
  }

  private static class Overloaded {

    private final Boolean a;
    private final Integer b;
    private final Double c;
    private final String d;

    public Overloaded(Boolean a, Integer b, Double c, String d) {
      this.a = a;
      this.b = b;
      this.c = c;
      this.d = d;
    }

    public Overloaded(Boolean a) {
      this(a, null, null, null);
    }

    public Overloaded(Integer b) {
      this(null, b, null, null);
    }

    public Overloaded(Double c) {
      this(null, null, c, null);
    }

    public Overloaded(String d) {
      this(null, null, null, d);
    }

    @Override
    public String toString() {
      return "Overloaded{" +
        "a=" + a +
        ", b=" + b +
        ", c=" + c +
        ", d='" + d + '\'' +
        '}';
    }
  }
}
