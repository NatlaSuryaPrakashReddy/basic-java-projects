/******************************************************************************

TODO
PLEASE WRITE THESE PROGRAMS FROM SCRATCH, BY YOURSELF. 
IT IS OK TO UNDERSTAND IT FIRST AND THEN CODE IT WITHOUT SEEING THE ANSWER.
THIS WILL ENSURE THAT YOU CAN DO THE SAME DURING INTERVIEWS.

1. Create a function to print an array with first 10 elements from fibonacci series and call it from the main function.
2. Create a function to print an array with first n elements from fibonacci series, where n is a variable and call it from the main function.
3. Create a function to determine if a given number is part of the Fibonacci series or not and call it from the main function.

NOTE: You can create each program in a separate function and call them inside the main function in this class.

******************************************************************************/
import java.util.*;
public class FibonacciSeries {
    
     static void print10fib(){
        int[] a = new int[10];
        a[0] = 0;
        a[1] =1;
        for(int i=2;i<10;i++){
            a[i] = a[i-1]+a[i-2];
        }
        for(int i=0;i<10;i++){
            System.out.print(a[i]+ " ");
        }
        System.out.println();
    }
    static void printNfib(int n){
        int[] a = new int[n];
        a[0] =0;
        a[1] =1;
        for(int i=2;i<n;i++){
            a[i] = a[i-1]+a[i-2];
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+ " ");
        }
        System.out.println();
    }
        
    static boolean check_present(int n){
        int second = 0;
        int last = 1;
        while(1>0){ // Infinite loop
            int new_num = last+second;
            if(new_num==n) return true;
            if(new_num>n) return false;
            second = last;
            last = new_num;
        }
        
    }
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        print10fib();
        printNfib(n);
        int check_number = in.nextInt();
        boolean ans = check_present(check_number);
        System.out.println(ans);
        
    }

}