package arrays;

public class Secong_min_ele {

	public static void main(String[] args) 
	{
		int arr[] = {46,34,89,23,12};
		int minimun=arr[0];
		int secondsmallest = arr[0];
		System.out.println("The given Arrays are : ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<minimun)
			{
				secondsmallest=minimun;
				minimun=arr[i];
				
				
			}
			else
				if(arr[i]<secondsmallest)
				{
					secondsmallest=arr[i];
				}
		}
		System.out.println("Second amallest num in the array is : " + secondsmallest);
	}

}
