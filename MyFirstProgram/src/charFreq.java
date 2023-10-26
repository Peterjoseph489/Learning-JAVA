import java.util.HashMap;
import java.util.Map;

public class charFreq {
	public static void main(String[] args) {
        String str = "Hello, world!"; // Set str to the desired input string

        if (str == null || str.isEmpty()) {
            System.out.println("Please provide a valid string.");
            return;
        }

        // Initialize a HashMap to store character frequencies.
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Loop through each character in the string.
        for (char c : str.toCharArray()) {
            if (frequencyMap.containsKey(c)) {
                frequencyMap.put(c, frequencyMap.get(c) + 1);
            } else {
                frequencyMap.put(c, 1);
            }
        }

        System.out.println("Character Frequency:");
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "': " + entry.getValue());
        }
    }
}
