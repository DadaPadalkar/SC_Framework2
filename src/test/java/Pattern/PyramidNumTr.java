package Pattern;

public class PyramidNumTr 
{

	public static void main(String[] args)
	{
		char c='A';
		int n=6;
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(c+"  ");
				
			}
			System.out.println();
			c++;
		}

	}

}
