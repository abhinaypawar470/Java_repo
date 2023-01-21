package java_file;
import java.util.Scanner;

public class _12_Excepion_Handling {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter 2 numbers to perform Division ???");
		int a=input.nextInt();
		int b=input.nextInt();
		try
		{
			int c=a/b;
			System.out.println("The Quotient of division is :: "+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Division by Zero is not Possible!!!!");
		}
		finally
		{
			System.out.println("\nRun the Code Again if Needed...");
			System.out.println("The Program has Ended!!!");
		}
		
	}
}
