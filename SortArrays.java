/******************************************************************************

TODO
PLEASE WRITE THESE PROGRAMS FROM SCRATCH, BY YOURSELF. 
IT IS OK TO UNDERSTAND IT FIRST AND THEN CODE IT WITHOUT SEEING THE ANSWER.
THIS WILL ENSURE THAT YOU CAN DO THE SAME DURING INTERVIEWS.

Create a function to sort without using any inbuilt method in increasing order and call it from the main function. Given array {2,3,4,5,12,3,134,3}
Create a function to sort without using any inbuilt method in decreasing order and call it from the main function. Given array {2,3,4,5,12,3,134,3}

NOTE: You can create each program in a separate function and call them inside the main function in this class.

******************************************************************************/
import java.util.Arrays;
import java.util.Collections;

public class SortArrays {
        public static void main(String[] args)
    {
        Integer[] arr = { 2,3,4,5,12,3,134,3 };
        Arrays.sort(arr);
        System.out.println("Modified arr[] : "	+ Arrays.toString(arr));
        
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Modified arr[] : " + Arrays.toString(arr));
    }
}
