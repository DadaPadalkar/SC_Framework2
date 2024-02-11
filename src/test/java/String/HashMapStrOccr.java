package String;
import java.util.HashMap;
public class HashMapStrOccr 
{

	public static void main(String[] args) 
	{
		String s="Abdjdjkdfjk";
		HashMap<Character,Integer> hm=new HashMap<Character, Integer>();
		char[]a=s.toCharArray();
		char ch=' ';
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			ch=a[i];
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
		//System.out.println(hm);
		int max=-1;
		char key=' ';
		for(char c:hm.keySet())
		{
			System.out.println(c+"="+hm.get(c));
			if(max<hm.get(c))
			{
				max=hm.get(c);
				key=c;
			}
		}
		
		System.out.println("MAX Occuring Character="+key);
	}

}
