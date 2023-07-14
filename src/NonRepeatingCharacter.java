import java.util.Stack;

public class NonRepeatingCharacter {

    /*
    * Our startup is building a new messaging feature in our app, and we need to find the first non-repeating
    * character in a string to ensure all the messages are valid. We need a function that takes a string
    * and returns the index of the first non-repeating character.
    *
    * Example 1:
    *   String s = ""leetcode"";
    *   expectedOutput = 0;
    *   output should be 0 since 'l' is the first non-repeating character in the string
    *
    * Example 2:
    *   String s = ""startup"";
    *   expectedOutput = 2;
    *   output should be 2 since 'a' is the first non-repeating character in the string
    *
    * */

    public static void main(String[] args){
        String s = "aabbcicdde";
        System.out.println(findFirstNonRepeatingChar(s));
    }
    public static int findFirstNonRepeatingChar(String s){

        Stack<Character> seen = new Stack<>();
        for(int index = 0; index < s.length(); index++){

            char c = s.charAt(index); // get the character
            //Check if the character is not present after the current character
            if((s.indexOf(c, index+1) == -1)){
                if(!seen.contains(c)){  // check if the character is absent in the stack.
                    return index;
                }
            }else{
                seen.push(c); // push the character if it's present after the current character.
            }
        }

        return -1; // No non-repeating character found
    }


}
