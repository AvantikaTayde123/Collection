package Collections;
//Create a HashSet of 5 numbers. Check if a specific number exists and print whether it’s found or not.
import java.util.HashSet;

public class ArrayEx5 {
    public static void main(String[] args) {
        HashSet <Integer> num = new HashSet<>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(50);

        int number=20;

        if(num.contains(number)){
            System.out.println("The no is present in Hashset ");
        }
        else{
            System.out.println("Number not found ");
        }
    }


    
}
