import java.util.*;

public class MatchingPrefixes {

    /*
    * You have a database of user inputted strings to be processed and analyzed
    * You need to find a way to efficiently determine the longest common prefix among all the strings in the database.
    * Write a function that takes in an array of strings and returns the longest common prefix string.
    * If none is found return """"
    *
    * Example 1:
    *   String[] input = {""leetcode"", ""leet"", ""leeds"", ""leedscode""};
    *   Output: lee
    *
    * Example 2:
    *   String[] input = {""dog"", ""racecar"", ""car""};
    *   Output: """"
    *
    * */
    public static void main(String[] args){

        String[] input = {"leetcode", "leet", "leeds","leedscode"};

        System.out.println(longestCommonPrefix(input));
    }

    public static String longestCommonPrefix(String[] strs){

        String prefix = "";
        Map<String, Integer> prefixes = new LinkedHashMap<>();


        for(int i = 0; i < strs.length; i++){
            String word = strs[i];
            for(int j = 1; j <= word.length(); j++){
                String substring = word.substring(0, j);
                int frequency = prefixes.getOrDefault(substring, 0);
                prefixes.put(substring, frequency + 1);
            }
        }

        for(String substring : prefixes.keySet()){
            if(prefixes.get(substring) == strs.length){
                prefix = substring;
            }
        }
        return prefix;

    }
}
