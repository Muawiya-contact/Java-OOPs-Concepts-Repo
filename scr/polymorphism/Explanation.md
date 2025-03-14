Polymorphism in Java:

    Polymorphism is one of the four fundamental OOP concepts that allows objects of different classes to be treated as objects of a common superclass. In Java, polymorphism is mainly achieved through method overriding and method overloading.

1️⃣ Types of Polymorphism
        🔹 Compile-time Polymorphism (Method Overloading)
        Occurs when multiple methods have the same name but different parameters.
        It is resolved at compile time.

Example:

class MathOperations {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}
        🔹 Runtime Polymorphism (Method Overriding)

        Occurs when a subclass provides a specific implementation of a method already defined in its superclass.
        It is resolved at runtime using dynamic method dispatch.

Example (as shown in PolymorphismExample.java):

Animal myAnimal = new Dog();
myAnimal.makeSound();  // Calls Dog's overridden method

2️⃣ Key Benefits of Polymorphism

        ✔ Code Reusability – Reduces code duplication by allowing multiple behaviors under a single interface.
        ✔ Extensibility – Makes it easier to extend and modify the code without breaking existing functionality.
        ✔ Flexibility – Allows writing general and reusable code for different types of objects.

