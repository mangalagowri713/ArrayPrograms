package arrays;

public class Max_valueFrom_2nd_Half {

	public static void main(String[] args) 
	{
		int a[] = {10,2,4,6,7,3};
		int max=a[0];
		for(int i=0;i<a.length/2;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("Manimum value from First Half : " + max);
			
	}

}
