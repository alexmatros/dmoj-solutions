package y2000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S1 {
    static int martha;
    static int machine1;
    static int machine2;
    static int machine3;
    static int gamesPlayed;

    public static void playsGame(int machine) {
        martha--;
        switch (machine) {
            case 1 -> machine1++;
            case 2 -> machine2++;
            case 3 -> machine3++;
        }
        gamesPlayed++;
    }

    public static boolean win(int machine) {
        switch (machine) {
            case 1 -> {
                if (machine1 % 35 == 0) {
                    return true;
                }
            }
            case 2 -> {
                if (machine2 % 100 == 0) {
                    return true;
                }
            }
            case 3 -> {
                if (machine3 % 10 == 0) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        martha = Integer.parseInt(br.readLine());
        machine1 = Integer.parseInt(br.readLine());
        machine2 = Integer.parseInt(br.readLine());
        machine3 = Integer.parseInt(br.readLine());

        boolean broke = false;

        while (!broke) {
            playsGame(1);
            if (win(1)) {
                martha += 30;
            }
            else if (martha == 0) {
                broke = true;
                continue;
            }

            playsGame(2);
            if (win(2)) {
                martha += 60;
            }
            else if (martha == 0) {
                broke = true;
                continue;
            }

            playsGame(3);
            if (win(3)) {
                martha += 9;
            }
            else if (martha == 0) {
                broke = true;
                continue;
            }
        }

        System.out.println("Martha plays " + gamesPlayed + " times before going broke.");
    }
}
