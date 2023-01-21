import java.util.Scanner;

public class _20_Switch_case_calculator
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter 2 Values ???");
		int a=input.nextInt();
		int b=input.nextInt();
		System.out.println("Which Operation to Perform (Press +, -, *, /, %) ???");
		char c=input.next().charAt(0);
		
		switch(c)
		{
		case '+':
			System.out.println("The Sum is "+(a+b));
			break;
		case '-':
			System.out.println("The Sub is "+(a-b));
			break;
		case '*':
			System.out.println("The Mul is "+(a*b));
			break;
		case '/':
			System.out.println("The Div is "+(a-b));
			break;
		case '%':
			System.out.println("The Mod is "+(a*b));
			break;
		default:
			System.out.println("Invalid Entry");
		}
	}
}
