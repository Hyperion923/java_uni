package lösungen.t3;

public class Pruefziffer {
    static int[] kNummer = {4, 6, 8, 3, 4, 5, 7, 8, 2, 9, 3, 7, 6, 5, 2};

    public static void main(String[] args) {
        Pruefziffer pruefziffer = new Pruefziffer();
        System.out.println(pruefziffer.luhn(kNummer));
    }

    public int luhn(int[] digits) {
        int result = 0;
        for (int i = 0; i < digits.length; i += 2) {
            int cross = 0;
            int x = (digits[i] * 2);
            while (x != 0) {
                cross += (x % 10);
                x /= 10;
            }
            digits[i] = cross;
        }
        for (int digit : digits) {
            result += digit;
        }
        if (10 - result % 10 == 10) {
            return 0;
        }
        return 10 - result % 10;

    }
}
