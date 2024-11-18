package Java_Intermediate;

public class MyClass {
    //The output is 2,
    // because the COUNT variable is static
    // and gets incremented by one each time a new object of the Static class is created.
    // In the code above, we created 2 objects.

    //You can also access the static variable using
    // any object of that class, such as c1.COUNT.
    public static void main(String[ ] args) {
        Static c1 = new Static();
        Static c2 = new Static();
        System.out.println(Static.COUNT);

        //static Method
        Static_Method.horn();
//Another example of static methods are those of the Math class,
// which is why you can call them without creating a Math object.
//Also, the main method must always be static.


    }
}
