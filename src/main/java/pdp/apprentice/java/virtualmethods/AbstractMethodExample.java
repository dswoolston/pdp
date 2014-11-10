package pdp.apprentice.java.virtualmethods;

public class AbstractMethodExample {

  public static void main(String[] args) {

    ConcreteClass concreteClass = new ConcreteClass();
    concreteClass.execute();
  }

  private static abstract class AbstractClass {

    public abstract void execute();
  }

  private static class ConcreteClass extends AbstractClass {

    @Override
    public void execute() {
      System.out.println("ConcreteClass.execute()");
    }
  }

}
