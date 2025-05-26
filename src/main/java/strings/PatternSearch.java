package strings;

public class PatternSearch {
// Find the first occurrence of the string pat in the string txt.
// The function returns an integer denoting the first occurrence of the string pat in txt.

    public static int findFirstOccurrence(String txt, String pat) {
        return txt.indexOf(pat);
    }

    public static void main(String[] args) {
        String txt = "GeeksForGeeks";
        String pat = "adfasd";

        int index = findFirstOccurrence(txt, pat);
        System.out.println("First occurrence at index: " + index);
    }
}

