/******************************************************************************

TODO
PLEASE WRITE THESE PROGRAMS FROM SCRATCH, BY YOURSELF. 
IT IS OK TO UNDERSTAND IT FIRST AND THEN CODE IT WITHOUT SEEING THE ANSWER.
THIS WILL ENSURE THAT YOU CAN DO THE SAME DURING INTERVIEWS.

Create a function to implement the FizzBuzz algorithm: 
    Print numbers from 1 to n, but for multiples of 3, print "Fizz" instead of the number,
    for multiples of 5 print "Buzz", and for numbers which are multiples of both 3 and 5, print "FizzBuzz", where n is a variable.
    and call it from the main function.

NOTE: You can create each program in a separate function and call them inside the main function in this class.

******************************************************************************/

import java.util.*;
class FizzBuzz {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
                // i is the intermediate number between 1 to n
		for(int i = 1; i<=n; i++){
                // checking the divisibility of i with 3 and 5 both
		    if(i % 5 == 0 && i % 3 == 0){
		        System.out.print("FizzBuzz"+" ");
		    }
                 // checking the divisibility of i with 3 
		    else if(i % 3 == 0){
		        System.out.print("Fizz"+" ");
		    }
                 // checking the divisibility of i with 5
		    else if(i % 5 == 0){
		        System.out.print("Buzz"+" ");
		    }
		    //if none of the condition is satisfied
		    else{
		        System.out.print(i+" ");
		    }
		}
	}
}
