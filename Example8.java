//Create a HashMap to store 4 students' names as keys and their marks as values. Calculate the average marks and print it.
import java.util.HashMap;
public class ArrayEx8 {
    public static void main(String[] args) {
        HashMap<String, Integer> mp = new HashMap<>();
        mp.put("Ram",101);
        mp.put("Shyam", 102);
        mp.put("Aman", 103);


        int sum=0;
        for(int marks: mp.values()){
            sum+=marks;

        }

        double avg= sum/mp.size();
        System.out.println("Average: "+avg);

    }
    
}
