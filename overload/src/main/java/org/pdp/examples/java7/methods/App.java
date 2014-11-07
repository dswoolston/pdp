package org.pdp.examples.java7.methods;

class Foo{
  public void execute(int i){
    execute((Object) i);
  }
  public void execute(String s){
    execute((Object) s);
  }
  public void execute(Object o){
    System.out.println("You sent me a " + o.getClass().getSimpleName() + " whose string representation is {" + o.toString() + "}");
  }
}

public class App {
  public static void main( String[] args ) {
    Foo foo = new Foo();
    foo.execute(42);
    foo.execute("Hello World");
    foo.execute(Math.PI);
  }
}
