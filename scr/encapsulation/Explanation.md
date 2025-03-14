This file explains the Encapsulation concept in Java.

🔹 What is Encapsulation?

        Encapsulation is one of the four fundamental OOP principles that involves:

        Hiding the internal details of a class.
        Using private variables with public getter & setter methods to control access.
        Improves security, reusability, and maintainability.

🔹 Key Features of Encapsulation:

        Data Hiding → Private variables cannot be accessed directly.
        Controlled Access → Getters and setters provide controlled access.
        Reusability → Makes the class easier to maintain and modify.

🔹 Example Breakdown:

        private String name; → Private data member.
        public String getName() → Public getter method to access name.
        public void setAge(int age) → Public setter method to modify age with a validation check.
        In the main() method, we create a Person object and modify its values safely.

🔹 Output:

        Name: Muawiya Amir
        Age: 25
        Updated Name: Alice Smith
        Updated Age: 30