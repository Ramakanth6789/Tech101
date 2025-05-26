package arrays;

import java.util.*;
import java.util.stream.IntStream;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 2, 3, 4, 4, 4, 5, 5};
////        String result = Arrays.stream(removeDuplicate(array))
//                .mapToObj(String::valueOf)
//                .collect(Collectors.joining(", "));


//        System.out.println(result);

        System.out.println(Arrays.toString(removeDuplicate(array)));

    }

    public static int[] removeDuplicate(int[] array) {

//        int cursor = 0;
//
//        for(int i=1;i< array.length; i++){
//            if(array[cursor]!=array[i]){
//                array[++cursor] = array[i];
//            }
//        }
//
//        return Arrays.copyOfRange(array,0,cursor+1);

        return IntStream.range(0, array.length)
                .filter(i -> i == 0 || array[i] != array[i - 1])
                .map(i -> array[i])
                .toArray();

    }

}
