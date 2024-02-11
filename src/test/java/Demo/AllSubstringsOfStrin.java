package Demo;

public class AllSubstringsOfStrin 
{

	public static void main(String[] args)
	{
		String s="Aayush Dada Padalkar";
		 for(int i=0;i<s.length();i++)
		 {
			 for(int j=1;j<=s.length()-1;j++)
			 {
				 System.out.println(s.substring(i, i+j));
			 }
		 }

	}

}
