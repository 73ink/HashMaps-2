import java.util.*;

public class FirstSwap {
    public static String[] firstSwap(String[] enteredWords) {
        Map<String, Integer> firstSwapTracker = new HashMap<>();
        for (int index = 0; index < enteredWords.length; index++) {
            String currentWord = enteredWords[index];
            String firstCharacter = currentWord.substring(0, 1);
            if (firstSwapTracker.containsKey(firstCharacter)) {
                int savedIndex = firstSwapTracker.get(firstCharacter);

                if (savedIndex != -1) {
                    String temporaryWord = enteredWords[savedIndex];
                    enteredWords[savedIndex] = enteredWords[index];
                    enteredWords[index] = temporaryWord;

                    firstSwapTracker.put(firstCharacter, -1);
                }
            } else {
                firstSwapTracker.put(firstCharacter, index);
            }
        }
        return enteredWords;
    }
    public static void main(String[] args){

    }
}
