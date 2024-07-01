/*******************************************************************************

TODO
PLEASE WRITE THESE PROGRAMS FROM SCRATCH, BY YOURSELF. 
IT IS OK TO UNDERSTAND IT FIRST AND THEN CODE IT WITHOUT SEEING THE ANSWER.
THIS WILL ENSURE THAT YOU CAN DO THE SAME DURING INTERVIEWS.

Create a function to reverse a given string without using any in-built methods and call it from the main function.

NOTE: You can create each program in a separate function and call them inside the main function in this class.

*******************************************************************************/
import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println(reversel("Value to be entered"));
        String s = sc.nextLine();
        System.out.println(reversel(s));
    }
    static String reversel(String s){
        StringBuilder sb = new StringBuilder(s);
        int len = s.length()-1;
        char temp;
        int end=0;
        while(end<len){
            temp=sb.charAt(end);
            sb.setCharAt(end,sb.charAt(len));
            sb.setCharAt(len,(temp));
            end++;
            len--;
            
        }
        return sb.toString();
    }
    
}
