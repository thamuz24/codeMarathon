import java.io.*;

public class ma_hoa_thu {
    public static String decode(String encodedContent, int key) {
        // Write your code here
        String result = "";

        for (int i = key - 1; i >= 0; i--) {
            result += encodedContent.charAt(i);
        }

        for (int i = encodedContent.length() - 1; i >= key; i--) {
            result += encodedContent.charAt(i);
        }

        return result;
    }
}
