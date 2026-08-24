package collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();

        // Add elements to the HashSet
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");

        // Check if an element exists
        System.out.println("Contains 'Apple': " + hashSet.contains("Apple")); // Contains 'Apple': true

        // Remove an element
        hashSet.remove("Banana");

        // Iterate over the HashSet
        System.out.println("HashSet elements:");
        for (String fruit : hashSet) {
            System.out.println(fruit);
        }
    }
}
