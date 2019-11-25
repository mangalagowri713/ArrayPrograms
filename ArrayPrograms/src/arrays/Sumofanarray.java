package arrays;

public class Sumofanarray {

	public static void main(String[] args) 
	{
		int arr[]= {1,2,3,7};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("Sum of the given array is : " + sum);
	}

}
