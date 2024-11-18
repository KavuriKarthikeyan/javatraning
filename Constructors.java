package Java_Intermediate;

public class Constructors {
//You can think of constructors as methods
// that will set up your class by default, so you don’t need to repeat the same code every time.
private String color;
    Constructors() {
        color = "Red";
    }
    public static void main(String[] args){
        Vehicle v = new Vehicle("Blue");
        Vehicle1 v1 = new Vehicle1("Blue");

    }




}

