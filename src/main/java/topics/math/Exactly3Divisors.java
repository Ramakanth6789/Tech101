package topics.math;

public class Exactly3Divisors {
    public static void main(String[] args) {
        System.out.println(exactly3Divisors(30));
    }

//    public static int exactly3Divisors(int number) {
//        int count = 0;
//        for (int i = 1; i <= number; i++) {
//            if (numberOfDivisorsAreThree(i)) {
//                count++;
//            }
//        }
//        return count;
//    }
//
//    public static boolean numberOfDivisorsAreThree(int number) {
//
//        int count = 0;
//        for (int i = 1; i * i <= number; i++) {
//            if (number % i == 0) {
//                count++;
//                if (i != number / i) {
//                    count++;
//                }
//            }
//            if (count > 3) {
//                return false;
//            }
//        }
//        if (count == 3) {
//            return true;
//        }
//
//        return false;
//    }

    public static int exactly3Divisors(int number) {
        int count = 0;
        for (int i = 1; i*i <= number; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isPrime(int number) {
        if(number<2) return false;

        for(int i=2; i*i<=number; i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }

}
