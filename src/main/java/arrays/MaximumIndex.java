package arrays;

import java.util.*;
public class MaximumIndex {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int t = Integer.parseInt(scanner.nextLine().trim());

            while (t-- > 0) {
                String line = scanner.nextLine().trim();
                String[] numsStr = line.split(" ");
                int[] nums = new int[numsStr.length];
                for (int i = 0; i < numsStr.length; i++) {
                    nums[i] = Integer.parseInt(numsStr[i]);
                }

                Solution ob = new Solution();
                System.out.println(ob.maxIndexDiff(nums));

                System.out.println("~");
            }
        }


// } Driver Code Ends


    // User function Template for Java
    static class Solution {
        // Function to find the maximum index difference.
//        int maxIndexDiff(int[] arr) {
//            // Your code here
//
//            int firstIndex = 0;
//            int lastIndex = arr.length -1;
//
//            while(firstIndex < lastIndex){
//                if(arr[firstIndex]<arr[lastIndex]){
//                    return lastIndex - firstIndex;
//                }
//
//                if((arr[firstIndex+1]<arr[lastIndex])||(arr[firstIndex]<arr[lastIndex-1])){
//                    return lastIndex - firstIndex-1;
//                }
//                lastIndex--;
//                firstIndex++;
//
//            }
//            return 0;
//        }

        public int maxIndexDiff(int[] arr) {
            int n = arr.length;
            if (n <= 1) {
                return -1;
            }

            int[] leftMin = new int[n];
            int[] rightMax = new int[n];

            leftMin[0] = arr[0];
            for (int i = 1; i < n; i++) {
                leftMin[i] = Math.min(leftMin[i - 1], arr[i]);
            }

            rightMax[n - 1] = arr[n - 1];
            for (int j = n - 2; j >= 0; j--) {
                rightMax[j] = Math.max(rightMax[j + 1], arr[j]);
            }

            int i = 0, j = 0, maxDiff = -1;
            while (i < n && j < n) {
                if (leftMin[i] < rightMax[j]) {
                    maxDiff = Math.max(maxDiff, j - i);
                    j++;
                } else {
                    i++;
                }
            }

            return maxDiff;
        }
    }

}
