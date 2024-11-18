package Java_Intermediate;

public class Math_abs {
//The JDK defines a number of useful classes,
// one of them being the Math class,
// which provides predefined methods for mathematical operations.
//
//You do not need to create an object of the Math class to use it.
// To access it, just type in Math. and the corresponding method.
//
//Math.abs() returns the absolute value of its parameter.
        public static void main(String[] args) {
            int a = Math.abs(10);
            System.out.println(a);

            int b = Math.abs(-20);
            System.out.println(b);

            System.out.println(Math.abs(Math.min(-6, 3)));
        }

}
