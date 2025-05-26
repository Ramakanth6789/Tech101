package arrays;

public class LargestSubSum {
    /*
    keep adding the elements till the sum goes negative, when sum goes negative, replace it to 0.
     */
    public static void main(String[] args) {
        int[] array = new int[]{-3, 4, -1, -2, 1, 5};

        System.out.println("Largest sum of subarray is " + largestSubArray(array));
    }

    public static int largestSubArray(int[] array) {
        int sum = 0;
        for(int i=0; i<array.length; i++){
            sum+=array[i];
            if(sum<0){
                sum=0;
            }
        }
        return sum;

    }
}
