import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ket_hop_chu_cai_cua_mot_so_dien_thoai {
    public static void main(String[] args) {
        System.out.println(solve(23));

    }

    public static String solve(int n) {
        // Write your code here
        String input = Integer.toString(n);

        List<String> listResult = new ArrayList<>();

        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char a = input.charAt(i);
            if (a == '1') {
                continue;
            }

            List<String> listWord = getWold(a);

            List<String> listNow = new ArrayList<>();

            if (listResult.size() == 0) {
                listResult = listWord;
            } else {
                for (String wordResult : listResult) {
                    for (String word : listWord) {
                        listNow.add(wordResult + word);
                    }
                }
                listResult = listNow;
            }
        }

        for (String a : listResult) {
            result += a + " ";
        }

        return result;
    }

    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }

    public static List<String> getWold(char n) {
        List<String> listWorld = new ArrayList<>();

        List<String> listNumber2 = new ArrayList<>(Arrays.asList("a","b","c"));
        List<String> listNumber3 = new ArrayList<>(Arrays.asList("d","e","f")) ;
        List<String> listNumber4 = new ArrayList<>(Arrays.asList("g","h","i")) ;
        List<String> listNumber5 = new ArrayList<>(Arrays.asList("j","k","l"));
        List<String> listNumber6 = new ArrayList<>(Arrays.asList("m","n","o"));
        List<String> listNumber7 = new ArrayList<>(Arrays.asList("p","q","r","s"));
        List<String> listNumber8 = new ArrayList<>(Arrays.asList("t","u","v"));
        List<String> listNumber9 = new ArrayList<>(Arrays.asList("w","x","y","z"));


        switch (n) {
            case '1' :
            case '2' : listWorld = listNumber2;break;
            case '3' : listWorld = listNumber3;break;
            case '4' : listWorld = listNumber4;break;
            case '5' : listWorld = listNumber5;break;
            case '6' : listWorld = listNumber6;break;
            case '7' : listWorld = listNumber7;break;
            case '8' : listWorld = listNumber8;break;
            case '9' : listWorld = listNumber9;break;
        }

        return listWorld;
    }
}

