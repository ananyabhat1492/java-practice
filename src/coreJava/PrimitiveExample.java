package coreJava;

// Primitive example
public class PrimitiveExample {
    public static void main(String[] args) {
        int a = 5;
        int b = a; // b is now a copy of a
        b = 10; // changing b does not affect a

        System.out.println("Value of a: " + a); // Output: Value of a: 5
        System.out.println("Value of b: " + b); // Output: Value of b: 10
    }
}