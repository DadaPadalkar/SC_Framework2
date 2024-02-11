package Demo;

import java.util.Scanner;

public class Ifelse 
{

	public static void main(String[] args)
	{
		int passingmarks=40;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Marks Obtained...");
		int marksobt=sc.nextInt();
		
		if(marksobt>=passingmarks)
		{
			System.out.println("Congratulations You Have Passed Exam ");
			System.out.println("You Have Got "+marksobt+"%  Marks...");
		}
		else
		{
			System.out.println("Unfortunately You Are Failed.......");
		}
		

	}

}
