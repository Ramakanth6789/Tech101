package strings;

public class BinaryString {

//    Given a binary string S. The task is to count the number of substrings that start and end with 1.
//    For example, if the input string is “00100101”, then there are three substrings “1001”, “100101” and “101”.

    public static void main(String[] args) {
        System.out.println(binaryString(4, "1111"));
        System.out.println(binaryStringEfficient(4, "1111"));
        System.out.println(binaryStringEfficentStreams(4, "1111"));
        System.out.println(binaryString(5, "01101"));
        System.out.println(binaryStringEfficient(5, "01101"));
        System.out.println(binaryStringEfficentStreams(5, "01101"));
    }

    public static int binaryString(int a, String str) {
        int count = 0;

        for (int i = 0; i < a; i++) {
            if (str.charAt(i) == '1') {
                for (int j = i+1; j < a; j++) {
                    if (str.charAt(j) == '1') {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    //Efficient approach is to calculate number of 1s in string and return n*(n-1)/2

    public static int binaryStringEfficient(int a, String string) {
        int count = 0;
        for (int i = 0; i < a; i++) {
            if (string.charAt(i) == '1') {
                count++;
            }
        }
        return count * (count - 1) / 2;
    }

    // Efficient in java 8;
    public static int binaryStringEfficentStreams(int a, String string) {
        long count = string.chars()
                .filter(c -> c == '1')
                .count();

        return (int)( count * (count - 1) / 2);
    }
}
