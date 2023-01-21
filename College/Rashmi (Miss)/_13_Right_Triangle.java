import java.util.Scanner;

public class _13_Right_Triangle 
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("How many Rows???");
		int a=input.nextInt();
		int b=1;
		System.out.println("\n\nRight Triangle!!!\n");
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(b<10)
					System.out.print(b+"   ");
				else
					System.out.print(b+"  ");
				b++;
			}
			System.out.println();
		}
	}
}
