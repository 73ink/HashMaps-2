import java.util.HashMap;
import java.util.Map;
public class ZeroValueWordMap {
    public static Map<String, Integer> word0(String[] wordsFromList) {
        Map<String, Integer> zeroValueMap = new HashMap<>();
        for (String currentWord : wordsFromList) {
            zeroValueMap.put(currentWord, 0);
        }
        return zeroValueMap;
    }
    public static void main(String[] args){
        System.out.println(word0(new String[]{"a", "b", "a", "b"}));
        System.out.println(word0(new String[]{"a", "b", "a", "c", "b"}));
        System.out.println(word0(new String[]{"c", "b", "a"}));
    }
}
