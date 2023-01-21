import java.util.Scanner;

public class _7_Eveno_or_Odd
{
	public static void main(String abc[])
	{
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter a Number???");
		int a=input.nextInt();
		if(a%2==0)
			System.out.println(a+" is a Even No.");
		else
			System.out.println(a+" is Not a Even No.");
	}
}