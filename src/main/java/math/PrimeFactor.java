package math;

import java.util.*;

public class PrimeFactor {
    public static void main(String[] args) {
        List<Integer> primeFactors = primefactors(1092);
        System.out.println(primeFactors);
    }

    private static List<Integer> primefactors(int number) {

        List<Integer> primeFactorsList = new ArrayList<>();

        while (number % 2 == 0) {
            primeFactorsList.add(2);
            number = number / 2;
        }
        int counter = (int) Math.sqrt(number);

        for (int i = 3; i <= counter; i = i + 2) {
            while (number % i == 0) {
                primeFactorsList.add(i);
                number = number / i;
            }
        }
        return primeFactorsList;
    }

}
