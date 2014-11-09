package pdp.apprentice.java.overload;


public class MethodOverloadExample {

  public static void main(String[] args) {
    Overloaded overloaded = new Overloaded();
    overloaded.execute(42);
    overloaded.execute("Hello World");
    overloaded.execute(Math.PI);
  }

  private static class Overloaded {

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
