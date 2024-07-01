/*******************************************************************************

TODO
PLEASE WRITE THESE PROGRAMS FROM SCRATCH, BY YOURSELF. 
IT IS OK TO UNDERSTAND IT FIRST AND THEN CODE IT WITHOUT SEEING THE ANSWER.
THIS WILL ENSURE THAT YOU CAN DO THE SAME DURING INTERVIEWS.

1. Create a function that prints numbers from 1 to 10 using a loop and call it from the main function.
2. Create a function to set a variable n and print numbers from 1 to n (assume n is always a positive number) and call it from the main function.
3. Create a function to print only even numbers from 1 to n (if condition with the loop) and call it from the main function.


Concepts covered
1. Printing output
2. Loop and if condition
3. Even numbers
4. Functions

NOTE: You can create each program in a separate function and call them inside the main function in this class.

*******************************************************************************/
import java.util.*;

public class Loops{
    public static void main(String[] args){
     for(int i = 1; i <= 10; i++)
        {
            System.out.println(i);
        }   
        
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    System.out.println(n);
    
        for(int i = 1; i <= 10; i++){
            if(i%2==0){
            System.out.println(i);
            }
        }
    }
    
}