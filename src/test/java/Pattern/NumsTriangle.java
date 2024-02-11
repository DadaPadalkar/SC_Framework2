package Pattern;

public class NumsTriangle
{

	public static void main(String[] args) 
	{
		int n=6;
		int cnt=0;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				cnt++;
				System.out.print(cnt+" ");
			}
			System.out.println();
		}

	}

}
