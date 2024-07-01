/*******************************************************************************

TODO
PLEASE WRITE THESE PROGRAMS FROM SCRATCH, BY YOURSELF. 
IT IS OK TO UNDERSTAND IT FIRST AND THEN CODE IT WITHOUT SEEING THE ANSWER.
THIS WILL ENSURE THAT YOU CAN DO THE SAME DURING INTERVIEWS.

Create a java function that removes duplicate elements from an array without using built-in methods
Call the function from the main function. Example: 
Input: [1,1,2,42,3];
Output: [1,2,42,3];

NOTE: You can create each program in a separate function and call them inside the main function in this class.

*******************************************************************************/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

class Main {
  public static void main(String[] args) {

    // create an arraylist from the array
    // using asList() method of the Arrays class
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 2, 42, 3));
    System.out.println("ArrayList with duplicate elements: " + numbers);

    // convert the arraylist into a set
    Set<Integer> set = new LinkedHashSet<>();
    set.addAll(numbers);

    // delete al elements of arraylist
    numbers.clear();

    // add element from set to arraylist
    numbers.addAll(set);
    System.out.println("ArrayList without duplicate elements: " + numbers);
  }
}