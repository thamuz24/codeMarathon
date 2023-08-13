import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class thue_xe_da_ngoai {
    public static void main(String[] args) {
        List<Integer> s = new ArrayList<>(Arrays.asList(1,1,3,3,3,2,4));
        System.out.println(solve(5,s));
    }
    public static int solve(int n, List<Integer> s) {
        // Write your code here
        int numberCar = 0;

        Integer squat1 = getSquat(1,s);
        Integer squat2 = getSquat(2,s);
        Integer squat3 = getSquat(3,s);
        Integer squat4 = getSquat(4,s);

        numberCar += squat4;

        if (squat1 == squat3) {
            numberCar += squat1;
            numberCar += squat2 / 2;
            numberCar += (squat2 % 2 > 0)? 1 : 0;
        } else if (squat1 > squat3) {
            numberCar += squat3;
            squat2 += squat1 / 2;
            numberCar += squat2 / 2;
            squat2 = squat2 % 2;
            squat1 = squat1 % 2;
            numberCar += ((squat1 + squat2) > 0) ? 1 : 0;
        } else {
            numberCar += squat1;
            numberCar += squat3 - squat1;
            numberCar += squat2/2;
            numberCar += (squat2%2 > 0) ? 1 : 0;
        }

        return numberCar;

    }

    public static Integer getSquat(int n, List<Integer> s) {
        int squat = 0;
        for (Integer i : s) {
            if (i == n) {
                squat += 1;
            }
        }
        return squat;
    }

}
