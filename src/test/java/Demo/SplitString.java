package Demo;

public class SplitString 
{

	public static void main(String[] args) 
	{
		String s="Aayush Dada Padalkar Morve zpschool";
		
		String words[]=s.split("\\s");
		for(String s1:words)
		{
			System.out.println(s1);
		}
		

	}

}
