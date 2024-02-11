package Demo;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;

public class RangeMultipltable
{

	public static void main(String[] args) 
	{
		//LogManager log=LogManager(driver);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter starting Number");
		int a=sc.nextInt();
		System.out.println("Enter End Number");
		int b=sc.nextInt();
		for(int i=a;i<=b;i++)
		{
			System.out.println("Table of "+i+"is");
			for(int j=1;j<=10;j++)
			{
				
				int t=i*j;
				System.out.print(t);
			}
		}
		
	}

}
