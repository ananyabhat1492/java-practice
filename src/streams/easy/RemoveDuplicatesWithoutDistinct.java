package streams.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesWithoutDistinct {
    //Using hashset
    public static void main(String[] args) {
        List<Integer> duplicateNumbers = Arrays.asList(1, 2, 3, 2, 4, 3, 5,1);
        Set<Integer> setWithoutDuplicates = new HashSet<>();
        List<Integer> integerList = duplicateNumbers.stream()
                .filter(setWithoutDuplicates::add)              //for every number, try adding it into the HashSet setWithoutDuplicates.
                                                                // HashSet.add(x) returns true the first time a number is inserted and
                                                                // false if that number was already in the set.
                    .toList();          //Collect the elements in set to a list
        System.out.println("Integer list without duplicates: "+integerList);
    }
}
