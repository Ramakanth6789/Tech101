package arrays;

public class RangeSumQuery {
    public static void main(String[] args) {
//        Description : We are given an Array of n integers,
//        We are given q queries having indices l and r .
//        We have to find out sum between the given range of indices.

        /*
        Create increment sum of elements.
         */

        int[] array = new int[]{4, 5, 3, 2, 5};

        System.out.println(rangeSum(array, 1, 3));
    }

    public static int rangeSum(int[] array, int start, int end) {

        int sum = 0;
        int i = 0;

        for (int num : array) {
            sum += num;
            array[i] = sum;
            i++;
        }


        return start == 0 ? array[end] : array[end] - array[start - 1];

    }

}
