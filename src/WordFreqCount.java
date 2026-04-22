import java.util.HashMap;
import java.util.Map;
public class WordFreqCount {
    public static Map<String, Integer> wordCount(String[] wordsToCount) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String currentWord : wordsToCount) {
            if (frequencyMap.containsKey(currentWord)) {
                frequencyMap.put(currentWord, frequencyMap.get(currentWord) + 1);
            } else {
                frequencyMap.put(currentWord, 1);
            }
        }
        return frequencyMap;
    }

    public static void main (String[] args){

    }
}
