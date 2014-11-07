package org.pdp.examples.java7.methods;

class Foo {
  public void execute1(){
    System.out.println("foo.execute1");
  }
  public void execute2(){
    System.out.println("foo.execute2");
  }
}

class Bar extends Foo {
  @Override
  public void execute1() {
    System.out.println("bar.execute1");
  }
  public void execute2() {
    super.execute2();
    System.out.println("bar.execute2");
  }
}

public class App {
  public static void main( String[] args ) {
    Foo foo = new Foo();
    foo.execute1();
    System.out.println();
    Foo bar = new Bar();
    bar.execute1();
    System.out.println();
    bar.execute2();
  }
}
