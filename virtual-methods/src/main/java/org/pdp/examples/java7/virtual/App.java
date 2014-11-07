package org.pdp.examples.java7.virtual;

interface ExecutionEngine {
  void execute();
}

class Foo implements ExecutionEngine {
  @Override
  public void execute() {
    System.out.println("Doing Foo Stuff!");
  }
}

class Bar implements ExecutionEngine {
  @Override
  public void execute() {
    System.out.println("Doing Bar Stuff!");
  }
}

public class App {
  public static void main( String[] args ) {
    ExecutionEngine foo = new Foo();
    ExecutionEngine bar = new Bar();
    foo.execute();
    bar.execute();
  }
}
