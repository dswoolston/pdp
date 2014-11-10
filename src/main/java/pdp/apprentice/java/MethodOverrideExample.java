package pdp.apprentice.java;


public class MethodOverrideExample {

  public static void main(String[] args) {
    System.out.println("Call methods in superclass only...");
    Superclass superclass = new Superclass();
    superclass.execute1();
    superclass.execute2();
    System.out.println();
    System.out.println("Call only subclass implementer");
    Subclass subclass = new Subclass();
    subclass.execute1();
    System.out.println();
    System.out.println("Calls superclass & subclass implementer");
    subclass.execute2();
  }

  private static class Superclass {

    public void execute1() {
      System.out.println("Superclass.execute1");
    }

    public void execute2() {
      System.out.println("Superclass.execute2");
    }
  }

  private static class Subclass extends Superclass {

    /**
     * Does NOT call super-implementer
     */
    @Override
    public void execute1() {
      System.out.println("Subclass.execute1");
    }

    /**
     * Does call super-implementer
     */
    public void execute2() {
      super.execute2();
      System.out.println("Subclass.execute2");
    }
  }
}
