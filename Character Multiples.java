/*******************************************************************************

TODO
PLEASE WRITE THESE PROGRAMS FROM SCRATCH, BY YOURSELF. 
IT IS OK TO UNDERSTAND IT FIRST AND THEN CODE IT WITHOUT SEEING THE ANSWER.
THIS WILL ENSURE THAT YOU CAN DO THE SAME DURING INTERVIEWS.

Create a function to find all characters in a String that occur more than once. 
Example: 
Input: "Hello there"
Output: h,e,l
NOTE: You can create each program in a separate function and call them inside the main function in this class.

*******************************************************************************/
//Java Program to find the duplicate characters in a given string
import java.util.*;
public class Main
{  
     public static void main(String[] args) 
     {  
         //Take input from the user
        Scanner sc=new Scanner(System.in);  
        System.out.println("Enter the string is: ");
        String str1=sc.nextLine();
        int count;  
        //Converts given string into character array  
        char str[] = str1.toCharArray();            
        System.out.println("Duplicate characters in the given string: ");  
        //Counts each character present in the string  
        for(int i = 0; i <str.length; i++) 
        {  
            count = 1;  
            for(int j = i+1; j <str.length; j++) 
            {  
                if(str[i] == str[j] && str[i] != ' ') 
                {  
                    count++;  
                    //Set string[j] to 0 to avoid printing visited character  
                    str[j] = '0';  
                }  
            }  
            //A character is considered as duplicate if count is greater than 1  
            if(count > 1 && str[i] != '0')  
                System.out.println(str[i]);  
        }  
    }  
}  