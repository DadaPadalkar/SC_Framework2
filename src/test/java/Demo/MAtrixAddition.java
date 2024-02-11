package Demo;

import java.util.Arrays;
import java.util.Scanner;

public class MAtrixAddition 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows number");
		int rows=sc.nextInt();
		System.out.println("Enter column number");
		int cols=sc.nextInt();
		int[][] matrix1=new int[rows][cols];
		int[][] matrix2=new int[rows][cols];
		int[][] sum=new int[rows][cols];
		System.out.println("Enter Matrix 1 Data");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				matrix1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter Matrix 2 Data");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				matrix2[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				sum[i][j]=matrix1[i][j]+matrix2[i][j];
			}
		}
		System.out.println("Matrix 1 dat is as follows");
		for(int [] a:matrix1)
		{
			System.out.println(Arrays.toString(a));
		}
		System.out.println("Matrix 2 dat is as follows");
		for(int [] a:matrix2)
		{
			System.out.println(Arrays.toString(a));
		}
		System.out.println("Sum of data is as follows");
		for(int [] a:sum)
		{
			System.out.println(Arrays.toString(a));
		}
	}

}
