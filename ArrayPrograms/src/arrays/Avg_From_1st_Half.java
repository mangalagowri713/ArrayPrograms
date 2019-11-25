package arrays;

public class Avg_From_1st_Half {

	public static void main(String[] args)
	{
		int a[] = {1,2,5,4,5,6};
		int sum=0,avg=0;
		for(int i=0;i<a.length/2;i++)
		{
			sum=sum+a[i];
			avg=sum/2;
		}
		System.out.println("Average of First Half : " + avg);

	}

}
