import java.util.HashMap;
import java.util.Map;

public class WordCountUsingHashMap {
    public static void main(String[] args) {
        String str = "This is a sample string with some words. This string will be used to count the number of words.";

        
        String[] words = str.trim().split("\\s+");

        
        Map<String, Integer> wordCountMap = new HashMap<>();

        
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        
        System.out.println("Word count:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
