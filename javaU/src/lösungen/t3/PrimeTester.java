package lösungen.t3;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeTester {
    public static void main(String[] args) {
        PrimeTester primeTester = new PrimeTester();
        primeTester.divisors(22);
    }
    public void divisors(int n) {
        if (n >= 1) {
            System.out.println(IntStream.rangeClosed(1, n).filter(i -> n%i == 0).mapToObj(i ->""+i).collect(Collectors.joining()));
        }
    }

    public void properDivisors() {

    }

    public boolean isPrime(int n) {
        return n > 2 && IntStream.rangeClosed(2, (int) Math.sqrt(n)).noneMatch(o -> (n % o == 0));
    }

}