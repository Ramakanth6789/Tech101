package arrays;

public class RotatedAndSorted {
    /*
    When the array is sorted and rotated, we see increasing or decreasing order for n-1 times, as one element, due to rotation, will miss the order
     */
    public static void main(String[] args) {
        System.out.println(isRotatedAndSorted(new int[]{30, 4, 5, 6, 7, 9}));
        System.out.println(isRotatedAndSorted(new int[]{30, 24, 15, 6, 39, 37}));
    }

    private static boolean isRotatedAndSorted(int[] nums) {
        int n = nums.length;
        int increasing = 0;

        for(int i=0; i<n; i++){
            if (nums[i] < nums[(i + 1)%n]) {
                increasing++;
            }
        }
        if (increasing == n - 1 && nums[n - 1] < nums[0]) {
            return true;
        }

        int decreasing = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                decreasing++;
            }
        }

        if (decreasing == n - 1 && nums[n - 1] > nums[0]) {
            return true;
        }

        return false;
    }
}
