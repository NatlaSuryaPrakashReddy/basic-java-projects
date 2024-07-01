/******************************************************************************

TODO
PLEASE WRITE THESE PROGRAMS FROM SCRATCH, BY YOURSELF. 
IT IS OK TO UNDERSTAND IT FIRST AND THEN CODE IT WITHOUT SEEING THE ANSWER.
THIS WILL ENSURE THAT YOU CAN DO THE SAME DURING INTERVIEWS.

Create a function to print all prime number from 1 to 20 and call it from the main function.

Create a function to print all prime numbers from 1 to n, where n is an variable and call it from the main function.

Create a function to find the biggest prime number using n digits. where n is a variable, greater than or equal to 1 and call it from the main function.
Example: 
For n = 1,
Largest PrimeNumber with 1 digit = 7

For n = 2,
Largest PrimeNumber with 2 digits = 97

NOTE: You can create each program in a separate function and call them inside the main function in this class.

******************************************************************************/
import java.util.Scanner;
class Primes{
   public static void main (String[] args){	
       int i, j;
    boolean isPrime = true;
    for (i = 2; i <= 20; i++) {
      int sqrt = (int) Math.sqrt(i);
      for (j = 2; j <= sqrt; j++) {
        if (i % j == 0) {
          isPrime = false;
          break;
        }
      }
      if (isPrime) System.out.print(" " + i + " ");
      isPrime = true;
    }
      Scanner scanner = new Scanner(System.in);
       i =0;
      int num =0;
      //Empty String
      String  primeNumbers = "";
      System.out.println("Enter the value of n:");
      int n = scanner.nextInt();
      scanner.close();
      for (i = 1; i <= n; i++)  	   
      { 		 		  
         int counter=0; 		  
         for(num =i; num>=1; num--)
         {
	    if(i%num==0)
	    {
		counter = counter + 1;
	    }
	 }
	 if (counter ==2)
	 {
	    //Appended the Prime number to the String
	    primeNumbers = primeNumbers + i + " ";
	 }	
      }	
      System.out.println("Prime numbers from 1 to n are :");
      System.out.println(primeNumbers);
        
        if (n <= 0 || n <= 1) {
            System.out.println(-1);
        }
         else {
            int largestPrime = 2;
            while (largestPrime < n) {
                if (n % largestPrime != 0) {
                    largestPrime++;
                } else {
                    n = n / largestPrime;
                    
                }
            }
            System.out.println(n);
        }
   }
}