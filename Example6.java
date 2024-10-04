//Create a HashSet of names. Add 5 names, then convert this HashSet into an ArrayList and print the resulting list.
import java.util.ArrayList;
import java.util.HashSet;

public class ArrayEx6 {
    public static void main(String[] args) {
        HashSet<String> name = new HashSet<>();
        name.add("Aman");
        name.add("Naman");
        name.add("Harshit");
        name.add("kanita");
        name.add("Muskan");
        System.out.println("Hashset: "+name);

        ArrayList<String> names = new ArrayList<>(name);
        System.out.println("List of names: "+names );

    }  
}
