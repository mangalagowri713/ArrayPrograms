package arrays;

public class Avg_From_2nd_Half {

	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4,5,1};
		int sum=0,avg=0;
		for(int i=a.length/2;i<a.length;i++)
		{
			sum=sum+a[i];
			avg=sum/2;
		}
		System.out.println("Average of the 2nd Half : " + avg);
	}

}
