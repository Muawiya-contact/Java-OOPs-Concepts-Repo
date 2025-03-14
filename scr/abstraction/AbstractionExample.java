
package scr.abstraction;
abstract class Vehicle {
    // Abstract method (does not have a body)
    abstract void startEngine();

    // Concrete method
    void stopEngine() {
        System.out.println("Engine stopped.");
    }
}

// Concrete subclass
class Car extends Vehicle {
    // Implementing abstract method
    @Override
    void startEngine() {
        System.out.println("Car engine started with a key.");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Vehicle myCar = new Car();  // Upcasting
        myCar.startEngine();
        myCar.stopEngine();
    }
}
