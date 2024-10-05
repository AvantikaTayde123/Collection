//Create a HashMap with 3 product names as keys and their prices as values. 
//Update the price of one product and display the updated map.
import java.util.HashMap;

public class ArrayEx7 {
    public static void main(String[] args) {
        HashMap<String, Integer> mp= new HashMap<>();
        mp.put("Sugar",120);
        mp.put("Rice",150);
        mp.put("Tea",100);

        mp.put("Rice",180);

        System.out.println("updated product prices: "+mp);
    }
    
}
