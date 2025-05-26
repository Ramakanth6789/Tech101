package arrays;

import java.util.*;

public class LeftRotateAnArrayByNPlaces {

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7};

        System.out.println(Arrays.toString(rotatedArray(array, 2)));

    }

    public static int[] rotatedArray(int[] array, int times){
        int len = array.length;
        int[] result = new int[array.length];
        int counter = 0;

        for (int i = times % len; i < len; i++) {
            result[counter++] = array[i];
        }
        for (int i = 0; i < times % len; i++) {
            result[counter++] = array[i];
        }

        return result;
    }
}
