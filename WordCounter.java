// Q3:Write a Java Program to count the number of words in a string using HashMap.


import java.util.HashMap;

public class WordCounter {
    public static void main(String[] args) {
        String text = "Hello world";

        // Remove punctuation and convert to lowercase
        text = text.replaceAll("[^a-zA-Z ]", "").toLowerCase();

        // Split the text into words
        String[] words = text.split("\\s+");

        // Create a HashMap to store word frequencies
        HashMap<String, Integer> wordCounts = new HashMap<>();

        // Count the occurrences of each word
        for (String word : words) {
            if (wordCounts.containsKey(word)) {
                // If the word is already in the HashMap, increment its count
                wordCounts.put(word, wordCounts.get(word) + 1);
            } else {
                // If the word is not in the HashMap, add it with a count of 1
                wordCounts.put(word, 1);
            }
        }

        // Display the word counts
        System.out.println("Word Counts:");
        for (String word : wordCounts.keySet()) {
            System.out.println(word + ": " + wordCounts.get(word));
        }
    }
}

