package arrays;

public class Sum_of_odd_index {

	public static void main(String[] args) 
	{
		int arr[] = {10,20,30,40,60,10};
		int odd=0;
		for(int i=0;i<arr.length;i++)
		{
			if(i%2!=0)
			{
				odd=odd+arr[i];
			}
		}
		System.out.println("The sum of odd index is : " + odd);
	}

}
