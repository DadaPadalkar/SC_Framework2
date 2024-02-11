package Demo;

public class FloydsTriangle 
{

	public static void main(String[] args)
	{
		int n=10;
		int count=0;//main logic
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				 count++;
				System.out.print(count);
			}
			System.out.println();
		}
	}

}
