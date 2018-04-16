import java.util.Arrays;
import java.util.HashSet;




public class CommonArray {
	public static void main(String[] args)
    {
		Integer[] i1 = {1,2,3,4};
		 
        Integer[] i2 = {3,4,5,6};
 
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(i1));
 
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(i2));
 
        set1.retainAll(set2);
 
        System.out.println(set1);
        
        int sum=0;
        for (int a:set1)
        {
        	sum=sum+a;
        }
        System.out.println("Sum of the elements is : "+sum);
    }
    }

