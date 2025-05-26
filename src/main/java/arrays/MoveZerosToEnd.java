package arrays;

import java.util.*;

public class MoveZerosToEnd {
    public static void main(String[] args) {

        int[] array = new int[] {0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};

        System.out.println(Arrays.toString(moveZerosToEndOfArray(array)));
    }

    public static int[] moveZerosToEndOfArray(int[] array) {
        int cursor=0;

        for(int i=0; i<array.length; i++){
            if(array[i]!=0){
                array[cursor++] = array[i];
            }
        }
        for (int i = cursor; i < array.length; i++) {
            array[i]=0;
        }

        return array;
    }
}
