package pdp.apprentice.java.parameterpassing;

/**
 * Determine the effect upon object references and primitive values when they are passed  into methods that change the values --
 * Create a method 3 parameters, one is parameter is pass by value, one is passed by reference and one with the keyword final.
 */
public class ParameterPassingPrimitiveExamples {

  public static void threeParameterMethod(int byValue, int[] wrapper, final int asFinalValue) {

    System.out.println("Passed by value. Inside method call (initial value): " + byValue);
    byValue = byValue / 2;
    System.out.println("Passed by value. Inside method call (value after local assignment): " + byValue);

    // Java does NOT do primitive pass by reference. Value must be passed in wrapper.
    System.out.println("Passed by reference. Inside method call (initial value): " + wrapper[0]);
    wrapper[0] = wrapper[0] / 2;  // This is a hack!
    System.out.println("Passed by reference. Inside method call (value after local assignment): " + wrapper[0]);

    // The compiler does not permit local assignment to a final parameter
    System.out.println("Passed as final. Inside method call (initial value): " + asFinalValue);
//    asFinalValue = asFinalValue / 2;
    System.out.println("Passed as final. Inside method call (value after local prohibited assignment): " + asFinalValue);
  }

  public static void main(String[] args) {

    int var = 100;
    int[] wrapper = new int[1];
    wrapper[0] = 200; // This is a hack!
    int asFinalValue = 300;

    System.out.println("Passed by value. (initial value): " + var);
    System.out.println("Passed by reference. (initial value): " + wrapper[0]);
    System.out.println("Passed as final. (initial value): " + asFinalValue);

    System.out.println();
    threeParameterMethod(var, wrapper, asFinalValue);
    System.out.println();

    System.out.println("Passed by value. (value after method return): " + var);
    System.out.println("Passed by reference. (value after method return): " + wrapper[0] + " ** hacked!");
    System.out.println("Passed as final. (value after method return): " + asFinalValue);

  }

}
