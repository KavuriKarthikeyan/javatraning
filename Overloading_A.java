package Java_Intermediate;

public class Overloading_A {

    public void doSomething() {

        System.out.println("A");

    }

    public void doSomething(String str) {

        System.out.println(str);

    }

}

class B {

    public static void main(String[ ] args) {

        Overloading_A object = new Overloading_A();

        object.doSomething("B");

    }
}
