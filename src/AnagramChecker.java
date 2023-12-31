import java.util.Arrays;

public class AnagramChecker {

    /*
    * We want to implement a feature that checks if our users' passwords are anagrams to increase security.
    * Your task is to write a function that takes in two string inputs and returns true if they form an anagram,
    * and false if they do not. An anagram is a word or phrase formed by rearranging the letters of another word
    * or phrase. The resulting word or phrase contains all the original letters exactly once. For example,
    * the word ""listen"" can be rearranged to form the word ""silent,"" making ""silent"" an anagram of ""listen.""
    *
    * Example 1:
    *   String s1 = ""listen"";
    *   String s2 = ""silent"";
    *   output should be true
    *
    * Example 2:
    *   String s1 = ""hello"";
    *   String s2 = ""world"";
    *   output should be false
    * */

    public static void main(String[] args){
        System.out.println(isAnagram("listen", "silent"));
    }

    public static boolean isAnagram(String s1, String s2) {

        char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);

        return  Arrays.equals(str2, str1);
    }
}
