package streams.easy;

import java.util.Arrays;
import java.util.List;

public class CheckStringStartWithA {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "orange","grape", "kiwi");
        boolean startWithA = strings.stream().anyMatch(str -> str.startsWith("a"));
        System.out.println("String starts with A? "+startWithA);
    }
}
