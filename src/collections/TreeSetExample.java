package collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<String> treeSet = new TreeSet<>();

        // Add elements to the TreeSet
        treeSet.add("Cherry");
        treeSet.add("Apple");
        treeSet.add("Banana");

        // Check if an element exists
        System.out.println("Contains 'Apple': " + treeSet.contains("Apple")); // Contains Apple: true

        // Remove an element
        treeSet.remove("Banana");

        // Iterate over the TreeSet
        System.out.println("TreeSet elements:");
        for (String fruit : treeSet) {
            System.out.println(fruit);
        }
    }
}
