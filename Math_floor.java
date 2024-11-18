package Java_Intermediate;

public class Math_floor {
   // Similarly, Math.floor() rounds a floating point value down to the nearest integer value.
   public static void main(String[] args) {
       double f = Math.floor(7.343);
       System.out.println(f);
//Math.max() returns the largest of its parameters.
       int m = Math.max(10, 20);
       System.out.println(m);

       //Conversely, Math.min() returns the smallest parameter.
       int m1 = Math.min(10, 20);
       System.out.println(m1);

       //Math.pow() takes two parameters
       // and returns the first parameter raised to the power of the second parameter.

       double p = Math.pow(2, 3);
       System.out.println(p);

       //There are a number of other methods available in the Math class, including:
       //
       //sqrt() for square root, sin() for sine, cos() for cosine, and others.
   }
}
