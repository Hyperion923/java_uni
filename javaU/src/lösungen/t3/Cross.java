package lösungen.t3;

public class Cross {
    public static void main(String[] args) {
        Cross cross = new Cross();
        System.out.print(cross.repeatCrossTotal(1239));
    }

    public int crossTotal(int n) {
        int result = 0;
        if (n < 10){
            return n;
        }
        for (int i = 0; i < String.valueOf(n).length(); i++) {
            result += Integer.parseInt(Character.toString(("" + n).charAt(i)));
        }
        return result;
    }

    public int repeatedCrossTotal(int n){
        if (("" +n).length() != 1){
            return repeatedCrossTotal(crossTotal(n));
        }else return n;
    }
    public int repeatCrossTotal(int n){
        int result = 0;
        if (("" +n).length() != 1){
            for (int i = 0; i < String.valueOf(n).length(); i++) {
                result += Integer.parseInt(Character.toString(("" + n).charAt(i)));
            }
             return repeatCrossTotal(result);

        }else return n;
    }

}
