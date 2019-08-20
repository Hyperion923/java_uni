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

    public boolean[] sieve(int n) {
        boolean[] result = new boolean[n];
        Arrays.fill(result, true);
//        List<Integer> list = IntStream.rangeClosed(2,n).map(operand -> operand * operand).filter(value -> value < n).boxed().collect(Collectors.toList());
        List<Integer> list = IntStream.rangeClosed(2, n).filter(value -> IntStream.rangeClosed(2, n).allMatch(value1 -> value1 % 2 == 0)).boxed().collect(Collectors.toList());
        for (int i = 0; i < list.size(); i++) {
            result[i] = false;
        }

        return result;
    }
}
