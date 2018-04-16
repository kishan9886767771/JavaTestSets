
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
