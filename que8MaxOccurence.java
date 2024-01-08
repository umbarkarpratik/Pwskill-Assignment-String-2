package StringAssignment06Feb;

import java.util.HashMap;
import java.util.Map;

public class que8MaxOccurence {
    public static void main(String[] args) {
        String input = "programming";
        char maxOccurringChar = findMaxOccurrence(input);
        System.out.println("Original String: " + input);
        System.out.println("Maximum Occurring Character: " + maxOccurringChar);
    }

    public static char findMaxOccurrence(String input) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Count occurrences of each character
        for (char ch : input.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // Find the character with the maximum count
        char maxOccurringChar = '\0';  // '\0' represents null character
        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxOccurringChar = entry.getKey();
            }
        }

        return maxOccurringChar;
    }
}
