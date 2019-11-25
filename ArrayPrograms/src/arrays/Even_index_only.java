package arrays;

public class Even_index_only {

	public static void main(String[] args) 
	{
		int a[] = {10,20,46,68,99};
		System.out.println("The even index numbers are : ");
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
			{
				System.out.println( a[i]);
			}
		}

	}

}
