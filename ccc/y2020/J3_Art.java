package y2020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J3_Art {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int lines = Integer.parseInt(br.readLine());

        int[] bottomLeft = new int[] {100, 100};
        int[] topRight = new int[] {0, 0};

        for (int i = 0; i < lines; i++) {
            String[] coords = br.readLine().split(",");
            int x = Integer.parseInt(coords[0]);
            int y = Integer.parseInt(coords[1]);

            if (x < bottomLeft[0]) {
                bottomLeft[0] = x;
            }

            if (x > topRight[0]) {
                topRight[0] = x;
            }

            if (y < bottomLeft[1]) {
                bottomLeft[1] = y;
            }

            if (y > topRight[1]) {
                topRight[1] = y;
            }
        }

        System.out.println((bottomLeft[0] - 1) + "," + (bottomLeft[1] - 1));
        System.out.println((topRight[0] + 1) + "," + (topRight[1] + 1));
    }
}
