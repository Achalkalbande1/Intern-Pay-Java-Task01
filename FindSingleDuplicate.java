import java.util.HashSet;

public class FindSingleDuplicate {
    public static int findDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        
        for (int num : nums) {
            if (seen.contains(num)) {
                return num;  // Found the duplicate
            }
            seen.add(num);
        }
        
        // No duplicate found
        return -1;
    }
    
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 2, 2};  // Example array with a duplicate
        int duplicate = findDuplicate(array);
        
        if (duplicate != -1) {
            System.out.println("The single duplicate is: " + duplicate);
        } else {
            System.out.println("No duplicate found.");
        }
    }
}
