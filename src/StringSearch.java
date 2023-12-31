public class StringSearch {

    /*
    * String Search Function
    * We are developing a search engine for a new product. We need to implement a function that can search
    * for a specific string within a larger string and return the index of its first occurrence. This function
    * will take in two strings as parameters, s1 and s2. If s1 is found within s2, the function should return the
    * index of the first occurrence of the substring. Else return -1
    *
    * Example 1:
    *   String s1 = ""world"";
    *   String s1 = ""world"";
    *   Output: 6
    *
    * Example 2:
    *   String s1 = ""java"";
    *   String s2 = ""programming language"";
    *   Output: -1
    *
    * */


    public static int searchString(String s1, String s2){
        return s2.indexOf(s1);
    }
}
