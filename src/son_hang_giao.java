import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class son_hang_giao {

    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();

        List<Integer> friend1 = new ArrayList<>();
        friend1.add(0);
        friend1.add(9);

        List<Integer> friend2 = new ArrayList<>();
        friend2.add(10);
        friend2.add(20);

//        List<Integer> friend3 = new ArrayList<>();
//        friend3.add(3);
//        friend3.add(14);
//
//        List<Integer> friend4 = new ArrayList<>();
//        friend4.add(15);
//        friend4.add(16);
//
//        List<Integer> friend5 = new ArrayList<>();
//        friend5.add(17);
//        friend5.add(20);


        arr.add(friend1);
        arr.add(friend2);
//        arr.add(friend3);
//        arr.add(friend4);
//        arr.add(friend5);

        System.out.println(solve(20, arr.size(), arr));
    }

    public static String solve(int m, int n, List<List<Integer>> arr) {
        // Write your code here
        String result = "NO";
        List<Integer> fence = new ArrayList<>();
        for (int i = 0; i <= m; i++) {
            fence.add(i);
        }

        for (int i = 0; i < n; i++) {
            int start = arr.get(i).get(0) + 1;
            int end = arr.get(i).get(1);

            if (end < start) {
                int convert = start;
                start = end;
                end = convert;
            }

            for (int j = start; j <= end; j++) {
                if (fence.contains(j)) {
                    fence.remove(fence.indexOf(j));
                }
            }
        }

        if (fence.isEmpty() || (fence.size() == 1 && fence.contains(0))) {
            result = "YES";
        }

        return result;
    }
}
