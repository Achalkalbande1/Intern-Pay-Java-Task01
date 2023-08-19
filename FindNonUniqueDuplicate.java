import java.util.HashMap;
import java.util.Map;

public class FindNonUniqueDuplicate {
    public static int findNonUniqueDuplicate(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                return entry.getKey();  // Found a non-unique duplicate
            }
        }
        
        // No non-unique duplicates found
        return -1;
    }
    
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 2, 2, 5};  // Example array with a non-unique duplicate
        int nonUniqueDuplicate = findNonUniqueDuplicate(array);
        
        if (nonUniqueDuplicate != -1) {
            System.out.println("The non-unique duplicate is: " + nonUniqueDuplicate);
        } else {
            System.out.println("No non-unique duplicate found.");
        }
    }
}
