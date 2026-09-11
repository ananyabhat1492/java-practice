package streams.easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Top3ElementsFromTheList {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32,
                95, 14, 56, 87);
        List<Integer> top3 = listOfIntegers.stream().sorted(Comparator.reverseOrder()).limit(3).toList();
        System.out.println("Top 3 elements: "+top3);

        //Get 3rd highest element from the list
        Integer thirdHighest = listOfIntegers.stream().sorted(Comparator.reverseOrder()).skip(2).findFirst().orElse(0);
        System.out.println("Third highest element: "+thirdHighest);
    }
}
