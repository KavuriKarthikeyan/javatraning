package Java_Intermediate;

public class Vehicle1{

    private String color;

    Vehicle1() {
        this.setColor("Red");
    }
    Vehicle1(String c) {
        this.setColor(c);
    }

    // Setter
    public void setColor(String c) {
        this.color = c;
    }

}
