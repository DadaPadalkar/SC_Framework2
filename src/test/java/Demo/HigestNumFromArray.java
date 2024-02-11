package Demo;

public class HigestNumFromArray 
{

	public static void main(String[] args) 
	{
		int a[]= {12,3,55,6,77,8,99,6,4,2};
		
		int max=-1;
		for(int e:a)
		{
			if(max<=e)
			{
				max=e;
			}
			
		}
		
    System.out.println("Max number is="+max);
	}

}
