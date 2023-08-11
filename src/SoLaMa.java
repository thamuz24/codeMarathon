public class SoLaMa {
    public static void main(String[] args) {
        int I = 1;
        int V = 5;
        int X = 10;
        int L = 50;
        int C = 100;
        int D = 500;
        int M = 1000;

        String s = "MDIIVXXXD";
        int values = 0;

        for (int i = s.length(); i > 0; i--) {
            int valueNow = 0;
            String textNow = new String(s.getBytes(),i-1,1);
            switch (textNow) {
                case "I": valueNow = I;
                    break;
                case "V": valueNow = V;
                    break;
                case "X": valueNow = X;
                    break;
                case "L": valueNow = L;
                    break;
                case "C": valueNow = C;
                    break;
                case "D": valueNow = D;
                    break;
                case "M": valueNow = M;
                    break;
            }

            if (3*valueNow < values) {
                valueNow = -valueNow;
            }
            values += valueNow;
            System.out.println(values);
        }

    }
}
