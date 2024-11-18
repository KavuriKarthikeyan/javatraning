package Java_Intermediate;

public class Value_ReferenceType {
    //Value types are the basic types,
    // and include byte, short, int, long, float, double, boolean, and char.
    public static void main(String[ ] args) {
        int x = 5;
        addOneTo(x);
        System.out.println(x);
    }

    static void addOneTo(int num) {
        num = num + 1;
    }

}
