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
        System.out.println(wordCount(new String[]{"a", "b", "a", "c", "b"}));
        System.out.println(wordCount(new String[]{"c", "b", "a"}));
        System.out.println(wordCount(new String[]{"c", "c", "c", "c"}));
    }
}
