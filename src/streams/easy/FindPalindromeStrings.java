package streams.easy;

import java.util.Arrays;
import java.util.List;

public class FindPalindromeStrings {
    public static void main(String[] args) {
        List<String> palindromeNames = Arrays.asList("Telugu", "Tamil",
                "Malayalam");
        List<String> findPalindromeStrings = palindromeNames.stream().filter(eachString -> {
            return eachString.toLowerCase().contentEquals(new StringBuilder(eachString.toLowerCase()).reverse());
        }).toList();

        List<String> findPalindromeStrings1 = palindromeNames.stream().filter(eachString -> {
            return eachString.equalsIgnoreCase(new StringBuilder(eachString).reverse().toString());
        }).toList();

        System.out.println(findPalindromeStrings);
    }
}
