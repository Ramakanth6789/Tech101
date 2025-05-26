package arrays;

import java.util.*;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arrayOne = new int[]{1, 2, 3, 4, 7, 8};
        int[] arrayTwo = new int[]{5, 6, 9, 10, 11};

        int[] result = mergeTwoSorted(arrayOne, arrayTwo);

        Arrays.stream(result).forEach(System.out::print);

    }

    private static int[] mergeTwoSorted(int[] arrayOne, int[] arrayTwo) {
        int length = arrayOne.length + arrayTwo.length;
        int[] result = new int[length];
        int j = 0;
        int k = 0;
        int i = 0;


        while (j < arrayOne.length && k < arrayTwo.length) {
            if (arrayOne[j] < arrayTwo[k]) {
                result[i++] = arrayOne[j++];
            } else {
                result[i++] = arrayTwo[k++];
            }
        }


        while (j < arrayOne.length) {
            result[i++] = arrayOne[j++];
        }
        while (k < arrayTwo.length) {
            result[i++] = arrayTwo[k++];
        }

        return result;

    }
}
