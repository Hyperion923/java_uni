package lösungen.t3;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeTester {
    public static void main(String[] args) {
        PrimeTester primeTester = new PrimeTester();
        primeTester.properDivisors(13);
    }
    public void divisors(int n) {
        if (n >= 1) {
            System.out.println(IntStream.rangeClosed(1, n).filter(i -> n%i == 0).mapToObj(i ->""+i+"\n").collect(Collectors.joining()));
        }
    }

    public void properDivisors(int n) {
        if (n >= 1) {
            System.out.println(IntStream.rangeClosed(2, (n-1)).filter(i -> n%i == 0).mapToObj(i ->""+i+"\n").collect(Collectors.joining()));
        }

    }

    public boolean isPrime(int n) {
        return n > 2 && IntStream.rangeClosed(2, (int) Math.sqrt(n)).noneMatch(o -> (n % o == 0));
    }

}