package arrays;

public class Second_large_ele {

	public static void main(String[] args) 
	{
		int arr[] = {20,30,40,70};
		int largest = arr[0];
		int secondLargest = arr[0];
		System.out.println("The given Arrays are : ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(+ arr[i]);
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				secondLargest=largest;
				largest=arr[i];
			}
			else
				if(arr[i]>secondLargest)
				{
					secondLargest=arr[i];
				}
		}
		System.out.println("The second Largest num in the array is : " + secondLargest);
	}

}
