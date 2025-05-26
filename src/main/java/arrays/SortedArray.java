package arrays;

public class SortedArray {
    public static void main(String[] args) {
        System.out.println(isSorted(new int[]{1, 2, 34, 4, 5, 5, 6, 7}));
    }

    private static boolean isSorted(int[] ints) {
        for(int i=0; i<ints.length-1; i++){
            if (ints[i] > ints[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
