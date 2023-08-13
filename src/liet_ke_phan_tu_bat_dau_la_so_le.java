import java.util.ArrayList;
import java.util.List;

public class liet_ke_phan_tu_bat_dau_la_so_le {
    public static void main(String[] args) {
        List<Integer> array = getOddHeadNumbers(" 1122 22233 -123 0235 0123");
        for (int i : array) {
            System.out.println(i);
        }
    }
    public static List<Integer> getOddHeadNumbers(String s) {
        String trueInput = s.replaceAll("\\s+", " ");

        char checkSpake = trueInput.charAt(0);
        if (checkSpake == ' ') {
            trueInput = new String(trueInput.getBytes(),1,trueInput.length()-1);
        }

        // Write your code here
        String[] listNumber = trueInput.split(" ");
        List<Integer> listOddNumber = new ArrayList<>();
        for (String number : listNumber) {
            char a = number.charAt(0);
            int firstNumber;
            if (a == '-' || a == '+' || a == '0') {
                firstNumber = Integer.parseInt(new String(number.getBytes(), 0, 2));
            } else {
                firstNumber = Integer.parseInt (new String(number.getBytes(),0,1));
            }

            if ( firstNumber % 2 != 0) {
                listOddNumber.add(Integer.parseInt(number));
            }
        }

        if (listOddNumber.size() == 0) {
            listOddNumber.add(-1);
        }
        return listOddNumber;
    }
}
