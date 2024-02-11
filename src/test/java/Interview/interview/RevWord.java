package Interview.interview;

public class RevWord 
{

	public static void main(String[] args) 
	{
		String s="Aayush Dada Padalkar";
		
		String[] word=s.split(" ");
		
		String revstring="";
		//System.out.println(word.length);
		for (String w:word)
		{
			String revword="";
			for(int i=w.length()-1;i>=0;i--)
			{
				revword=revword+w.charAt(i);
			}
			revstring=revstring+revword+" ";
		}
		
		System.out.println(revstring);
		
	}

}
