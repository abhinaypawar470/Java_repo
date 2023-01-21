import java.util.Scanner;

public class _1_Arithmetic_operations
{
	public static void main(String abc[])
	{
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter 2 Values???");
		float a=input.nextFloat();
		float b=input.nextFloat();
		
		System.out.println("The Sum = "+(a+b));
		System.out.println("The Sub = "+(a-b));
		System.out.println("The Mul = "+(a*b));
		System.out.println("The Div = "+(a/b));
		System.out.println("The Mod = "+(a%b));
	}
}
