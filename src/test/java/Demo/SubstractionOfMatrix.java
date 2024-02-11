package Demo;

import java.util.Arrays;
import java.util.Scanner;

public class SubstractionOfMatrix 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
        System.err.println("Enter Row Numbers ");
        int rows=sc.nextInt();
        System.err.println("Enter column Numbers ");
        int cols=sc.nextInt();
        int [][]matrix1=new int[rows][cols];
        int [][]matrix2=new int[rows][cols];
        int [][]Diff=new int[rows][cols];
        
        System.out.println("Enter Data for Matrix1");
        for(int i=0;i<rows;i++)
        {
        	for(int j=0;j<cols;j++)
        	{
        		matrix1[i][j]=sc.nextInt();
        	}
        }
        
        System.out.println("Enter Data for Matrix2");
        for(int i=0;i<rows;i++)
        {
        	for(int j=0;j<cols;j++)
        	{
        		matrix2[i][j]=sc.nextInt();
        	}
        }

        System.out.println("Output");
        for(int i=0;i<rows;i++)
        {
        	for(int j=0;j<cols;j++)
        	{
        		Diff[i][j]=matrix1[i][j]-matrix2[i][j];
        	}
        }
        
        System.out.println("Matrix 1 data");
        for(int[] a:matrix1)
        {
        	System.out.println(Arrays.toString(a));
        }
        System.out.println("Matrix 2 data");
        for(int[] a:matrix2)
        {
        	System.out.println(Arrays.toString(a));
        }
        System.out.println("Difference data=");
        for(int[] a:Diff)
        {
        	System.out.println(Arrays.toString(a));
        }
        
	}

}
