What is Inheritance in Java?
        Inheritance is an OOP concept that allows a class (child class) to inherit the properties and behavior of another class (parent class).

Key Points:
       1. The extends keyword is used for inheritance in Java.
       2. The child class gets access to the parent class’s fields and methods.
       3. Supports code reusability, meaning common code does not need to be written multiple times.

Example Breakdown:

        Class Animal → Parent class with a name variable and eat() method.
        Class Dog → Inherits from Animal and has an additional bark() method.
        Main Method (main()) → Creates an instance of Dog, assigns a name, and calls both eat() and bark().

Types of Inheritance in Java:

        Single Inheritance → One child inherits from one parent (as in the example).
        Multilevel Inheritance → A class inherits from another child class.
        Hierarchical Inheritance → Multiple child classes inherit from a single parent.
        Multiple Inheritance (Not Supported Directly in Java) → Achieved using interfaces.
