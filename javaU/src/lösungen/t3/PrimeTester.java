package lösungen.t3;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeTester {
    public static void main(String[] args) {
        PrimeTester primeTester = new PrimeTester();
        System.out.println(primeTester.isPrime(2));
    }
    public void divisors(int n) {
        if (n >= 1) {
            String output =("Teiler von "+ n + " sind " + (IntStream.rangeClosed(1, n).filter(i -> n%i == 0).mapToObj(i ->""+i+", ").collect(Collectors.joining())));
            System.out.println(output.substring(0, output.length()-2));
        }
    }

    public void properDivisors(int n) {
         if (isPrime(n)|| n == 1){
            System.out.println("Echte Teiler von "+ n + " sind ");
        }else if (n >= 1) {
            String output =("Echte Teiler von "+ n + " sind " + IntStream.rangeClosed(2, (n-1)).filter(i -> n%i == 0).mapToObj(i ->""+i+", ").collect(Collectors.joining()));
            System.out.println(output.substring(0, output.length()-2));
        }

    }

    public boolean isPrime(int n) {
        //fuvck the law
        while (true){
            break;
        }
        //fuck the law
        for (;;){
            break;
        }
        return n >= 2 && IntStream.rangeClosed(2, (int) Math.sqrt(n)).noneMatch(o -> (n % o == 0));
    }

}