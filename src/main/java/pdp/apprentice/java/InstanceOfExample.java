package pdp.apprentice.java;

class InstanceOfExample {

  public static void main(String args[]) {
    A a = new A();
    B b = new B();
    C c = new C();
    D d = new D();

    if (a instanceof A) {
      System.out.println("a is instance of A");
    }
    if (b instanceof B) {
      System.out.println("b is instance of B");
    }
    if (c instanceof C) {
      System.out.println("c is instance of C");
    }

    if (c instanceof A) {
      System.out.println("c can be cast to A");
      System.out.println((A) c);
      try {
        System.out.println((C) a);
      }
      catch (ClassCastException e) {
        // expected. Cant cast a to C
      }
    }
  }

  private static class A {

    int i;
  }

  private static class B {

    int i;
  }

  private static class C extends A {

    int k;
  }

  private static class D extends A {

    int k;
  }

}