import java.lang.*;
import java.util.*;
class Rel
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter the content of the document");
		String word1=sc.nextLine();
		System.out.println("Enter the old name of the company");
		String word2=sc.nextLine();
		System.out.println("Enter the new name of the company");
		String word3=sc.nextLine();
		
		String word4=word1.replace(word2,word3);
		System.out.println(  "The content of the modified document is " +word4);
		}
	}
	