package lösungen.t3;

import java.util.Arrays;

public class Dreieck {


    public static void main(String[] args) {
        Dreieck dreieck = new Dreieck();
        Arrays.stream(dreieck.bino(25)).forEach(ints -> System.out.println(Arrays.toString(ints)));
    }
    public int[][] bino(int rows) {
        int[][] dreieck = new int[rows][];
        for (int i = 1; i <= rows; i++) {
            int[] row = new int[i];
            int counter = 0;
            while (counter < i) {

                if (counter == 0 ) {
                    row[counter] = 1;
                } else if (counter == i-1) {
                    row[i-1] = 1;
                } else {
                    row[counter] = dreieck[i - 2][counter - 1] + dreieck[i - 2][counter];
                }

                counter++;
            }
            dreieck[i-1] = row;
        }
        return dreieck;
    }
}
