package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeExample {

    public static void main(String[] args){
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>(Arrays.asList("a","b","c"));
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            if(iterator.next().equalsIgnoreCase("b")){
                list.remove("b");
            }
        }
        System.out.println("New List: "+list);
    }
}
