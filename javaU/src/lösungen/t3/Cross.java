package lösungen.t3;

public class Cross {
    public static void main(String[] args) {
        Cross cross = new Cross();
        System.out.print(cross.crossTotal(123));
    }

    public int crossTotal(int n) {
        int result = 0;
        for (int i = 0; i < n % 10; i++) {
            result += Integer.parseInt(Character.toString(("" + n).charAt(i)));
        }
        return result;
    }

    public int repeatCrossTotal(int n){
        if (("" +n).length() != 1){
            return repeatCrossTotal(crossTotal(n));
        }else return n;
    }
}
