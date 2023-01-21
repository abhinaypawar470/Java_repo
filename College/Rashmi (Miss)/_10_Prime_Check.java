import java.util.Scanner;

public class _10_Prime_Check
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Number???");
		int a=input.nextInt();
		int flag=0;
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
				flag++;
		}
		
		if(flag==2)
			System.out.println(a+" is a Prime No.");
		else
			System.out.println(a+" is Not a Prime No.");
	}
}
