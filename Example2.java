package Collections;
//Create an ArrayList of 5 city names, sort them in alphabetical order, and print the sorted list.
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayEx2 {
public static void main(String[] args) {
    ArrayList<String> l =new ArrayList<>();
    l.add("Indore");
    l.add("Dewas");
    l.add("Ujjain");
    l.add("Bhopal");
    l.add("Sehore");

    Collections.sort(l);

    System.out.println(l);
}
}
    

