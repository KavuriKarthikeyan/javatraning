package Java_Intermediate;

public class ComparingObjects {
    //Remember that when you create objects,
    // the variables store references to the objects.
    //So, when you compare objects using the equality testing operator (==),
    // it actually compares the references and not the object values.

    //Despite having two objects with the same name,
    // the equality testing returns false,
    // because we have two different objects (two different references or memory locations).

    private int x;

    public static void main(String[ ] args) {

        ComparingObjects a = new ComparingObjects();

        a.x = 5;

        ComparingObjects b = new ComparingObjects();

        b.x = 5;

        System.out.println(a == b);

    }
}
