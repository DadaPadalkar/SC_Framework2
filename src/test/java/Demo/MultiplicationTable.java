package Demo;

import java.util.Scanner;

public class MultiplicationTable 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number Whose Table You want");
		int n=sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			int t=n*i;
			System.out.println(t);
		}

	}

}
