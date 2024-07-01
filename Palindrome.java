/*******************************************************************************

TODO
PLEASE WRITE THESE PROGRAMS FROM SCRATCH, BY YOURSELF. 
IT IS OK TO UNDERSTAND IT FIRST AND THEN CODE IT WITHOUT SEEING THE ANSWER.
THIS WILL ENSURE THAT YOU CAN DO THE SAME DURING INTERVIEWS.

1. Create a function to check if a String is palindrome or not ignoring case-sensitivity and call it from the main function

Example 1:
Input: "Hello"
Output: "not palindrome"

Example 2:
Input: "Eve"
output: "palindrome"

2. Given a string s, create a function which checks if the string can be palindrome after rearranging the letters in the String.
Ignore case-sensitivity, call the funtion from the main function

Example 1:
Input: s = "aba"
Output: "can be palindrome"

Example 2:
Input: s = "aAb"
Output: "can be palindrome"

Example 3:
Input: s = "abc"
Output: "can not be palindrome"

NOTE: A string is a palindrome when it reads the same backward as forward.
NOTE: You can create each program in a separate function and call them inside the main function in this class.

*******************************************************************************/
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{

    static boolean checkPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if(s.charAt(i) != s.charAt(j))
            return false;
            
            i++;
            j--;
        }
        return true;
    }    

public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    String s = in.nextLine();
    s = s.toLowerCase();
    if(checkPalindrome(s) == true){
        System.out.println("Palindrome");
    }else{
        System.out.println("can not be Palindrome");
    }
    }
}