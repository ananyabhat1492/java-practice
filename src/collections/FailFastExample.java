package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class FailFastExample {

    public static void main(String[] args){
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3));
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()){
            Integer number = iterator.next();
            System.out.println(number);
            numbers.add(5); // This line will throw error "Exception in thread "main" java.util.ConcurrentModificationException"
        }
    }
}
