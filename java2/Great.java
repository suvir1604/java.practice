import java.util.*;
class Great
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the first number");
	int x=sc.nextInt();
	System.out.println("Enter the second number");
	int y=sc.nextInt();
	if(x<y)
	{
		System.out.println(x+ "is less than "+y);
	}
	else if(y<x)
	{
		System.out.println(x+ "is greater than "  +y);
	}
	else
	{
		System.out.println(x+ "is equal to " +y);
	}
	}
}
	