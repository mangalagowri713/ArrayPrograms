package arrays;

public class Min_valueFrom_1st_Half {

	public static void main(String[] args) 
	{
		int a[] = {9,12,56,10,4,2,6};
		int min = a[0];
		for(int i=0;i<(a.length-2)/2;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println("Minimum value form First half : " + min);
	}

}
