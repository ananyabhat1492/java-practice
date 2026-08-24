package collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        // Create a LinkedList
        List<String> linkedList = new LinkedList<>();

        // Add elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");

        // Access elements by index (not efficient)
        System.out.println("Element at index 1: " + linkedList.get(1)); // Banana

        // Iterate through the LinkedList
        System.out.println("LinkedList elements:");
        for (String fruit : linkedList) {
            System.out.println(fruit);
        }

        // Remove an element
        linkedList.remove(1); // Removes "Banana"
        System.out.println("After removal:");
        for (String fruit : linkedList) {
            System.out.println(fruit);
        }

        // Add element at the beginning and the end
        linkedList.addFirst("Mango");
        linkedList.addLast("Orange");
        System.out.println("After adding at the beginning and end:");
        for (String fruit : linkedList) {
            System.out.println(fruit);
        }
    }
}
