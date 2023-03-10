// a basic java program to add two matrices
import java.util.*;
class Additionmatrix
{
	public static void main(String args[])
	{
	 Scanner s=new Scanner(System.in);
	 int i,j;
	 int a[][]=new int[10][10];
	 int b[][]=new int[10][10];
	 int sum[][]=new int[10][10];
	System.out.println("enter the no of rows:");
	int rows=s.nextInt();
	System.out.println("enter the no of columns:");
	int columns=s.nextInt();
	System.out.println("enter the elements(for 1st matrix):");
	for(i=0;i<rows;i++)
	{
	 for(j=0;j<columns;j++)
	{
	   a[i][j]=s.nextInt();
	}
	}
	System.out.println("enter the elements(for 2nd matrix):");
	for(i=0;i<rows;i++)
	{
	 for(j=0;j<columns;j++)
	{
	   b[i][j]=s.nextInt();
	}
	//ADDITION
	}
	for(i=0;i<rows;i++)
	{
	 for(j=0;j<columns;j++)
	{
	   sum[i][j]=a[i][j]+b[i][j];
	}
	}
	System.out.println("THE ADDITION OF TWO MATRICES IS:");
	for(i=0;i<rows;i++)
	{
	System.out.print("\n");
	for(j=0;j<columns;j++)
	{
	System.out.print(" "+sum[i][j]);
	}
	}
	}
}