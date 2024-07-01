/*******************************************************************************

TODO
PLEASE WRITE THESE PROGRAMS FROM SCRATCH, BY YOURSELF. 
IT IS OK TO UNDERSTAND IT FIRST AND THEN CODE IT WITHOUT SEEING THE ANSWER.
THIS WILL ENSURE THAT YOU CAN DO THE SAME DURING INTERVIEWS.

Create a function to capitalize first letter of all words in a string and call it from the main function
Example: 

input: "hello world"

output: "Hello World"

NOTE: You can create each program in a separate function and call them inside the main function in this class.

*******************************************************************************/
import java.util.*;

 class Main{
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scn.nextLine();
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            String firstLetter = words[i].substring(0, 1);
            String restOfWord = words[i].substring(1);
            firstLetter = firstLetter.toUpperCase();
            words[i] = firstLetter + restOfWord;
        }
        String capitalizedSentence = String.join(" ", words);
        System.out.println("Capitalized sentence: " + capitalizedSentence);
    }
}