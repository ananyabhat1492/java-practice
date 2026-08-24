package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList
        List<String> arrayList = new ArrayList<>();

        // Add elements to the ArrayList
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");

        // Access elements by index
        System.out.println("Element at index 1: " + arrayList.get(1));

        // Iterate through the ArrayList
        System.out.println("ArrayList elements:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        // Remove an element
        arrayList.remove(1); // Removes "Banana"
        System.out.println("After removal:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

// Add element at the beginning and the end
        arrayList.addFirst("Mango");
        arrayList.addLast("Orange");
        System.out.println("After adding at the beginning and end:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

    }
}
