package strings;

import java.util.*;

public class ReverseWords {

    public static void main(String[] args) {
        String string = "cb ipctpyru  bovcbo";
        System.out.println(reverseWords(string));

    }


    // Function to reverse words in a given string
    public static String reverseWords(String s) {
        // Code here

        String[] wordArray = s.trim().split("\\s+");

        int start = 0, end = wordArray.length - 1;
        String temp;

        while (start < end) {
            temp = wordArray[start];
            wordArray[start] = wordArray[end];
            wordArray[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(wordArray));
        System.out.println(Arrays.stream(wordArray).reduce("", (a, b) -> a + (a.isEmpty() ? "" : " ") + b));

        return String.join(" ",wordArray).trim();
//        return Arrays.stream(wordArray).reduce("", (a, b) -> a + (a.isEmpty() ? "" : " ") + b);
    }


}
