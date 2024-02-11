package Demo;

public class Maxocr
{

	public static void main(String[] args)
	{
		String s="gggghhhhhkkkk";
		
		int arr[]=new int[256];
		
		for(int i=0;i<s.length();i++)
		{
			arr[s.charAt(i)]+=1;
		}
		
		int max=-1;
		char c=' ';
		int cnt=0;
		for(int i=0;i<s.length();i++)
		{
			if(max<arr[s.charAt(i)])
			{
				max=arr[s.charAt(i)];
				 c=s.charAt(i);
				 cnt=cnt+1;
			}
		}
		System.out.println("Maximum occuring Char in String="+c+" no of times="+cnt);
		
		

	}

}
