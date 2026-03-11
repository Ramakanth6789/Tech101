package topics.math;

public class PowerRecursion {
    public static void main(String[] args) {
        System.out.println(power(3, 5));
    }

    public static int power(int a, int b) {
        int temp;
        if (b == 0) {
            return 1;
        }
        temp = power(a, b / 2);

        if (b % 2 == 0) {
            return temp * temp;
        } else {
            return a*temp*temp;
        }
    }
}
