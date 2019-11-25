package arrays;

public class Sum_of_ele_from_1st_half {

	public static void main(String[] args) 
	{
		int a[] = {1,2,10,4,5,6};
		int sum=0;
		for(int i =(a.length-2)/2;i>=0;i--)
		{
			sum = sum + a[i];
		}
		System.out.println("Sum of ele from First Half :" + sum);
	}

}
