package arrays;

public class Min_valueFrom_Even_index_Ele {

	public static void main(String[] args) 
	{
		int a[] = {38,12,34,56,11,10};
		int min = a[0];
		for(int i=0;i<a.length;i=i+2)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println("Minimum element from Even Index is : " + min);
			
		}
		
	
		
	}


