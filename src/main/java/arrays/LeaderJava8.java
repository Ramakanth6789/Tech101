package arrays;

import java.util.*;
import java.util.stream.IntStream;

public class LeaderJava8 {
    public static void main(String[] args) {
        int[] array = new int[]{16, 17, 4, 3, 5, 2};

        System.out.println(Arrays.toString(findLeader(array)));
    }
    public static int[] findLeader(int[] array){
        if (array == null || array.length == 0) {
            return new int[0];
        }

//        return IntStream.range(0, array.length)
//                .boxed()
//                .filter(i -> isLeader(array, i))
//                .map(i -> array[i])
//                .collect(Collectors.toList());

        return IntStream.range(0, array.length)
//                .boxed()
                .filter(i -> isLeader(array, i))
                .map(i -> array[i])
                .toArray();
    }
    private static boolean isLeader(int[] arr, int index) {
        for (int i = index + 1; i < arr.length; i++) {
            if (arr[i] > arr[index]) {
                return false;
            }
        }
        return true;
    }
}
