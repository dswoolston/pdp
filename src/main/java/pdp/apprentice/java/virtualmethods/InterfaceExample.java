package pdp.apprentice.java.virtualmethods;


public class InterfaceExample {

  public static void main(String[] args) {
    ExecuteInterface one = new ExecuteImplementation1();
    ExecuteInterface two = new ExecuteImplementation2();
    one.execute();
    two.execute();
  }

  private static interface ExecuteInterface {

    void execute();
  }

  private static class ExecuteImplementation1 implements ExecuteInterface {

    @Override
    public void execute() {
      System.out.println("Doing Foo Stuff!");
    }
  }

  private static class ExecuteImplementation2 implements ExecuteInterface {

    @Override
    public void execute() {
      System.out.println("Doing Bar Stuff!");
    }
  }

}
