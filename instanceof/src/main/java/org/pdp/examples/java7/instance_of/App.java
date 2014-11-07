package org.pdp.examples.java7.instance_of;

class A {
  int i;
}

class B {
  int i;
}

class C extends A {
  int k;
}

class D extends A {
  int k;
}

class InstanceOf {

  public static void main(String args[]) {
    A a = new A();
    B b = new B();
    C c = new C();
    D d = new D();

    if(a instanceof A)
      System.out.println("a is instance of A");
    if(b instanceof B)
      System.out.println("b is instance of B");
    if(c instanceof C)
      System.out.println("c is instance of C");

    if(c instanceof A) {
      System.out.println("c can be cast to A");
      System.out.println((A)c);
      try {
        System.out.println((C)a);
      }
      catch (ClassCastException e) {
        // expected. Cant cast a to C
      }
    }
  }
}