import java.util.Scanner;

public class _23_Factorial
{
	public static void main(String abc[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Number ???");
		int a=input.nextInt();		
		int z=a;
		
		if(a==0||a==1)
			System.out.println("The Factorial of "+a+"! is 1");
		else
		{
		    for(int i=a-1;i>=1;i--)
			    z=z*i;
		    System.out.println("The Factorial of "+a+"! is "+z);
		}
	}
}
