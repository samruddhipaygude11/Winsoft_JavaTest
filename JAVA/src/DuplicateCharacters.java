import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String str = "programming";

        
        Map<Character, Integer> charCountMap = new HashMap<>();

        
        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        
        System.out.println("Duplicate characters in the string:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
            }
        }
    }
}
