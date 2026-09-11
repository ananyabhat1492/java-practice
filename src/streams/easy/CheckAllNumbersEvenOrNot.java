package streams.easy;

import java.util.Arrays;
import java.util.List;

public class CheckAllNumbersEvenOrNot {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);
        boolean isEven = numbers.stream().allMatch(n->n%2==0);
        System.out.println("Is Even ? "+isEven);


        List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);

        //Find out all the even numbers that exist in the list
        List<Integer> evenList = list.stream().filter(n->n%2==0).toList();
        System.out.println("Even numbers list: "+evenList);

        //Find out the FIRST even numbers that exist in the list using Stream functions
        Integer firstEvenNumber = list.stream().filter(n->n%2==0).findFirst().orElse(0);
        System.out.println("First Even numbers: "+firstEvenNumber);

        //perform cube on list elements and filter numbers greater than 50.
        List<Integer> cubeList = list.stream().map(n->n*n*n).filter(num->num>5000).toList();
        System.out.println("Cube numbers >5000 : "+cubeList);
    }
}
