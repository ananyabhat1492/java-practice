package coreJava;

// Reference example
public class ReferenceTypeExample {
    public static void main(String[] args) {
        // Creating an object of MyClass
        MyClass obj1 = new MyClass();
        obj1.name = "Alice";

        // obj2 is a reference to the same object as obj1
        MyClass obj2 = obj1;
        obj2.name = "Bob"; // modifying obj2 affects obj1

        System.out.println("Value of obj1.name: " + obj1.name); // Output: Value of obj1.name: Bob
        System.out.println("Value of obj2.name: " + obj2.name); // Output: Value of obj2.name: Bob
    }
}

class MyClass {
    String name;
}