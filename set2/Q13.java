//13.Retrieve the palindorme-true number set from given number limit and return the sum 
//input1:90 input2:120 
//logic:99+101+111 
//output:311 


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Q13 {
	public static int sumOfPalindromeNos(int n1,int n2){
		List l1=new ArrayList();
		for(int i=n1;i<=n2;i++){
			int r=0,n3=i;
			while(n3!=0){
				r=(r*10)+(n3%10);
				n3=n3/10;	}
			if(r==i)
				l1.add(i);		}
		System.out.println(l1);
		int s=0;
		for(int i=0;i<l1.size();i++)
			//s=s+l1.get(i);
			s+=(int) l1.get(i);
		return s;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the range:");
		int n1=s.nextInt();
		int n2=s.nextInt();
		System.out.println("sum of palindrome nos.within given range is:"+sumOfPalindromeNos(n1,n2));
	}
}
