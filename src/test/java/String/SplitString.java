package String;

public class SplitString
{

	public static void main(String[] args) 
	{
		String s= "Aayush Dada Padalkar Morve";
		String s1[]=s.split("\\s");
		//char s2[]=s.toCharArray();
		
		for(String  e:s1)
		{
			//System.out.println(e);
			
			String rev=" ";
			for (int i=e.length()-1;i>=0;i--)
			{
				 rev=rev+e.charAt(i);
			}
			System.out.print(rev);
			
		}
		
		
		
	}

}
