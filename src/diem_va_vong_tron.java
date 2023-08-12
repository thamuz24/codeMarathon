
import java.util.List;

public class diem_va_vong_tron {
    public static int solve(List<List<Double>> point, List<Double> r) {
        int result = -1;
        for (int i = 0; i < r.size(); i++) {
            boolean isBig = true;
            Double radius = r.get(i);

            for (List<Double> childPoint : point) {
                for (Double num : childPoint) {
                    if (num > radius) {
                        isBig = false;
                        break;
                    }
                }
            }

            if (isBig) {
                result = i;
                break;
            }
        }
        return result;
    }
}
