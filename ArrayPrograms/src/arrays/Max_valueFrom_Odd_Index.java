package arrays;

public class Max_valueFrom_Odd_Index {

	public static void main(String[] args)
	{
		int a[]= {34,45,15,90,8};
		int max = a[0];
		for(int i=0;i<a.length;i=i+1)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("Maximum element from Odd Index is : " + max);
	}

}
