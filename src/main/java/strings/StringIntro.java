package strings;

public class StringIntro {
    public static void main(String[] args) {

        String string = "aaabbbgeeksforgeeks";

        int[] counter = new int[26];

        for(int i=0; i<string.length(); i++){
            counter[string.charAt(i) - 'a']++;
        }

        for(int i=0; i<counter.length ; i++){
            if (counter[i] > 0) {
                System.out.println((char) (i + 'a') + "-" + counter[i]);
            }
        }
    }
}
