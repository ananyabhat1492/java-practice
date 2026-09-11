package streams.easy;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SumOfAllDigitsInANumber {
    public static void main(String[] args) {
        int i = 15623;
        Integer sumOfDigits= Arrays.stream(String.valueOf(i).split(""))
                .collect(Collectors.summingInt(Integer::parseInt));
        System.out.println(sumOfDigits);
    }
}
