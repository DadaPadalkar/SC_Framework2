package Demo;

public class PaliString 
{

	public static void main(String[] args) 
	{
		String s="AAyyAA";
		String org=s;
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.print(rev);
		if(org.equals(rev))
		{
			System.out.println(" STring is Palindrome");
		}
		else
		{
			System.out.println(" STring is Not a Palindrome");
		}
	}


}
