What is Abstraction in Java?

        1.Abstraction is a principle of Object-Oriented Programming (OOP) that hides implementation details and only shows the necessary functionalities to the user.
        2. It helps in reducing complexity and increasing reusability.
        3.Abstraction is achieved in Java using:

            *.Abstract Classes (abstract keyword)
            *.Interfaces (interface keyword)
Code Explanation
        We create an abstract class Vehicle with:
        An abstract method startEngine() (to be implemented by subclasses).
        A concrete method stopEngine().
        The Car class extends Vehicle and provides implementation for startEngine().
        In main(), we create an object of Car and call both methods.
        
Key Points

        ✅ Abstract classes cannot be instantiated.
        ✅ Abstract methods must be implemented by child classes.
        ✅ Useful for defining a common template for related classes.