package demo;
// Base class - Animal
class Animal {
    // Method to make sound
    void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

// Intermediate subclass - Cat
class Cat extends Animal {
    // Overriding the makeSound() method
    void makeSound() {
        System.out.println("The Cat meows");
    }
}

// Derived subclass - Dog (inherits from Cat)
class Dog extends Cat {
    // Overriding again (multilevel inheritance)
    void makeSound() {
        System.out.println("The dog barks");
    }
}
// Main class
public class AnimalDetail {
    public static void main(String[] args) {


        // Declare reference variable of parent class
        Animal a;
        //calling the makesound() using reference
		a = new Animal();
		a.makeSound();
		a = new Cat();
		a.makeSound();
		a = new Dog();
        a.makeSound();

    }
}
