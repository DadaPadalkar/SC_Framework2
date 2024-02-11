package String;

import java.util.HashMap;

public class hmoccurance
{

	public static void main(String[] args) 
	{
		String s="aayodhya";
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		char ch=' ';
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			ch=s.charAt(i);
			if(hm.containsKey(ch))
			{
				count=hm.get(ch);
				count++;
				hm.replace(ch, count);
			}
			else
			{
				hm.put(ch, 1);
			}

		}
		System.out.println(hm);
		int max=-1;
		char c=' ';
		for(char key:hm.keySet())
		{
			System.out.println(key+"="+hm.get(key));
			
			if(max<hm.get(key))
			{
				max=hm.get(key);
				 c=key;
			}
			
		}
		System.out.println("------------Highest Occurance Character--------");
		System.out.println("Highest Occurring Character is "+c+" and number of occurances are="+max);
	}
}
