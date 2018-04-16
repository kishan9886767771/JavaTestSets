//17. A integer input is accepted. find the square of individual digits and find their sum. 
//input:125 
//output:1*1+2*2+5*5 


import java.io.*;
class Q17 
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