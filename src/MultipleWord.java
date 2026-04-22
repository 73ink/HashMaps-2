import java.util.HashMap;
import java.util.Map;

public class MultipleWord {
    public static Map<String, Boolean> wordMultiple(String[] listedWords) {
        Map<String, Boolean> multipleStatusMap = new HashMap<>();
        for (String currentWord : listedWords) {
            if (multipleStatusMap.containsKey(currentWord)) {
                multipleStatusMap.put(currentWord, true);
            } else {
                multipleStatusMap.put(currentWord, false);
            }
        }
        return multipleStatusMap;
    }
    public static void main (String[] args){

    }
}
