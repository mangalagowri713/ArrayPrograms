package arrays;

public class Max_ele_in_array {

	public static void main(String[] args) 
	{
		int arr[]= {12,34,26,78,100};
		int max = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println("Maximum element in Array is : " + max);
	}

}
