package arrays;

public class Min_ele_in_array {

	public static void main(String[] args) 
	{
		int arr[] = {3,5,7,2,1,0};
		int min=arr[0];
	
		for(int i=0;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		System.out.println("Minimum element from the Array is : " + min);
	}

}
