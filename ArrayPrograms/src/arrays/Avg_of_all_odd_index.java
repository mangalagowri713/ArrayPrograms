package arrays;

public class Avg_of_all_odd_index {

	public static void main(String[] args) 
	{
		int arr[] = {20,10,30,19,40,45};
		int sum=0,oddavg=0;
		for(int i=0;i<arr.length;i++)
		{
			if(i%2!=0)
			{
				sum=sum+arr[i];
				oddavg=sum/2;
			}
		}
		System.out.println("The avg of all odd index: " + oddavg);
	}

}
