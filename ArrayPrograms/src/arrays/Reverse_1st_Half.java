package arrays;

public class Reverse_1st_Half {

	public static void main(String[] args)
	{
		int a[] = {10,20,30,40,50,60};
		System.out.println("First Half Reversed Array are : ");
		for(int i =(a.length-2)/2;i>=0;i--)
		{
			
				System.out.println(a[i]);
			
		}
	}

}
