package Demo;

public class high 
{

	public static void main(String[] args) 
	{
		String s="Nityaaa";
		//define array of Ascii code;
		
		int arr[]=new int[256];
		for(int i=0;i<s.length();i++)
		{
			arr[s.charAt(i)]+=1;//each character from string is got added in array at desired location a=97,b=98 ASCII code.
		}
		
		int max=-1;//max value for counting number of times char occured.
		char high=' ';
		//now all the character occurances are inserted i array.
		//now we will count max occurances.
		for(int i=0;i<s.length();i++)
		{
			if(max<arr[s.charAt(i)])
			{
				max=arr[s.charAt(i)];
				high=s.charAt(i);
			}
		}
       System.out.println(high);
	}

}
