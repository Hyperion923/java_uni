package lösungen.t3;

import java.util.stream.IntStream;

public class PrimeTester {
    public void divisors() {

    }

    public void properDivisors() {

    }

    public boolean isPrime(int n) {
        return n > 2 && IntStream.rangeClosed(2, (int) Math.sqrt(n)).noneMatch(o -> (n % o == 0));
    }

}