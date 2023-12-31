public class PalindromeChecker {

    /*
     * Your startup is building a social media platform where users can share their favorite quotes.
     * You want to ensure that the quotes shared are valid palindromes. Write a function that
     * takes in a string and returns true if it is a palindrome, or false otherwise.
     * ou should ignore all non-alphanumeric characters. A palindrome
     * is a word or phrase that reads the same forward and backward, e.g. level.
     *
     * Example 1:
     *  String s = ""A man, a plan, a canal: Panama"";
     *  Output should be true
     *
     * Example 2:
     *  String s = ""race a car"";
     *  Output should be false
     *
     */

    public static boolean isPalindrome(String s) {

        s = s.replaceAll("[^a-zA-Z]", "").toLowerCase();

        int length = s.length();

        for(int i = 0; i < length/2; i++){
            if(s.charAt(i) != s.charAt(length-1-i)){
                return false;
            }
        }
        return true;
    }
}
