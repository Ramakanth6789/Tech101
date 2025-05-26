package arrays;

import java.util.*;
import java.util.stream.IntStream;

public class MoveZerosToEndStreams {
    public static int[] moveZerosToEndOfArray(int[] array) {
        if (array == null || array.length == 0) {
            return array;
        }

        int nonZeroCount = (int) IntStream.range(0, array.length)
                .filter(i -> array[i] != 0)
                .count();

        int[] result = IntStream.concat(
                IntStream.range(0, array.length)
                        .filter(i -> array[i] != 0)
                        .map(i -> array[i]),
                IntStream.range(0, array.length - nonZeroCount)
                        .map(i -> 0)
        ).toArray();

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {0, 1, 0, 3, 12};
        int[] result1 = moveZerosToEndOfArray(arr1);
        System.out.println("Original: " + Arrays.toString(arr1));
        System.out.println("Result: " + Arrays.toString(result1));

        int[] arr2 = {0, 0, 0, 0, 1};
        int[] result2 = moveZerosToEndOfArray(arr2);
        System.out.println("Original: " + Arrays.toString(arr2));
        System.out.println("Result: " + Arrays.toString(result2));

        int[] arr3 = {1, 2, 3, 4, 5};
        int[] result3 = moveZerosToEndOfArray(arr3);
        System.out.println("Original: " + Arrays.toString(arr3));
        System.out.println("Result: " + Arrays.toString(result3));

        int[] arr4 = {0, 0, 0, 0, 0};
        int[] result4 = moveZerosToEndOfArray(arr4);
        System.out.println("Original: " + Arrays.toString(arr4));
        System.out.println("Result: " + Arrays.toString(result4));

        int[] arr5 = {1,0,2,0,3,0,4,0};
        int[] result5 = moveZerosToEndOfArray(arr5);
        System.out.println("Original: " + Arrays.toString(arr5));
        System.out.println("Result: " + Arrays.toString(result5));

        int[] arr6 = {};
        int[] result6 = moveZerosToEndOfArray(arr6);
        System.out.println("Original: " + Arrays.toString(arr6));
        System.out.println("Result: " + Arrays.toString(result6));

        int[] arr7 = null;
        int[] result7 = moveZerosToEndOfArray(arr7);
        System.out.println("Original: null");
        System.out.println("Result: " + Arrays.toString(result7));
    }
}
