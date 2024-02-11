package Interview.interview;

import java.util.HashMap;

public class Highhm 
{

	public static void main(String[] args) 
	{
		String s="abcdjjsdkklsdl";
		char a[]=s.toCharArray();
		
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		char ch=' ';
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			ch=a[i];
			if(hm.containsKey(ch))
			{
				count=hm.get(ch);
				count++;
				hm.replace(ch, count);
			}
			else
			{
				hm.put(ch,1);
			}
		}
		System.out.println(hm);
		
	}

}
