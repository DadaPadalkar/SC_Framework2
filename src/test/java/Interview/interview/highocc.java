package Interview.interview;

public class highocc 
{

	public static void main(String[] args) 
	{
		String s="adddddjfjdlla";
		 int a[]=new int[256];
		 
		 for(int i=0;i<s.length();i++)
		 {
			 a[s.charAt(i)]+=1;
		 }

		 int max=-1;
		 char high=' ';
		 for(int i=0;i<s.length();i++)
			 
		 {
			 if(max<a[s.charAt(i)])
			 {
				 max=a[s.charAt(i)];
				 high=s.charAt(i);
				 
			 }
			 
		 }
		 System.out.println("Highest Occuring Character is= "+high);
		 
	}

}
