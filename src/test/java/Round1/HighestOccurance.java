package Round1;

public class HighestOccurance 
{

	public static void main(String[] args)
	{
		String s="aayodhya";
		//to create Array first.
		int[] ar=new int[256];
		//load characters in array location wise...
		for(int i=0;i<s.length();i++)
		{
			ar[s.charAt(i)]++;	
		}
		
		int max=0;
		char c=' ';
		//to check char occurance
		for(int i=0;i<s.length();i++)
		{
			if(max<ar[s.charAt(i)])
			{
				max=ar[s.charAt(i)];
				c=s.charAt(i);
			}
		}
    System.out.println("Highest Occuring Character is "+c);
	}

}
