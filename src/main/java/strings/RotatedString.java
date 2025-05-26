package strings;

public class RotatedString {
    public static void main(String[] args) {
        System.out.println(areRotations("geeksforgeeks", "forgeeksgeeks"));
    }

    public static boolean areRotations(String s1, String s2) {
        // Your code here
        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s2.charAt(0) == s1.charAt(i)) {
                String temp = s1.substring(i) + s1.substring(0, i);
                System.out.println(temp);
                if (temp.equals(s2)) {
                    return true;

                }
            }
        }
        return false;
    }
}
