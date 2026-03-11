package blind75;

import java.util.*;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 1};
        System.out.println(containsDuplicate(array));
    }

    private static boolean containsDuplicate(int[] array) {

        Set<Integer> visited = new HashSet<>();

        for (int num : array) {
            if (visited.contains(num)) {
                return true;
            } else {
                visited.add(num);
            }
        }
        return false;
    }
}
