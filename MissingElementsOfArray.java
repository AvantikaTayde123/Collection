import java.util.HashSet;

public class MissingNumbers {
    public static void findMissingNumbers(int[] arr, int n) {
        HashSet<Integer> set = new HashSet<>();

        // Add all elements from the array to the HashSet
        for (int num : arr) {
            set.add(num);
        }

        System.out.println("Missing numbers:");
        // Check for missing numbers in the range 1 to N
        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) { // If the number is not in the set, it's missing
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 6, 3}; // Unsorted array
        int n = 6; // We expect numbers from 1 to 6
        findMissingNumbers(arr, n);
    }
}
