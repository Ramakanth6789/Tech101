package bitmanipulation;

public class BitManipulation {
    public static int setBit(int num, int n) {
        // Left shift 1 by (n-1) positions to create a mask with the nth bit set
        System.out.println("n :"+n);
        int mask = 1 << (n - 1);
        System.out.println("mask :"+mask);

        // Use the OR operator to set the nth bit of num
        return num | mask;
    }

    public static void main(String[] args) {
        int num = 10; // Binary: 1010
        int n = 3;
        int result = setBit(num, n);
        System.out.println("Original number: " + num + " (Binary: " + Integer.toBinaryString(num) + ")");
        System.out.println("Number after setting bit at position " + n + ": " + result + " (Binary: " + Integer.toBinaryString(result) + ")");

        num = 5; // Binary: 0101
        n = 1;
        result = setBit(num, n);
        System.out.println("Original number: " + num + " (Binary: " + Integer.toBinaryString(num) + ")");
        System.out.println("Number after setting bit at position " + n + ": " + result + " (Binary: " + Integer.toBinaryString(result) + ")");

        num = 12; // Binary: 1100
        n = 4;
        result = setBit(num, n);
        System.out.println("Original number: " + num + " (Binary: " + Integer.toBinaryString(num) + ")");
        System.out.println("Number after setting bit at position " + n + ": " + result + " (Binary: " + Integer.toBinaryString(result) + ")");
        swap(2, 3);
    }

    private static void swap(int a, int b) {
        System.out.println("a: " + a + ", b: " + b);
        a = a ^ b;
        b = b ^ a;
        a = a ^ b;

        System.out.println("a: " + a + ", b: " + b);

    }
}