package y2020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J2_Epidemiology {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int p = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int r = Integer.parseInt(br.readLine());

        int totalInfected = n;
        int infectedToday = n;
        int curDay = 0;

        while (totalInfected <= p) {
            curDay++;
            infectedToday *= r;
            totalInfected += infectedToday;
        }

        System.out.println(curDay);
    }
}
