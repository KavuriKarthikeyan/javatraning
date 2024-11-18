package Java_Intermediate;
//Another name for method overloading is compile-time polymorphism.
public class MethodOverloading {
    //When methods have the same name,
    // but different parameters, it is known as method overloading.
    //
    //This can be very useful when you need the same method functionality for different types of parameters.
    //
    //The following example illustrates a method that returns the maximum of its two parameters

/*    int max(int a, int b) {
        if(a > b) {
            return a;
        }
        else {
            return b;
        }
    }*/


//The method shown above will only work for parameters of type integer.
//
//However, we might want to use it for doubles,
// as well. For that, you need to overload the max method:

    static double max(double a, double b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        System.out.println(max(8, 17));
        System.out.println(max(3.14, 7.68));

    }
    //Now, our max method will also work with doubles.
    //
    //An overloaded method must have a different argument list;
    // the parameters should differ in their type, number, or both.
}