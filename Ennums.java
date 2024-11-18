package Java_Intermediate;

public class Ennums {
    //An Enum is a special type used to define collections of constants.
    enum Rank {
        SOLDIER,
        SERGEANT,
        CAPTAIN
    }

    //Note that the values are comma-separated.
    //
    //You can refer to the constants in the enum
    // above with the dot syntax

    Rank a = Rank.SOLDIER;
    //Basically, Enums define variables that represent members of a fixed set.
    public static void main(String[ ] args) {

      /*  Color1 color = Color1.RED;

        switch(color) {

            case BLUE:

                System.out.println("1");

                break;

            case GREEN:

                System.out.println("2");

                break;

            default:

                System.out.println("0");

                break;

        }*/

    }
}
