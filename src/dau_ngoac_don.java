import java.util.ArrayList;
import java.util.List;

public class dau_ngoac_don {
    public static void main(String[] args) {
        String a = "(()[]({{}}))(){(())}))";
        System.out.println(solve(a));


    }

    public static String solve(String s) {
        // Write your code here
        List<String> listOpenBracket = new ArrayList<>();
        String result = "True";
        for (int i = 0; i < s.length(); i++) {
            String nowBracket = new String(s.getBytes(), i, 1);
            int index = listOpenBracket.size();
            if (nowBracket.equals("(") || nowBracket.equals("[") || nowBracket.equals("{")) {
                listOpenBracket.add(nowBracket);
            } else if (listOpenBracket.size()==0){
                result = "False";
            } else if (nowBracket.equals(")")) {
                if (listOpenBracket.get(index-1).equals("(")) {
                    listOpenBracket.remove(index - 1);
                } else {
                    result = "False";
                }
            } else if (nowBracket.equals("]")) {
                if (listOpenBracket.get(index - 1).equals("[")) {
                    listOpenBracket.remove(index - 1);
                } else {
                    result = "False";
                }
            } else if (nowBracket.equals("}")) {
                if (listOpenBracket.get(index - 1).equals("{")) {
                    listOpenBracket.remove(index - 1);
                } else {
                    result = "False";
                }
                }
            }
            if (listOpenBracket.size() != 0) {
                result = "False";
            }
            return result;

        }
    }
