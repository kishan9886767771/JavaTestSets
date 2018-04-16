import java.util.Scanner;


public class FibonnaciSum {
	public static int sumOfFibonacci(int n){
		int a=-1,b=1,c=0,d=0;
		for(int i=0;i<=n;i++){
			c=a+b;
			a=b; b=c;
			d+=c;
		}
		return d;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Input Integer");
		int n=s.nextInt();
		System.out.println(sumOfFibonacci(n));
	}
}
