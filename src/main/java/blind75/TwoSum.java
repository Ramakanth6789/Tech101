package blind75;

import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int[] array = new int[]{2, 15, 11, 7};
        int target = 9;

        int[] result = twoSum(array, target);
        System.out.println(result[0] + " and " + result[1] + " indices of the two numbers that add up to target.");


    }

    private static int[] twoSum(int[] array, int target) {

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<array.length; i++){
            int complement = target - array[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }
            map.put(array[i],i);

        }
        return new int[]{-1, -1};
    }


}
