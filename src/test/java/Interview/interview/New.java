package Interview.interview;

public class New 
{

	
	
	public void MaxNum()
	{
		int [] arr = {30,5,4,8,19,20,61};
		int max=arr[0];
		int min=arr[0];
		for(int i:arr) 
		{
			if(max<i)
			{
				max=i;
			}
		}
		System.out.println("Maximum number from array="+max);
		for(int i:arr) 
		{
			if(min>i)
			{
				min=i;
			}
		}
		System.out.println("Minimum number from array="+min);
	}
	public static void main(String[] args)
	{
		New n=new New();
		n.MaxNum();
		
	}
	

}
