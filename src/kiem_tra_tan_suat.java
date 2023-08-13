import java.util.ArrayList;
import java.util.List;

public class kiem_tra_tan_suat {
    public static void main(String[] args) {
        String s = "1 2 3 3 0 2 0 0 1";
        System.out.println(checkCountElement(s));
    }
    public static boolean checkCountElement(String s) {
        // Write your code here
        boolean result = true;
        String[] strings = s.split(" ");
        List<String> woldList = new ArrayList<>();
        List<Integer> duplicate = new ArrayList<>();
        for (String wold : strings) {
            if (woldList.contains(wold)) {
                int index = woldList.indexOf(wold);
                int value = duplicate.get(index) + 1;
                duplicate.set(index, value);
            } else {
                woldList.add(wold);
                duplicate.add(1);
            }
        }

        int check = duplicate.get(0);

        for (int value : duplicate) {
            if (check!=value) {
                result = false;
            }
        }
        return result;
    }
}
