import java.util.HashMap;
import java.util.Map;
public class FirstLastCharacter {
    public static Map<String, String> pairs(String[] enteredWords){

    Map<String, String> characterPairMap = new HashMap<>();
        for (String currentWord : enteredWords) {
            String firstCharacter = currentWord.substring(0, 1);
            String lastCharacter = currentWord.substring(currentWord.length() - 1);
            characterPairMap.put(firstCharacter, lastCharacter);
        }
        return characterPairMap;
}
    public static void main (String[] args){

    }
}
