// Q4:Write a Java Program to find the duplicate characters in a string.

import java.util.HashMap;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String str = "abcdeeffgh";

        // Create a HashMap to store character frequencies
        HashMap<Character, Integer> charCounts = new HashMap<>();

        // Convert the string to lowercase to handle case sensitivity
        str = str.toLowerCase();

        // Count the occurrences of each character
        for (char c : str.toCharArray()) {
            if (c != ' ') { // Ignore spaces
                if (charCounts.containsKey(c)) {
                    // If the character is already in the HashMap, increment its count
                    charCounts.put(c, charCounts.get(c) + 1);
                } else {
                    // If the character is not in the HashMap, add it with a count of 1
                    charCounts.put(c, 1);
                }
            }
        }

        // Print the duplicate characters
        System.out.println("Duplicate characters in the string:");
        for (char c : charCounts.keySet()) {
            if (charCounts.get(c) > 1) {
                System.out.println(c + ": " + charCounts.get(c));
            }
        }
    }
}
