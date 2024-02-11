package Collection;

import java.util.*;

public class Set 
{

	public static void main(String[] args)
	{
		TreeSet<String> hs=new TreeSet();
		
		hs.add("RAM");
		hs.add("ALl");
		hs.add("ayush");
		hs.add("Dada");
		
		System.out.println(hs);
		
		for (String S:hs)
		{
			System.out.println(S);
		}
		
		Iterator itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
