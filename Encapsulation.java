package Java_Intermediate;

public class Encapsulation {
    //There are 4 core concepts in OOP:
    // encapsulation, inheritance, polymorphism, and abstraction.

    //The idea behind encapsulation is to ensure that implementation details are not visible
   // to users.
    // The variables of one class will be hidden from the other classes,
    // accessible only through the methods of the current class. This is called data hiding.
    // To achieve encapsulation in Java,
    // declare the class' variables as private and provide public setter and getter methods
    // to modify and view the variables' values.

    private double balance=0;
    public void deposit(double x) {
        if(x > 0) {
            balance += x;
        }
    }
}

//In summary, encapsulation provides the following benefits:
//
//- Control of the way data is accessed or modified
//
//- More flexible and easily changed code
//
//- Ability to change one part of the code without affecting other parts


