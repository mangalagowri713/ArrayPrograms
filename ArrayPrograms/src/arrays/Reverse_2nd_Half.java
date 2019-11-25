package arrays;

public class Reverse_2nd_Half {

	public static void main(String[] args)
	{
		int a[] = {1,2,3,4,5,6};
		System.out.println("Second Half Reversed Array are : ");
		for(int i =a.length-1;i>(a.length-1)/2;i--)
		{
			System.out.println(a[i]);
		}

	}

}
