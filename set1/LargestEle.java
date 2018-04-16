//3.A integer array is given as input. find the difference between each element. Return the index of the largest element which has the largest difference gap. 
//input: {2,3,4,2,3} logic: 2-3=1,3-4=1,4-2=2,2-3=1 
//2 is the max diff between 4 and 2,return the index of 4(2) output:2 

public class LargestEle {
	public static void main (String[] args)
    {
        int A[] = {2,3,4,2,3};
        int min = A[0];
        int max = A[0];

        for (int i = 0; i < A.length; i++)
        {
            if (min > A[i])
            {
                min = A[i];
            }

            if (max < A[i])
            {
                max = A[i];
            }
        }
        System.out.println(max - min);
    }
}
