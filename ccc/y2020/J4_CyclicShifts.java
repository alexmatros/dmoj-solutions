package y2020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J4_CyclicShifts {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String t = br.readLine();
        String s = br.readLine();

        boolean containsShift = false;

        for (int i = 1; i <= s.length(); i++) {
            String shift = s.substring(i) + s.substring(0, i);

            if (t.contains(shift)) {
                containsShift = true;
                break;
            }
        }

        if (containsShift) {
            System.out.println("yes");
        }

        else {
            System.out.println("no");
        }
    }
}
