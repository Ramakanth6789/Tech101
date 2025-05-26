package arrays;

import java.util.*;

public class EquilibriumIndex {
    /*
    First add the array name it rightsum. In loop, add to leftSum and subtract the rightsum, and keep comparing leftsum and right sum.
     */
    public static void main(String[] args) {
//        int[] array = new int[]{-7, 1, 5, 2, -4, 3, 0};
        int[] array = new int[]{-3,-2,-1,0,1,2,3};

        System.out.println("index of equilibrium is "+ equilibriumIndex(array));

    }

    public static int equilibriumIndex(int[] array) {

        int sum = Arrays.stream(array).sum();
        int leftSum = 0;
        int rightSum = sum;

        for (int i = 0; i < array.length; i++) {
            leftSum = leftSum + array[i];
            rightSum -= array[i];

            if (leftSum == rightSum) {
                return i;
            }
        }
        return -1;
    }
}
