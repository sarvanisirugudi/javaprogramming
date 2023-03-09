import java.util.*;
import java.lang.Math;
class Armstrongnum
{
	public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the value of num:");
	int num=s.nextInt();
	int temp=num;
	int r,sum=0;
	while(temp>0)
	{
		r=temp%10;
		sum+=(Math.pow(r,3));
		temp=temp/10;
	}
	if(num==sum)
	{
	System.out.println("armstrong"+sum);
	}
	else
	{
	System.out.println("not a armstrong num");
	}
}
}