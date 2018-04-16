//15. Get a input string. reverse it and parse it with '-'. 
//input:computer 
//output:r-e-t-u-p-m-o-c 


import java.util.*;
public class Q15 {
	
	public static void main(String[] args)
    {
        System.out.println("Enter string to reverse:");
        
        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        String reverse = "";
        
        
        for(int i = str.length() - 1; i >= 0; i--)
        {
            if(i==0)
        	reverse = reverse + str.charAt(i);
            else
            reverse = reverse + str.charAt(i)+"-";
            
        }
        
        
        System.out.println("Reversed string is:");
        System.out.println(reverse);
    }
}
