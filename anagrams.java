/*******************************************************************************

TODO
PLEASE WRITE THESE PROGRAMS FROM SCRATCH, BY YOURSELF. 
IT IS OK TO UNDERSTAND IT FIRST AND THEN CODE IT WITHOUT SEEING THE ANSWER.
THIS WILL ENSURE THAT YOU CAN DO THE SAME DURING INTERVIEWS.

Create a function to check if a given word is an anagram of another word. 
Call the function from the main function. 
Example: 
Input: "listen", "silent"
Output: "Anagram"

Example 2: 
Input: "Hello", "World"
Output: "Not an Anagram"

NOTE: An anagram is a word or phrase formed by rearranging the letters of another, using all the original letters exactly once.
NOTE: Anagrams are case-insensitive here.
NOTE: You can create each program in a separate function and call them inside the main function in this class.

*******************************************************************************/
import java.util.Arrays;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    // create an object of Scanner class
    Scanner input = new Scanner(System.in);

    // take input from users
    System.out.print("Enter first String: ");
    String str1 = input.nextLine();
    System.out.print("Enter second String: ");
    String str2 = input.nextLine();

    // check if length is same
    if(str1.length() == str2.length()) {

      // convert strings to char array
      char[] charArray1 = str1.toCharArray();
      char[] charArray2 = str2.toCharArray();

      // sort the char array
      Arrays.sort(charArray1);
      Arrays.sort(charArray2);

      // if sorted char arrays are same
      // then the string is anagram
      boolean result = Arrays.equals(charArray1, charArray2);

      if(result) {
        System.out.println(str1 + " and " + str2 + " are anagram.");
      }
      else {
        System.out.println(str1 + " and " + str2 + " are not anagram.");
      }
    }
    else {
      System.out.println(str1 + " and " + str2 + " are not anagram.");
    }

    input.close();
  }
}