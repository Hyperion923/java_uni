package lösungen.t3;

public class NewArray {
    static String[] x = {"Ich","finde","java","spitze"};

    public static void main(String[] args) {
        NewArray newArray = new NewArray();
        newArray.outPut();
    }
    void outPut(){
        for (int i = 0; i < x.length; i++){
            System.out.println(x[i]);
        }
    }
}
