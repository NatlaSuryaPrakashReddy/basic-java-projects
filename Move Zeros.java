/*******************************************************************************

TODO
PLEASE WRITE THESE PROGRAMS FROM SCRATCH, BY YOURSELF. 
IT IS OK TO UNDERSTAND IT FIRST AND THEN CODE IT WITHOUT SEEING THE ANSWER.
THIS WILL ENSURE THAT YOU CAN DO THE SAME DURING INTERVIEWS.

Given a binary string like "0101010101", create a function to put all zeros at the beginning and all ones at the end and call it from the main function.

NOTE: You can create each program in a separate function and call them inside the main function in this class.

*******************************************************************************/
import java.util.Scanner;
public class Main{
    public static void main(char[] c){
        int first = 0;
        int last = c.length-1;
        char temp;
        while(first<last){
          if(c[first]== '0'){
              first++;
              continue;
          }if(c[last]== '1'){
              last--;
              continue;
          }
          temp = c[first];
          c[first] = c[last];
          c[last] = temp;
          first++;
          last--;
        }
        System.out.println(c);
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] c = s.toCharArray();
        main(c);
    }
}
