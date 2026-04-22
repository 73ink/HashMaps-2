import java.util.HashMap;
import java.util.Map;
public class WordLengthMap {
    public static Map<String, Integer> wordLen(String[] inputWords) {
        Map<String, Integer> wordLengthMap = new HashMap<>();
        for (String currentWord : inputWords) {
            wordLengthMap.put(currentWord, currentWord.length());
        }
        return wordLengthMap;
    }
    public static void main(String[] args) {

    }
}
