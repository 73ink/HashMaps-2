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
        }
        return finalText;
    }
    public static void main(String[] args) {

    }
}
