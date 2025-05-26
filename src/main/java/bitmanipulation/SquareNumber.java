package bitmanipulation;

public class SquareNumber {
    //We can say that N is a power of 2 or not based on the value of N&(N-1).
    public static void main(String[] args) {
        System.out.println(isTwoPower(256));

    }

    private static boolean isTwoPower(int i) {
        return (i & (i - 1)) == 0;
    }
}
