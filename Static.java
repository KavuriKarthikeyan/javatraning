package Java_Intermediate;

public class Static {
    //When you declare a variable or a method as static,
    // it belongs to the class,
    // rather than to a specific instance.
    // This means that only one instance of a static member exists,
    // even if you create multiple objects of the class,
    // or if you don't create any. It will be shared by all objects.

    public static int COUNT=0;
    Static() {
        COUNT++;
    }

    // we can create objects of our Counter class in main,
    // and access the static variable.

}

