// Parent class (Super Class)
class Animal {
    String name;

    void eat() {
        System.out.println(name + " is eating.");
    }
}

// Child class (Sub Class)
class Dog extends Animal {
    void bark() {
        System.out.println(name + " is barking.");
    }
}

// Main class to test inheritance
public class InheritanceExample {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.name = "Buddy";
        myDog.eat();  // Inherited from Animal class
        myDog.bark(); // Defined in Dog class
    }
}
