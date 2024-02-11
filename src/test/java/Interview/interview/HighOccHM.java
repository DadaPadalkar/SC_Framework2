package Interview.interview;

import java.util.HashMap;

public class HighOccHM 
{

	public static void main(String[] args) 
	{
		String s="Aaayush";
		char []a=s.toCharArray();
		
		HashMap<Character,Integer>hm=new HashMap<Character, Integer>();
		int count=0;
		char ch=' ';
		for(int i=0;i<s.length();i++)
		{
			ch=a[i];
			if(hm.containsKey(ch))
			{
				count=hm.get(ch);
				count++;
				hm.replace(a[i],count);
				
			}
			else
			{
				hm.put(ch,1);
			}
			
		}
		int max=-1;
		char high=' ';
		
		for(char c:hm.keySet())
		{
			System.out.println(c+"="+hm.get(c));
			if(max<hm.get(c))
			{
				max=hm.get(c);
				high=c;
			}
			
		}
System.out.println("Highest Occuring Character is "+high);
	}

}
