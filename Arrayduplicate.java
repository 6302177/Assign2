package array;

public class Arrayduplicate {

	public static void main(String[] args) {
		int[] a= {1,3,5,6,6,7};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("array has duplicate elements");
					return ;
				}
				
				
				
			}
		  
		}
		
		
		
		System.out.println("array has no duplicate elements");
	}

}
