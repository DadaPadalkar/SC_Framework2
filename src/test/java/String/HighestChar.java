package String;

public class HighestChar {

	public static void main(String[] args) 
	{
		String s="AayooooooooodhyaRaam";
		int a[]=new int[256];
		//insert string into array.
		for(int i=0;i<s.length();i++)
		{
			a[s.charAt(i)]+=1;
		}
		int max=-1;
		char c=' ';
		int cnt=0;
		//for highest check..
		for(int i=0;i<s.length();i++)
		{
			if(max<a[s.charAt(i)])
			{
				max=a[s.charAt(i)];
				c=s.charAt(i);
				
			}
		}
       System.out.println("Highest Occuring character is "+c);
       System.out.println("Number of times ="+max);
	}

}
