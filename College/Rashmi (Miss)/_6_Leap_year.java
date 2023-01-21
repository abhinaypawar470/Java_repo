import java.util.Scanner;

public class _6_Leap_year
{
	public static void main(String abc[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Year to Check for leap Year ???");
		int year=input.nextInt();
		if(((year%4==0)&&(year%100!=0))||(year%400==0))
		{
			System.out.println("\n\n"+year+" is a LEAP YEAR");
		}
		else
		{
			System.out.println("\n\n"+year+" is a COMMON YEAR");
		}
	}
}