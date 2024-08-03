import java.util.HashMap;
import java.util.Map;

public class EvenElementFrequency {
    public static Map<Integer, Integer> countEvenFrequencies(int[] nums) {
        // Initialize the hash map
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Iterate through the array
        for (int num : nums) {
            // Check if the element is even
            if (num % 2 == 0) {
                // Update the count in the hash map
                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            }
        }

        return frequencyMap;
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 2, 6, 4, 8, 2, 6, 10};
        Map<Integer, Integer> frequencies = countEvenFrequencies(nums);

        // Print the frequencies of even elements
        for (Map.Entry<Integer, Integer> entry : frequencies.entrySet()) {
            System.out.println("Element: " + entry.getKey() + ", Frequency: " + entry.getValue());
        }
    }
}
