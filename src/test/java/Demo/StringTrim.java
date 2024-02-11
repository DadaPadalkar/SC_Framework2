package Demo;

public class StringTrim 
{

	public static void main(String[] args) 
	{
		System.out.println("Before Trim");
		String s="  Hellow world   ";
		System.out.println(s);
		System.out.println("After Trim");
		System.out.println(s.trim());
		
		System.out.println(s.concat("Very Bad"));
	}

}
