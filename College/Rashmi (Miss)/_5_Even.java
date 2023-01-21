import java.util.Scanner;

public class _5_Even
{
	public static void main(String abc[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Till Which Number is the Range???");
		int a=input.nextInt();
		System.out.println("\n\nEven Nos From 1 to 100\n");
		for(int i=1;i<=a;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+"  ");
			}
			else if(i==21||i==41||i==61||i==81)
			{
				System.out.println();
			}
		}
	}
}
