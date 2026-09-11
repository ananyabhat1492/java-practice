package streams.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GetDuplicates {
    public static void main(String[] args) {
        List<Integer> duplicateNumbers = Arrays.asList(1, 2, 3, 2, 4, 3, 5,1);
        Set<Integer> setWithDuplicates = new HashSet<>();
        List<Integer> duplicateIntegerList = duplicateNumbers.stream().
                filter(eachInteger -> !setWithDuplicates.add(eachInteger)) //for every number, try adding it into the HashSet setWithDuplicates
                                                                                    //!setWithDuplicates.add(eachInteger), the filter keeps only the elements where add() returned false.
                                                                                    //Only duplicates pass through the streams, and first occurrences are dropped. .
                .toList();
        System.out.println("Unique Numbers: " + duplicateIntegerList);
    }
}
