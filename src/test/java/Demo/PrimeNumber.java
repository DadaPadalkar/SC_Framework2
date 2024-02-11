package Demo;

public class PrimeNumber 
{

	public static void main(String[] args) 
	{
		 int cnt=0;
		 for (int k=2;k<=20;k++) {
		for(int i=2;i<=k;i++)
		{
			if(k%i==0)
			{
				cnt++;
			}
		}
		
		
		if (cnt==1)
		{
			
			System.out.print(" "+k);
		}
		else
		{
			
		}
		cnt=0;
	}
	}

}
