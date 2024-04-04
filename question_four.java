import java.util.HashMap;

public class question_four {
    public static void main(String[] args) {
        String str = "hello world";
        
        // Create a HashMap to store character counts
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        
        // Convert the string to lowercase to ignore case sensitivity
        str = str.toLowerCase();
        
        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // If the character is not a space
            if (ch != ' ') {
                // If the character already exists in the map, increment its count
                if (charCountMap.containsKey(ch)) {
                    charCountMap.put(ch, charCountMap.get(ch) + 1);
                } else {
                    // If the character doesn't exist, add it to the map with a count of 1
                    charCountMap.put(ch, 1);
                }
            }
        }
        
        // Iterate through the HashMap to find characters with counts greater than 1
        System.out.println("Duplicate characters in the string:");
        for (char ch : charCountMap.keySet()) {
            if (charCountMap.get(ch) > 1) {
                System.out.println(ch + " : " + charCountMap.get(ch));
            }
        }
    }
}

