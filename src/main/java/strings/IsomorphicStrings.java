package strings;

import java.util.*;

public class IsomorphicStrings {
    public static boolean areIsomorphic(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        return getPattern(s1).equals(getPattern(s2));
    }

    private static String getPattern(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        StringBuilder pattern = new StringBuilder();
        int index = 0;

        for (char c : str.toCharArray()) {
            if (!map.containsKey(c)) {
                map.put(c, index++);
            }
            pattern.append(map.get(c)).append(" ");
        }

        return pattern.toString();
    }

    public static void main(String[] args) {
        System.out.println(areIsomorphic("paper", "title")); // true
        System.out.println(areIsomorphic("foo", "bar"));     // false
        System.out.println(areIsomorphic("ab", "aa"));       // false
    }
}

