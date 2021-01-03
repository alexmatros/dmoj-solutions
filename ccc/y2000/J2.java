package y2000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class J2 {
    public static boolean rotatable(int num) {
        Character[] exclude = new Character[]{'2', '3', '4', '5', '7'};
        String numAsString = Integer.toString(num);

        for (int i = 0; i < numAsString.length(); i++) {
            if (Arrays.asList(exclude).contains(numAsString.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    public static int transform(int num) {
        StringBuilder transformed = new StringBuilder();
        String numAsString = Integer.toString(num);

        for (int i = 0; i < numAsString.length(); i++) {
            if (numAsString.charAt(i) == '6') {
                transformed.append(9);
            }
            else if (numAsString.charAt(i) == '9') {
                transformed.append(6);
            }
            else {
                transformed.append(numAsString.charAt(i));
            }
        }

        return Integer.parseInt(transformed.toString());
    }

    public static int rotate(int num) {
        StringBuilder reversed = new StringBuilder(Integer.toString(num));
        reversed.reverse();

        return Integer.parseInt(reversed.toString());
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int min = Integer.parseInt(br.readLine());
        int max = Integer.parseInt(br.readLine());
        int count = 0;

        for (int curNum = min; curNum <= max; curNum++) {
            if (rotatable(curNum)) {
                if (curNum == transform(rotate(curNum))) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
