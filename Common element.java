/*******************************************************************************

TODO
PLEASE WRITE THESE PROGRAMS FROM SCRATCH, BY YOURSELF. 
IT IS OK TO UNDERSTAND IT FIRST AND THEN CODE IT WITHOUT SEEING THE ANSWER.
THIS WILL ENSURE THAT YOU CAN DO THE SAME DURING INTERVIEWS.

Create a function to find the common elements between two arrays of integers and call it from the main function.
Example: 

Input: [1,2,3,4,5,6] , [5,2,6,8,9]

Output: [2,5,6]

NOTE: You can create each program in a separate function and call them inside the main function in this class.

*******************************************************************************/
import java.util.Scanner;
import java.util.Arrays; 
public class Main
{
	public static void main(String[] args) 
    {
		Scanner input =new Scanner(System.in);
		System.out.print("Enter the First Array Limit :");
		int n =input.nextInt();
		System.out.print("Enter the Second Array Limit :");
		int m =input.nextInt();
		int [] a =new int[n];
		int [] b =new int[m];
        for(int i=0;i<n;i++)
        {
            System.out.printf("Element of a[%d] :",i);
            a[i]=input.nextInt();
        }
        for(int i=0;i<m;i++)
        {
            System.out.printf("Element of b[%d] :",i);
            b[i]=input.nextInt();
        } 
		System.out.println("Array1 : "+Arrays.toString(a));
		System.out.println("Array2 : "+Arrays.toString(b)); 
		System.out.println("\nCommon Array Element is..\n");
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                if(a[i] == (b[j]))
                {                 
			System.out.println(a[i]);
                }
            }
        } 
    }
}