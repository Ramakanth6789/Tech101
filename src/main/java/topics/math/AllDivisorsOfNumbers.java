package topics.math;

public class AllDivisorsOfNumbers {
    public static void main(String[] args) {
        printDivisorsBetter(9);

    }

    public static void printDivisors(int number) {
        for(int i=1; i<=number; i++){
            if(number%i==0){
                System.out.println(i);
            }
        }
    }

    public static void printDivisorsBetter(int number) {
        for(int i=1; i*i<=number; i++){
            if (number % i == 0) {
                System.out.println(i);

                if(i!=number/i){
                    System.out.println(number / i);
                }
            }
        }
    }
}
