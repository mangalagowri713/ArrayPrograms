package arrays;

public class Sum_of_even_index {

	public static void main(String[] args) 
	{
		int arr[] = {10,30,20,40,10,30};
		int even=0;
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==0)
			{
				even=even+arr[i];
			}
			
		}
		System.out.println("The sum of even index is : " + even);
	}

}
