package topics.math;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SieveOfErathosthenes {
    /*
    Create an boolean array with default true values and start from 2 keep incrementing and with making i*i false
     */
    public static void main(String[] args) {
        int number = 30;
        System.out.println("All primes before number " + number + " are as below ");
        sieve(number);
    }

    private static void sieve(int number) {
        boolean[] prime = new boolean[number + 1];
        Arrays.fill(prime, true);

        for(int i=2; i*i<number; i++){
            if(prime[i]){
                for(int j=i*i; j<=number; j+=i){
                    prime[j] = false;
                }
            }
        }
        System.out.println(IntStream.range(2,number+1).
                filter(i->prime[i]).
                mapToObj(String::valueOf).
                collect(Collectors.joining(" ")));
    }


}

