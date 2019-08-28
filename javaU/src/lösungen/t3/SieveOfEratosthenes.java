package lösungen.t3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        SieveOfEratosthenes sieveOfEratosthenes = new SieveOfEratosthenes();
        System.out.print(Arrays.toString(sieveOfEratosthenes.sieve(6)));
    }


    public boolean[] sieve1(int n) {
        boolean[] result = new boolean[n];
        Arrays.fill(result, true);
//        List<Integer> list = IntStream.rangeClosed(2,n).map(operand -> operand * operand).filter(value -> value < n).boxed().collect(Collectors.toList());
//        List<Integer> list = IntStream.rangeClosed(2, n).filter(value -> IntStream.rangeClosed(2, n).filter(value1 -> (value1 % value == 0))).collect(Collectors.toList());

        Integer[] i = new Integer[5];
        System.out.println(Arrays.toString(i));

        return result;
    }
    public boolean[] sieve(int n) {
        int[] zahlen = new int[n - 1];
        boolean[] bool = new boolean[n - 1];
        int counter = 2;

        for (int i = 2; i <= n; i++) {
            zahlen[i - 2] = i;
            bool[i - 2] = false;
        }

        for (int i = 0; i < zahlen.length; i++) {
            if (!bool[i]) {
                counter = 2;
                while (counter * zahlen[i] <= zahlen[n-2]) {
                    bool[((counter * zahlen[i])-2)] = true;
                    counter++;
                }
            }
        }
        return bool;
    }
}
