package strings;

public class Anagrams {
    public static void main(String[] args) {
        String s1="geeks";
        String s2="eesksg";

        System.out.print(s1 + "and "+ s2+" ");
        System.out.println(areAnagrams(s1,s2)? "are anagrams" : "are not anagram");
    }
    public static boolean areAnagrams(String s1, String s2) {



        if(s1.length()!=s2.length()){
            return false;
        }

        int[] charCounter = new int[256];

        for(int i=0; i<s1.length(); i++){
            charCounter[s1.charAt(i)]++;
            charCounter[s2.charAt(i)]--;
        }

        for(int num:charCounter){
            if(num!=0){
                return false;
            }
        }
        return true;
    }
}
