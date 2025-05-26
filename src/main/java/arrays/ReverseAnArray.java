package arrays;

import java.util.*;

public class ReverseAnArray  {
    public static void main(String[] args) {
        int[] array = new int[] {1, 2,3,4};
        int[] result = reverseArray(array);
        Arrays.stream(result).forEach(System.out::println);
    }
    public static int[] reverseArray(int[] array){
        int startPos=0;
        int endPos = array.length -1;
        int temp;

        while (startPos < endPos) {
            temp = array[startPos];
            array[startPos++] =  array[endPos];
            array[endPos--] =  temp;
//            startPos++;
//            endPos--;
        }

        return array;
    }
}
