package arrays;

public class Sum_of_ele_from_2nd_half {

	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4,5,6};
		int sum=0;
		for(int i=a.length/2;i<a.length;i++)
		{
			
				sum= sum + a[i];
			
		}
		System.out.println("Sum of Second Half element is : " + sum);
	}

}
