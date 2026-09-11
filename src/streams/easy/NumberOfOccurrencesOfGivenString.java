package streams.easy;

import java.util.Arrays;
import java.util.List;

public class NumberOfOccurrencesOfGivenString {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("java scala ruby", "java react spring java");
        String word = "java";
        long count = strings.stream().flatMap(s -> Arrays.stream(s.split(" ")))
                .filter(w -> w.equals(word)).count();
        System.out.println("Occurrences of \"" + word + "\": " + count);

        //How do you get distinct characters from a list of words?
        List<String> words = List.of("java", "scala");
        List<Character> distinctChar = words.stream().flatMap(str->str.chars().mapToObj(c->(char)c))
                .distinct().toList();
        System.out.println(distinctChar);
    }
}
