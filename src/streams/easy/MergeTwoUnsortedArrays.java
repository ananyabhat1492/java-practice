package streams.easy;

import java.util.Arrays;
import java.util.stream.Stream;

public class MergeTwoUnsortedArrays {
    public static void main(String[] args) {
        int[] a = new int[] { 4, 2, 7, 1 };
        int[] b = new int[] { 8, 3, 9, 5 };
        int[] c = Stream.concat ////merges two streams (a and b) into one sequence.
                        (Arrays.stream(a).boxed(),Arrays.stream(b).boxed()) //boxed:converts int primitives into Integer objects so they can be handled in a regular Stream.
                .sorted()
                .mapToInt(i->i)//converts back from Stream<Integer> to IntStream for the final array.
                .toArray();
        System.out.println(Arrays.toString(c));
    }
}
