/*4) Given a method with a positive number as input.write a code to
calculate the sum of squares of individual digiths of given
number.Return it as output.
Example:
Input=321
output=(3*3+2*2+1*1)=14
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Q31 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\nEnter a number : ");
        int n = Integer.parseInt(br.readLine());
        int num = 0,sum = 0;
        while(n!=0)
        {
            num = n%10;
            sum = sum + (num*num);
            n = n/10;
            
        }
        System.out.print("\nSum of individual digits : "+sum);
    }
}