package streams.easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaxNumberInAList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 4, 41, 4);
        int max = numbers.stream().max(Comparator.naturalOrder())   //finds the maximum element by comparing numbers in their natural order (ascending).
                .orElse(0);
        System.out.println("Max number: "+max);
    }
}
