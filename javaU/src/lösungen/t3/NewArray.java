package lösungen.t3;

public class NewArray {

    public static void main(String[] args) {
        NewArray newArray = new NewArray();
        newArray.outPut();
    }

    void outPut() {
        String[] x = {"Ich", "finde", "java", "spitze"};
        for (String s : x) {
            System.out.println(s);
        }
    }

    public void printNumbers(int[] numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public int totalLength(String[] words) {
        int result = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i] == null) {
                result += 0;
            } else {
                result += words[i].length();
            }
        }
        return result;
    }
}
