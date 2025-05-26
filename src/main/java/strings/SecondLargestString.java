package strings;

import java.util.*;

public class SecondLargestString {

    public static void main(String[] args) {
        String input = "I am a good programmer";
        String secondLargest = findSecondLargestString(input);
//        String secondLargest = findSecondLargestStringStreams(input);

        if (secondLargest != null) {
            System.out.println("Second largest string: " + secondLargest);
        } else {
            System.out.println("Input string does not contain at least two words.");
        }
    }

    public static String findSecondLargestString(String input) {
        if (input == null || input.trim().isEmpty()) {
            return null;
        }

        String[] words = input.split("\\s+"); // Split by one or more spaces
        if (words.length < 2) {
            return null; // Not enough words for a second largest
        }

        Arrays.parallelSort(words, Comparator.comparingInt(String::length).reversed());

        if (words.length >= 2) {
            return words[1];
        } else{
            return null;
        }

    }

    public static String findSecondLargestStringStreams(String input){
        if (input == null || input.trim().isEmpty()) {
            return null;
        }
        String[] words = input.split("\\s+");

        if (words.length < 2) {
            return null;
        }



        return Arrays.stream(input.split("\\s+"))
                .sorted(Comparator.comparing(String::length).reversed())
                .skip(1)
                .findFirst()
                .get();
    }
}
