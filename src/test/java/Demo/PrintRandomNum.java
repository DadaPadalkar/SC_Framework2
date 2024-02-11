package Demo;

import java.util.Random;

public class PrintRandomNum
{

	public static void main(String[] args) 
	{
		Random t=new Random();
		
		System.out.println(t.nextInt(100));
		for(int i=0;i<12;i++)
		{
			System.out.println(t.nextInt(100));
		}

	}

}
