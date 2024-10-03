package Collections;
//Create an ArrayList of integers. Add 5 numbers, then remove all odd numbers and print the final list.
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayEx {
    public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(9);
    numbers.add(5);
    numbers.add(6);
    numbers.add(3);
    numbers.add(4);

    Iterator<Integer>i=numbers.iterator();
    while(i.hasNext()){
        int n=i.next();
        if(n%2!=0){
            i.remove();
        }
    }
    System.out.println("Final list: "+numbers);
    }   
}
