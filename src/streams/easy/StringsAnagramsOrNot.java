package streams.easy;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringsAnagramsOrNot {
    public static void main(String[] args) {
        String s1 = "RaceCar";
        String s2 = "CarRace";
        //breaks the string into characters, makes
        //them uppercase, and sorts them alphabetically and puts the sorted characters back into a single string.
        s1= Stream.of(s1.split("")).map((String::toUpperCase)).sorted().collect(Collectors.joining());
        s2= Stream.of(s2.split("")).map((String::toUpperCase)).sorted().collect(Collectors.joining());
        if(s1.equals(s2)){
            System.out.println("Strings are anagram");
        }
        else{
            System.out.println("Strings are not anagram");
        }
    }
}
