package Java_Intermediate;

public class TypeCasting {
    //Assigning a value of one type to a
    // variable of another type is known as Type Casting.
    //
    //To cast a value to a specific type,
    // place the type in parentheses and position it in front of the value.

    //Java supports automatic type casting of integers to floating points,
    // since there is no loss of precision.
    //
    //On the other hand, type casting is mandatory when assigning
    // floating point values to integer variables.

    public static void main(String[ ] args) {

        double x = 1.5;

        double y = 2.65;

        sum((int)x, (int)y);

    }

    static void sum(int x, int y) {

        System.out.println(x + y);

    }
}
