/*11) Given a method with an array of strings and one string variable as input .Write code to sort the given array in reverse alphabetical order and return the position of the given string in the array.assume the position of the first element is 1
Example
input1={"red","green","blue","ivory"}
input2="ivory"
output:2(reverse sorted array = {"red","ivory","green","blue"}
*/

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Q38 {
	    public static void main (String[] args) {
    	String  arr[] = {"red","green","blue","ivory"};
    	System.out.println(Arrays.toString(arr));
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the search String");
    	String s = sc.next();
    	int c=0;
    	Arrays.sort(arr, Collections.reverseOrder());
    	 for(int i=0;i<arr.length;i++)
     	{
     		if(s.matches(arr[i]))
     		{
     			c = i;
     		}
     	} 
        System.out.println("Reversed array is ");
        System.out.println("Position of the Word in a Array :"+c);
        System.out.println(Arrays.toString(arr));
    }
}
