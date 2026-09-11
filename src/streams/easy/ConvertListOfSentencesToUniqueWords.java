package streams.easy;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ConvertListOfSentencesToUniqueWords {
    public static void main(String[] args) {
        List<String> sentences = List.of("java is cool", "cool code in java");
        Set<String> words = sentences.stream()
                .flatMap(s-> Arrays.stream(s.split(" ")))
                .collect(Collectors.toSet());
        System.out.println(words);

        //create a single List<Integer>?
        List<List<Integer>> nums = List.of(List.of(1, 2), List.of(3, 4));
        List<Integer> numsList = nums.stream().flatMap(n-> n.stream()).toList();
        System.out.println(numsList);
    }
}
