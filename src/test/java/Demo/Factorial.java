package Demo;

import java.util.Scanner;

public class Factorial 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number ");
		int n=sc.nextInt();
		int fact=n;
		 
		for(int i=n-1;i>0;i--)
		{
			fact=fact*i;
		}
		
		System.out.println("Factorial of "+n+" is="+fact);
	}

}
