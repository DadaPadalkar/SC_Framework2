package Collection;

import java.util.ArrayList;

public class List 
{

	public static void main(String[] args)
	{
		/*Collection declaration type
		 1.Type Safe-Same type of object can be added only [Generic way ]
		 2.Un Type safe -Different types of elements to be added.
		 */
		ArrayList al=new ArrayList();
		
		ArrayList<String> al1=new ArrayList();
		
		al.add("India");
		al.add(1);
		System.out.println(al);
		al1.add("ajay");
	     al1.forEach(null);

	}

}
