/*******************************************************************************

TODO
PLEASE WRITE THESE PROGRAMS FROM SCRATCH, BY YOURSELF. 
IT IS OK TO UNDERSTAND IT FIRST AND THEN CODE IT WITHOUT SEEING THE ANSWER.
THIS WILL ENSURE THAT YOU CAN DO THE SAME DURING INTERVIEWS.

Create a function to count all the substrings that can be formed from a given string and call it from the main function.

Example:

For the input string "abc" the substrings that can be formed are:

a
b
c
ab
bc
abc

Total Substring count = 6

NOTE: You can create each program in a separate function and call them inside the main function in this class.

*******************************************************************************/
import java.util.Scanner;
class Main{
    public static void main(String[] args) throws Exception{
        Scanner s= new Scanner(System.in);
        String str = s.nextLine();
        System.out.println((str.length()*(str.length()+
        1))/2);
    }
}