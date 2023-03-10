// basic java program to display matrix (2*2)
import java.util.*;
class Dispmatrice
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int ar[][]=new int[10][10];
		System.out.println("enter the elements:");
		for(int i=0;i<2;i++)
		{	
		    for(int j=0;j<2;j++)
		       {
		           ar[i][j]=s.nextInt();
		        }
		}
	                  System.out.println("The resultant matrix is");
		for(int i=0;i<2;i++)
		{
		   System.out.print("\n");
		   for(int j=0;j<2;j++)
		       {
			System.out.print(" "+ar[i][j]);
		          }
		}
	}
}