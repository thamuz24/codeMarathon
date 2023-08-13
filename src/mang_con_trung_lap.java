import java.util.ArrayList;
import java.util.List;

public class mang_con_trung_lap {
    public static String solve(String parentString, String childString) {
        // Write your code here
        List<String> childList = new ArrayList<>();
        List<Integer> duplicateChild = new ArrayList<>();

        List<String> parentList = new ArrayList<>();
        List<Integer> duplicateParent = new ArrayList<>();

        for (String value : (childString.split(" "))) {
            if (childList.contains(value)) {
                int index = childList.indexOf(value);
                duplicateChild.set(index, duplicateChild.get(index) + 1);
            } else {
                childList.add(value);
                duplicateChild.add(1);
            }
        }


        
        for (String value : (parentString.split(" "))) {
            if (parentList.contains(value)) {
                int index = parentList.indexOf(value);
                duplicateParent.set(index, duplicateParent.get(index) + 1);
            } else {
                parentList.add(value);
                duplicateParent.add(1);
            }
        }
        return "";

    }
}
