import java.util.*;

public class AllSwap {
    public static String[] allSwap(String[] originalWords) {
        Map<String, Integer> swapIndexMap = new HashMap<>();
        for (int index = 0; index < originalWords.length; index++) {
            String currentWord = originalWords[index];
            String firstCharacter = currentWord.substring(0, 1);
            if (swapIndexMap.containsKey(firstCharacter)) {
                int savedIndex = swapIndexMap.get(firstCharacter);

                String temporaryWord = originalWords[savedIndex];
                originalWords[savedIndex] = originalWords[index];
                originalWords[index] = temporaryWord;

                swapIndexMap.remove(firstCharacter);
            } else {
                swapIndexMap.put(firstCharacter, index);
            }
        }
        return originalWords;
    }
    public static void main(String[] args) {

    }
}
