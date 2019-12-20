import java.util.*;
class Discount1
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	
	System.out.println("price of item 1:");
	double x=sc.nextDouble();
	System.out.println("price of item 2:");
	double y=sc.nextDouble();
	System.out.println("Discount in percentage");
	int z=sc.nextInt();
	double total=x+y;
	System.out.printf("Total amount: $% .2f \n",total);
	double saved=(total/z) ;
	double disamt=total-saved;
	System.out.printf("Discounted amount: $% .2f \n",disamt);
	System.out.printf("Saved amount: $% .2f \n",saved);
	}
}
	