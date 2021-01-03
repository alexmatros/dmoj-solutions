package y2000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int dayOfWeek = Integer.parseInt(input[0]);
        int numDays = Integer.parseInt(input[1]);

        int curPlace = dayOfWeek;

        System.out.println("Sun Mon Tue Wed Thr Fri Sat");

        for (int i = 0; i < dayOfWeek - 1; i++) {
            System.out.print("    ");
        }

        for (int curDay = 1; curDay <= numDays; curDay++) {
            if (curDay < 10) {
                System.out.print("  " + curDay);
            }
            else {
                System.out.print(" " + curDay);
            }

            if (curPlace == 7) {
                System.out.println();
                curPlace = 0;
            }
            else if (curDay == numDays) {
                System.out.println();
            }
            else {
                System.out.print(" ");
            }

            curPlace++;
        }
    }
}
