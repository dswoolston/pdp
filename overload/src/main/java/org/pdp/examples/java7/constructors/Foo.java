package org.pdp.examples.java7.constructors;

public class Foo {

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
