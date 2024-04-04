import java.util.HashMap;

public class question_three {
    public static void main(String[] args) {
        String inputString = "Hello world this is a sample string hello world";
        
        // Split the input string into words
        String[] words = inputString.split(" ");
        
        // Create a HashMap to store word counts
        HashMap<String, Integer> wordCountMap = new HashMap<>();
        
        // Iterate through the words array and update word counts in the HashMap
        for (String word : words) {
            // Convert the word to lowercase to avoid case sensitivity
            word = word.toLowerCase();
            
            // If the word already exists in the map, increment its count
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                // If the word doesn't exist, add it to the map with a count of 1
                wordCountMap.put(word, 1);
            }
        }
        
        // Print the word counts
        for (String word : wordCountMap.keySet()) {
            System.out.println(word + ": " + wordCountMap.get(word));
        }
    }
}
