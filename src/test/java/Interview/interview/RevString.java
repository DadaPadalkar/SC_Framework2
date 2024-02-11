package Interview.interview;

public class RevString 
{

	public static void main(String[] args) 
	{
		String s="Aayush Dada Padalkar";
		String[]a=s.split(" ");
		String rev=" ";
		for(String s1:a)
		{
			
			for(int i=s1.length()-1;i>=0;i--)
			{
				rev=rev+s1.charAt(i);
				
			}
			rev=rev+" ";
		}
		System.out.println(rev);

	}

}
