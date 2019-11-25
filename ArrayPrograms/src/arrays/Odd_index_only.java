package arrays;

public class Odd_index_only {

	public static void main(String[] args)
	{
		int arr[] = {56,27,76,65,19};
		System.out.println("The odd index numbres are : ");
		for(int i=0;i<arr.length;i++)
		{
			if(i%2!=0)
			{
				System.out.println(arr[i]);
			}
		}

	}

}
