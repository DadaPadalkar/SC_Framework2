package Interview.interview;

public class Palindrome 
{

	public static void main(String[] args) 
	{
		int n=12321;
		int org=n;
		int rev=0;
		int rem=0;
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
    if(org==rev)
    {
    	System.out.println("Number "+org+" is a Palindrome");
    }
    else
    {
    	System.out.println("Number "+org+" is Not a Palindrome");
    }
	}

}
