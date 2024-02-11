package Demo;

public class arm2 
{

	public static void main(String[] args) 
	{
		int n=153;
		int t1=n;
		int count=0;
	//count length or no.of digits in number..
		while(t1!=0)
		{
			t1=t1/10;
			count++;
		}
		System.out.println("Length="+count);
		
		//for finding separate digits....
		int t2=n;
		int arm=0;
		int rem=0;
		while(t2!=0)
		{
			rem=t2%10;
		//calculate rem *no.of times digits...
			int mul=1;
			for(int i=1;i<=count;i++)
			{
				mul=rem*mul;
			}
			arm=arm+mul;
			t2=t2/10;
		}
		
		if(arm==n)
		{
			System.out.println("Number is Armstrong Number");
		}
		else
		{
			System.out.println("Number is Not a Armstrong Number");
		}

	}

}
