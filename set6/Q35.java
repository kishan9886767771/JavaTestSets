/*8) Given a method with an int array list as an input.Write code to remove every 3rd element and return the finasl array list.suppose the given array list contains 10 elements remove the 3rd,6th and 9th element.
input={3,1,11,19,17,19}
output={3,1,19,17}
*/
import java.util.ArrayList;

import java.util.Scanner;
	public class Q35 {
	    public static void main(String[] args) {
	    	ArrayList<Integer> numbers = new ArrayList<Integer>();
	    	System.out.println("enter the array length");
	    	Scanner sc= new Scanner(System.in);
	    	int n = sc.nextInt();
	    	//Random r = new Random();
	    	for(int j=0;j<=n;j++)
	    	{
	    		numbers.add(sc.nextInt());
	    	}
	       
	    	for(int i=0;i<numbers.size();i+=2)
	    	{
	    		if(i!=0)
	    		numbers.remove(i);
	    	}
	        System.out.println(numbers);
	    }
	}

