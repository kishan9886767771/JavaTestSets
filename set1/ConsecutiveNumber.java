//7. Retrieve the odd numbers till given input number. add and subtract it consecutively and return the result. 
//Input:9 
//Output:1+3-5+7-9=-3 


import java.util.Scanner;


public class ConsecutiveNumber {
	 public static void main(String args[])
     {
         System.out.println("Enter the Number:");
         Scanner sc = new Scanner(System.in);
         int N = sc.nextInt();
         int sum = 1,i,count=0,sub;
         for (i = 3; i <= N; i = i + 2)
         {
             count++;
             if (count == 2)
             {
                 sub = sum - i;
                 sum = sub;
                 count = 0;
                 continue;
             }
             sum = sum + i;

         }
         System.out.println(sum);

     }
 }

