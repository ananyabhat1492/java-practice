package streams.easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindLongestString {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "orange","grape", "kiwi");
        String max = strings.stream().max((s1,s2)->s1.length()-s2.length()).orElse("");
        String longest = strings.stream().max(Comparator.comparing(String::length)).orElse("");
        System.out.println("Longest string : "+max);
        System.out.println("Longest string : "+longest);
    }
}
