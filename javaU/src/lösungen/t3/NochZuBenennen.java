package lösungen.t3;

public class NochZuBenennen {
    public static void main(String[] args) {
        NochZuBenennen nochZuBenennen = new NochZuBenennen();
        nochZuBenennen.printDiamonds(2);
    }

    void printDiamonds(int number) {
        int i, j, space = 1;
        int newNumber = 2 * number - 1;
        space = newNumber - 1;
        for (j = 1; j <= newNumber; j++) {
            for (i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            space--;
            for (i = 1; i <= 2 * j - 1; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        space = 1;
        for (j = 1; j <= newNumber - 1; j++) {
            for (i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            space++;
            for (i = 1; i <= 2 * (newNumber - j) - 1; i++) {
                System.out.print("*");
            }
            System.out.println("");

        }

    }

}
