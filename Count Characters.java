/*******************************************************************************

TODO
PLEASE WRITE THESE PROGRAMS FROM SCRATCH, BY YOURSELF. 
IT IS OK TO UNDERSTAND IT FIRST AND THEN CODE IT WITHOUT SEEING THE ANSWER.
THIS WILL ENSURE THAT YOU CAN DO THE SAME DURING INTERVIEWS.

1. Create a function  to count and print how many times each character has occurred, irrespective of whether the character is in lowercase or uppercase
in a given String and call the function from the main function. Example:

Input: "Hello"
Output: 
h -> 1
e -> 1
l -> 2
o -> 1

NOTE: You can create each program in a separate function and call them inside the main function in this class.

*******************************************************************************/
import java.util.Scanner;
 
public class Main {
    public static void main(String args[]) {
        String str;
        int i, length, counter[] = new int[256];
 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        str = scanner.nextLine();
 
        length = str.length();
 
        for (i = 0; i < length; i++) {
            counter[(int) str.charAt(i)]++;
        }
 
        for (i = 0; i < 256; i++) {
            if (counter[i] != 0) {
                System.out.println((char) i + "--> " + counter[i]);
            }
        }
    }
}  