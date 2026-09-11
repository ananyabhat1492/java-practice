package streams.easy;

import java.util.Arrays;
import java.util.List;

public class NumbersStartingWith1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 12, 20, null, 19, 30);
        List<Integer> startWith1 = numbers.stream().filter(n->String.valueOf(n).startsWith("1")).toList();
        System.out.println("Starts with 1: "+startWith1);

    }

}
