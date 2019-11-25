package arrays;

public class Average_of_ele {

	public static void main(String[] args)
	{
		int arr[] = {20,30,40,10,10};
		int sum=0;
		int avg=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
			avg=sum/2;
		}
		System.out.println("Average vale of an integer Array is : " + avg);
	}

}
