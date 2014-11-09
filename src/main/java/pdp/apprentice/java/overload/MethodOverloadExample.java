package pdp.apprentice.java.overload;


public class MethodOverloadExample {

  public static void main(String[] args) {
    Foo foo = new Foo();
    foo.execute(42);
    foo.execute("Hello World");
    foo.execute(Math.PI);
  }

  private static class Foo {

    public void execute(int i) {
      execute((Object) i);
    }

    public void execute(String s) {
      execute((Object) s);
    }

    public void execute(Object o) {
      System.out.println("You sent me a " + o.getClass().getSimpleName() + " whose string representation is {" + o.toString() + "}");
    }
  }
}
