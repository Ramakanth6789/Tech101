package topics.math;

public class PowerIterativeApproach {
    /*
    3 power 5 is return as 5 =     1      0      1
                               5pow2, 5pow1, 5pow0
     */
    public static void main(String[] args) {
        System.out.println(power(3, 5));
    }

    public static int power(int a, int b) {
        int result = 1;

        while (b > 0) {
            if ((b & 1) == 1) {  // checking whether b is even or odd.
                result *= a;
            }
            b = b >> 1; // >> is right shift operater == b/2
            a = a * a;
        }
        return result;
    }
}
