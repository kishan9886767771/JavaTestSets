//1. A number is given as input. Find the odd digits in the number, add them and find if the sum is odd or not.if even return -1, if odd return 1 input:52315 logic:5+3+1+5=14(even) output:-1 input:1112 logic:1+1+1=3(odd) output:1 

import java.util.Scanner;


public class OddSum {
	public static void main(String args[])
	{
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		while(n>0)
		{
			int rem = n%10;
			if(rem%2!=0)
			{
				sum=sum+rem;
			}
			n=n/10;
		}
		
		if(sum%2==0)
		{
			System.out.println("sum of odd digits is even");
			
		}
		else
		{
			System.out.println("sum of odd digits is odd");
			
		}
		
	}
}
