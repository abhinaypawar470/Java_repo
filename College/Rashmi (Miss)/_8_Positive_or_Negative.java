import java.util.Scanner;

public class _8_Positive_or_Negative 
{
	public static void main(String abc[])
	{
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter a Number???");
		int a=input.nextInt();
		if(a>0)
			System.out.println(a+" is a Positive No.");
		else if(a<0)
			System.out.println(a+" is a Negative No.");
		else
			System.out.println(a+" is Zero!!!!");
	}

}
