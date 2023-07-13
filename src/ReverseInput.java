public class ReverseInput {

    /*
    * For a new game, we need to implement a function that reverses a string or an integer.
    * Can you achieve this without using extra memory (in-place)?
    *
    * Example 1:
    *   arr = {'h', 'e', 'l', 'l', 'o'};
    *   output: [o, l, l, e, h]
    *
    * Example 2:
    *   arr = {'1', '2', '3', '4', '5'};
    *   output: [5, 4, 3, 2, 1]
    *
    * Logic: Traverse the array up to the MIDDLE and swap elements from the ends to the center
    *
     * */

    public static void reverse(char[] arr){

        if(arr.length < 2){
            return;
        }
        int last = arr.length-1;
        for(int i = 0; i < arr.length/2; i++){
            char temp = arr[last-i];
            arr[last-i] = arr[i];
            arr[i] = temp;
        }
    }

}
