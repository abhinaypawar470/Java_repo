import java.util.Scanner;

public class _4_ASCII
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the Character???");
		char c=input.next().charAt(0);
		System.out.println("The ASCII Value of "+c+" = "+(int)c);
	}
}
