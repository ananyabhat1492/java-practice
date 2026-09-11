package streams.easy;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWordOfAString {
    public static void main(String[] args) {
        String str = "Java Concept Of The Day";
        String reversed = Arrays.stream(str.split(" "))
                .map(everyString->new StringBuilder(everyString).reverse()).collect(Collectors.joining(" "));
        System.out.println(reversed);
    }
}
