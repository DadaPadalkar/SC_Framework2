package Pattern;

public class Leftsidebutter 
{

	public static void main(String[] args) 
	{
		int n=6;
		for (int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i+j>n)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (int i=n-1;i>=0;i--)
		{
			for(int j=1;j<=n-1;j++)
			{
				if(i+j>n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
