package Java_Intermediate;

public class Polymorphism_Animal {
    //Polymorphism, which refers to the idea of "having many forms", occurs when there is a hierarchy of classes related to each other through inheritance.
    //
    //A call to a member method will cause a different implementation to be executed, depending on the type of the object invoking the method.
    //
    //Here is an example: Dog and Cat are classes that inherit from the Animal class. Each class has its own implementation of the makeSound() method.

    public void makeSound() {
        System.out.println("Grr...");
    }
    public static void main(String[] args) {
        Polymorphism_Animal a = new Dog1();
        Polymorphism_Animal b = new Cat1();

        a.makeSound();
        b.makeSound();
    }

        //As all Cat and Dog objects are Animal objects, we can do the following in main:

        //We've created two reference variables of type Animal, and pointed them to the Cat and Dog objects.
        //
        //Now, we can call the makeSound() methods.

}
class Cat1 extends Polymorphism_Animal {
    public void makeSound() {
        System.out.println("Meow");
    }
}

class Dog1 extends Polymorphism_Animal {
    public void makeSound() {
        System.out.println("Woof");
    }
}
//As the reference variable a contains a Dog object,
// the makeSound() method of the Dog class will be called.
//The same applies to the b variable.


//This demonstrates that you can use the Animal variable
// without actually knowing that it contains an object of the subclass.
//This is very useful when you have multiple subclasses of the superclass.