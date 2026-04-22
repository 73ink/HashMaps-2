import java.util.HashMap;
import java.util.Map;
public class FirstCharacterWord {
    public static Map<String, String> firstChar(String[] groupedWords) {
        Map<String, String> groupedCharacterMap = new HashMap<>();
        for (String currentWord : groupedWords) {
            String firstCharacter = currentWord.substring(0, 1);

            if (groupedCharacterMap.containsKey(firstCharacter)) {
                groupedCharacterMap.put(firstCharacter, groupedCharacterMap.get(firstCharacter) + currentWord);
            } else {
                groupedCharacterMap.put(firstCharacter, currentWord);
            }
        }
        return groupedCharacterMap;
    }
    public static void main (String[] args){

    }
}
