import java.util.HashMap;
import java.util.Map;

public class Main {

    public static String text =
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt" +
            " ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip" +
            " ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. " +
            "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {

        Map<Character, Integer> charsInMap = new HashMap<>();
        String textIsLoweCase = text.toLowerCase();
        for (int i = 0; i < textIsLoweCase.length(); i++) {
            char ch = textIsLoweCase.charAt(i);
            if (Character.isLetter(ch)) {
                if (!charsInMap.containsKey(ch)) {
                    charsInMap.put(ch, 1);
                } else {
                    charsInMap.put(ch, charsInMap.get(ch) + 1);
                }
            }
        }

        int maxValueInCharsInMap = -1;
        int minValueInCharsInMap = Integer.MAX_VALUE;

        for (Map.Entry<Character, Integer> kv: charsInMap.entrySet()) {
            if (kv.getValue() > maxValueInCharsInMap) {
                maxValueInCharsInMap = kv.getValue();
            }
        }

        for (Map.Entry<Character, Integer> kv: charsInMap.entrySet()) {
            if (kv.getValue() < minValueInCharsInMap) {
                minValueInCharsInMap = kv.getValue();
            }
        }

        System.out.println("Минимальное значение: " + minValueInCharsInMap);
        System.out.println("Максимальное значение: " + maxValueInCharsInMap);
    }
}
