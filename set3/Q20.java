/*20. Get a integer array as input. Find the average of the elements which are in the position of prime index 
input:{1,2,3,4,5,6,7,8,9,10} 
logic:3+4+6+8(the indeces are prime numbers) 
output:21 
*/

import java.util.*;
public class Q20 {
	public static int sumOfPrimeIndices(int[] a,int n){
		int n1=0;
		for(int i=2;i<a.length;i++) {
			int k=0;
			for(int j=2;j<a.length;j++) {
				if(i%j==0)
					k++;	}
			if(k==0)
				n1+=a[i];	}
		return n1;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the array limit:");
		int n=s.nextInt();
		System.out.println("enter the array elements:");
		int[] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		System.out.println(sumOfPrimeIndices(a,n));
	}
}