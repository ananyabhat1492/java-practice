package streams.easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortInDescendingOrder {
    public static void main(String[] args) {

        //Sort Integers in descending
        List<Integer> integerList = Arrays.asList(11, 11, 1, 3, 5, 6, 5);
        List<Integer> descSortedIntegerList = integerList.stream().distinct().sorted(Comparator.reverseOrder()).toList();
        System.out.println("Sorted list in descending order: "+descSortedIntegerList);

        //Sort decimals in descending order
        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98,
                21.12);
        List<Double> descSortedDecimalList = decimalList.stream().sorted(Comparator.comparingDouble(Double::doubleValue).reversed()).toList();
        System.out.println("Sorted decimal list in descending order: "+descSortedDecimalList);
    }
}
