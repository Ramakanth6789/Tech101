package strings;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter first string ");
        String string1 = scanner.next();


        if (isPalindromeRecursive(string1)) {
            System.out.println("String is palindrome");
        } else{
            System.out.println("String is not palindrome");
        }

    }

    private static boolean isPalindrome(String string1) {

        int i=0, j=string1.length()-1;

        while (i < j) {
            if (string1.charAt(i) != string1.charAt(j)) {
                return false;
            }
            i++;
            j--;

        }
        return true;
    }

    private static boolean isPalindromeRecursive(String string1) {
        return isPalindromeRecursiveCall(0, string1.length() - 1, string1);
    }

    private static boolean isPalindromeRecursiveCall(int i, int j, String string1) {

        if (i > j) {
            return true;
        }
        if (string1.charAt(i) != string1.charAt(j)) {
            return false;
        }
        Stack<String> stk = new Stack<>();

        return isPalindromeRecursiveCall(++i, --j, string1);

    }
}
