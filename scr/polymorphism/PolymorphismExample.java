
package scr.polymorphism;
class Animal {
    // Method to be overridden
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Overriding the makeSound method
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    // Overriding the makeSound method
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        // Demonstrating method overriding (Runtime Polymorphism)
        Animal myAnimal = new Dog();  // Dog object assigned to Animal reference
        myAnimal.makeSound();         // Outputs: Dog barks

        myAnimal = new Cat();         // Cat object assigned to Animal reference
        myAnimal.makeSound();         // Outputs: Cat meows
    }
}
// In this example, we have an Animal class with a makeSound method. The Dog and Cat classes inherit from the Animal class and override the makeSound method with their own implementation.