package Demo;

import java.util.Arrays;
import java.util.Scanner;

public class TransPoseMatrix 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of rows");
		int r=sc.nextInt();
		System.out.println("Enter Number of cols");
		int c=sc.nextInt();
		System.out.println("Matrix will be of "+r+"x"+c);
		int[][] matrix=new int[r][c];
		
		
		System.out.println("Enter"+r*c+ "Values");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				matrix[i][j]=sc.nextInt();
			}
		}
		System.out.println("Matrix Original is");
		for(int[] a:matrix)
		{
			System.out.println(Arrays.toString(a));
		}
		for(int i=0;i<c;i++)
		{
			for(int j=0;j<r;j++)
			{
				matrix[j][i]=matrix[j][i];
			}
		}
		System.out.println("Transpose of Matrix  is");
		for(int i=0;i<c;i++)
		{
			for(int j=0;j<r;j++)
			{
				System.out.print(matrix[j][i]+"\t");
			}
			System.out.println();
		}
	}

}
