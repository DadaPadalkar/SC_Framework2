package String;

import java.util.HashMap;

public class OccuranceStringHM 
{

	public static void main(String[] args) 
	{
		String s="Aayush";
		char ch;
		int count;
		
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		
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
				hm.put(ch, 1);
			}
		}
   for(char key:hm.keySet())
   {
	   System.out.println(key+"="+hm.get(key));
   }
	}

}
