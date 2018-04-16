public class Q22 {
 
    public static void main(String a[]){
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {3,4,5,6};
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.print(arr1[i]+" ");
                    
                    
                }
            }
        }
    }
}

/*public class Q22 {
	public static int commonElements(int[] a,int[] b){
		int c=0;
		for(int i=0;i<a.length;i++)
			for(int j=0;j<b.length;j++)
				if(a[i]==b[j])
					System.out.print(a[i]);
					c++;
					
		return (2*c);
	}
	public static void main(String[] args){
		int a[]={1,2,3,4};
		int b[]={3,4,5,6};
		System.out.println(commonElements(a,b));
	}
}*/