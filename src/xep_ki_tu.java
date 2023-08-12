import java.util.ArrayList;
import java.util.List;

public class xep_ki_tu {

    public static int checkContrain(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return 0;
        }
        // Write your code here
        List<String> listCharacter1 = new ArrayList<>();
        List<Integer> duplicateS1 = new ArrayList<>();
        List<String> listCharacter2 = new ArrayList<>();
        List<Integer> duplicateS2 = new ArrayList<>();

        for (int i = 0; i < s1.length(); i++) {
            char character1 = s1.charAt(i);
            char character2 = s2.charAt(i);

            if (listCharacter1.contains(character1)) {
                int index = listCharacter1.indexOf(character1);
                int newValue = duplicateS1.get(index) + 1;
                duplicateS1.add(index, newValue);
            } else {
                listCharacter1.add(new String(Character.toString(character1)));
                duplicateS1.add(1);
            }

            if (listCharacter2.contains(character2)) {
                int index = listCharacter2.indexOf(character2);
                int newValue = duplicateS2.get(index) + 1;
                duplicateS2.add(index, newValue);
            } else {
                listCharacter2.add(new String(Character.toString(character2)));
                duplicateS2.add(1);
            }
        }
        for (int i = 0; i < listCharacter1.size(); i++) {
            String character = listCharacter1.get(i);
            if (!listCharacter2.contains(character)) {
                return 0;
            } else if (duplicateS1.get(i) != duplicateS2.get(listCharacter2.indexOf(character))) {
                return 0;
            }
        }
        return 1;
    }
}
