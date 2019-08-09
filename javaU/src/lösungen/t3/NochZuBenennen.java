package lösungen.t3;

public class NochZuBenennen {
    public static void main(String[] args) {
        NochZuBenennen nochZuBenennen = new NochZuBenennen();
        nochZuBenennen.printDiamond(3);
    }
    public void printStars(int number){
        for(int i = 0; i< number;i++){
            System.out.print("*");
        }

    }
    public void printTriangle(int number){
        for (int i = 0; i< number ; i++){
            for (int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }

    public void printDiamond(int number) {
        int space = number;
        int abbruch1 = number + 1;
        int abbruchStern = 1;

        for (int i = 0; i < abbruch1; i++) {
            for (int s = 0; s < space; s++) {
                System.out.print(" ");
            }
            space--;
            for (int stars = 0; stars < abbruchStern; stars++) {
                String ausgabe = "";
                ausgabe = ausgabe + "*";
                System.out.print(ausgabe);
            }
            abbruchStern += 2;
            System.out.println();
        }
        space = 1;
        int abb = 2 * number - 1;
        for (int i = 0; i < number; i++) {
            for (int s = 0; s < space; s++) {
                System.out.print(" ");
            }
            space++;
            for (int star = 0; star < abb; star++) {
                System.out.print("*");
            }
            abb -= 2;
            System.out.println();
        }
    }

}


