package Interview.interview;

public class NCS 
{

	public static void main(String[] args) 
	{
		int arr[] = {1,5,33,2,5,7,8,10,45,10};
		int org=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if (arr[i]>arr[j])
				{
					 org=arr[i];
					arr[i]=arr[j];
					arr[j]=org;
					
				}
			}
		}
     for(int i:arr)
     {
    	 System.out.println(i);
     }
	}

}
