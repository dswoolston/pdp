package org.pdp.examples.java7.virtual;

abstract class AbstractFoo {
  public abstract void execute();
}

class RealFoo extends AbstractFoo {
  @Override
  public void execute() {
    System.out.println("Doing Real Foo Stuff!");
  }
}

public class AnotherApp {
  public static void main( String[] args ) {
    RealFoo foo = new RealFoo();
    foo.execute();
  }
}
