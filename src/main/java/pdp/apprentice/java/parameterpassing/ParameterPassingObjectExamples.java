package pdp.apprentice.java.parameterpassing;


/**
 * Determine the effect upon object references and primitive values when they are passed  into methods that change the values --
 * Create a method 3 parameters, one is parameter is pass by value, one is passed by reference and one with the keyword final.
 */
public class ParameterPassingObjectExamples {

  public static void threeParameterMethod(Object byValue, Object[] wrapper, final Object asFinalValue) {

    System.out.println("Passed by value. Inside method call (initial value): " + byValue.hashCode());
    byValue = new Object();
    System.out.println("Passed by value. Inside method call (value after local assignment): " + byValue.hashCode());

    // Java does NOT do primitive pass by reference. Value must be passed in wrapper.
    System.out.println("Passed by reference. Inside method call (initial value): " + wrapper[0].hashCode());
    wrapper[0] = new Object();  // This is a hack!
    System.out.println("Passed by reference. Inside method call (value after local assignment): " + wrapper[0].hashCode());

    // The compiler does not permit local assignment to a final parameter
    System.out.println("Passed as final. Inside method call (initial value): " + asFinalValue.hashCode());
//    asFinalValue = new Object();
    System.out.println("Passed as final. Inside method call (value after local prohibited assignment): " + asFinalValue.hashCode());
  }

  public static void main(String[] args) {

    Object var = new Object();
    Object wrapper[] = new Object[] { new Object()};
    Object asFinalValue = new Object();


    System.out.println("Passed by value. (initial value): " + var.hashCode());
    System.out.println("Passed by reference. (initial value): " + wrapper[0].hashCode());
    System.out.println("Passed as final. (initial value): " + asFinalValue.hashCode());

    System.out.println();
    threeParameterMethod(var, wrapper, asFinalValue);
    System.out.println();

    System.out.println("Passed by value. (value after method return): " + var.hashCode());
    System.out.println("Passed by reference. (value after method return): " + wrapper[0].hashCode() + " ** hacked!");
    System.out.println("Passed as final. (value after method return): " + asFinalValue.hashCode());

  }

}
