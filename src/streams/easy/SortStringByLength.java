package streams.easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortStringByLength {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++",
                "COBOL", "C");
        List<String> sortedListOfStrings = listOfStrings.stream().sorted(Comparator.comparing(
                String::length)).toList();
        System.out.println("sorted List Of Strings: "+sortedListOfStrings);
    }
}
