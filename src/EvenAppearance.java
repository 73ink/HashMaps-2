import java.util.HashMap;
import java.util.Map;

public class EvenAppearance {
    public static String wordAppend(String[] inputWords) {
        Map<String, Integer> appearanceTracker = new HashMap<>();
        String finalText = "";
        for (String currentWord : inputWords) {
            if (appearanceTracker.containsKey(currentWord)) {
                appearanceTracker.put(currentWord, appearanceTracker.get(currentWord) + 1);
            } else {
                appearanceTracker.put(currentWord, 1);
            }
            if (appearanceTracker.get(currentWord) % 2 == 0) {
                finalText += currentWord;
            }
        }
        return finalText;
    }
    public static void main(String[] args) {
        System.out.println(wordAppend(new String[]{"a", "b", "a"}));
        System.out.println(wordAppend(new String[]{"a", "b", "a", "c", "a", "d", "a"}));
        System.out.println(wordAppend(new String[]{"a", "", "a"}));
    }
}
