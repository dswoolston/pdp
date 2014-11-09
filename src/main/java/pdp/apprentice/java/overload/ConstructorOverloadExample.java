package pdp.apprentice.java.overload;

public class ConstructorOverloadExample {

  public static void main(String[] args) {
    Foo foo = new Foo(false, 0, 0.0, "zero");
    System.out.println(foo);
    Foo fooA = new Foo(true);
    System.out.println(fooA);
    Foo fooB = new Foo(1);
    System.out.println(fooB);
    Foo fooC = new Foo(1.0);
    System.out.println(fooC);
    Foo fooD = new Foo("One");
    System.out.println(fooD);
  }

  private static class Foo {

    private final Boolean a;
    private final Integer b;
    private final Double c;
    private final String d;

    public Foo(Boolean a, Integer b, Double c, String d) {
      this.a = a;
      this.b = b;
      this.c = c;
      this.d = d;
    }

    public Foo(Boolean a) {
      this(a, null, null, null);
    }

    public Foo(Integer b) {
      this(null, b, null, null);
    }

    public Foo(Double c) {
      this(null, null, c, null);
    }

    public Foo(String d) {
      this(null, null, null, d);
    }

    @Override
    public String toString() {
      return "Foo{" +
        "a=" + a +
        ", b=" + b +
        ", c=" + c +
        ", d='" + d + '\'' +
        '}';
    }
  }
}
