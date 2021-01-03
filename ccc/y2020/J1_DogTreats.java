package y2020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J1_DogTreats {
    private static boolean isHappy(int s, int m, int l) {
        return ((s) + (2 * m) + (3 * l)) >= 10;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int s = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int l = Integer.parseInt(br.readLine());

        if (isHappy(s, m, l)) {
            System.out.println("happy");
        }
        else {
            System.out.println("sad");
        }
    }
}
