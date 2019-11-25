package arrays;

public class Avg_of_all_even_index {

	public static void main(String[] args) 
	{
		int arr[] = {2,3,4,5,6,7};
		int sum=0,evenavg=0;
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==0)
			{
				sum=sum+arr[i];
				evenavg=sum/2;
			}
		}
		System.out.println("The Average of even index: " + evenavg);
	}

}
