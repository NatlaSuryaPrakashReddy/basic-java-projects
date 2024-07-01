/*******************************************************************************

TODO
PLEASE WRITE THESE PROGRAMS FROM SCRATCH, BY YOURSELF. 
IT IS OK TO UNDERSTAND IT FIRST AND THEN CODE IT WITHOUT SEEING THE ANSWER.
THIS WILL ENSURE THAT YOU CAN DO THE SAME DURING INTERVIEWS.

Given a string, Create a function to return a compressed version of the string and call it from the main function.
For example, for the string "aaabbcc", the output should be "a3b2c2".

NOTE: You can create each program in a separate function and call them inside the main function in this class.

*******************************************************************************/
import java.util.*;
public class Main{
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    String input = in.nextLine();
    StringBuilder ans = new StringBuilder();
    char c = input.charAt(0);
    int count =1;
    int l = input.length();
    for(int i=1;i<l;i++){
        if(input.charAt(i)!=input.charAt(i-1)){
            ans.append(c);
            ans.append(String.valueOf(count));
            c = input.charAt(i);
            count=1;
        }
        else
            count++;
    }
    ans.append(c);
    ans.append(String.valueOf(count));
    ans.toString();
    System.out.println(ans);
}
}