package pdp.apprentice.java.virtualmethods;

public class AbstractMethodExample {

  public static void main(String[] args) {

    ConcreteClass foo = new ConcreteClass();
    foo.execute();
  }

  private static abstract class AbstractClass {

    public abstract void execute();
  }

  private static class ConcreteClass extends AbstractClass {

    @Override
    public void execute() {
      System.out.println("Doing Real Foo Stuff!");
    }
  }

}
