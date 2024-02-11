package Demo;

public class MaxOfAray 
{

	public static void main(String[] args)
	{
		int arr[]= {2,3,4,5,6,4,2,4,5,4,12,8,9,9};
		
		int max=-1;
		
		/*for(int i=0;i<arr.length;i++)
		{
			if (max<arr[i])
			{
				max=arr[i];
			}
			
		}*/
		for(int x:arr)
		{
			if(max<x)
			{
				max=x;
			}
		}
     System.out.println(max);
	}

}
