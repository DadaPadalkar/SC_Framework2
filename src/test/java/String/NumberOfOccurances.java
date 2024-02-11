package String;

import java.util.HashMap;

public class NumberOfOccurances 
{

	public static void main(String[] args) 
	{
		String s="java";
		int count;
		char ch;

		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		//for putting character wise count of String into HM
		for(int i=0;i<s.length();i++)
		{
			ch=s.charAt(i);
			if(hm.containsKey(ch))
			{
				count=hm.get(ch);
				count++;
				hm.replace(ch,count);
			}
			else
			{
				hm.put(ch,1);
			}
		}
		int max=-1;
		char cha=' ';
		for(Character key:hm.keySet())
		{
			System.out.println(key+"="+hm.get(key));
			if(max<hm.get(key)) 
			{
				max=hm.get(key);
				cha=key;
			}
		}
		System.out.println("Maxi Occurance "+cha);
	}

}
