package Collections;
//Create a LinkedList of 5 integers. Calculate and print the sum of all the elements.
import java.util.LinkedList;
public class ArrayEx4 {
    public static void main(String[] args) {
        LinkedList <Integer>l = new LinkedList<>();
        l.add(4);
        l.add(5);
        l.add(2);
        l.add(3);
        l.add(1);

        int sum=0;
        for(int num:l){
            sum=sum+num;
        }

        System.out.println(sum);
        
    }
    
}
