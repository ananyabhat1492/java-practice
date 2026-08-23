package coreJava.oop;

//Think of an animal family.
// Dogs and cats both inherit general
// animal characteristics but also
// have their own unique behaviors.
class Animal {
    public void eat() {
        System.out.println("This animal eats food.");
    }

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("The dog barks.");
    }

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // inherited method
        dog.bark(); // specific to Dog class

        Animal animal = new Dog();  // Upcasting
        animal.sound();             // Calls Dog's overridden method
    }
}