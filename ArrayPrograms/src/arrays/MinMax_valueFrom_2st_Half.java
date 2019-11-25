package arrays;

public class MinMax_valueFrom_2st_Half {

	public static void main(String[] args) 
	{
		int a[]= {1,4,6,8,3,9};
		int min = a[0];
		int temp;
		for(int i=a.length/2;i<a.length;i++)
		{
			for(int j=a.length/2;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		System.out.println("Minimum value from Second Half : " + a.length/2);
		System.out.println("Maximum value from Second Half : " + a[a.length-1]);
		

	}

}
