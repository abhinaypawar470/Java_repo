//import java.util.Scanner;

public class _22_Prime100
{
	public static void main(String args[])
	{
		int full=0, next=10;
		System.out.println("1st 100 Prime Numbers\n");
		
		for(int i=1;i>0;i++)
		{
			if(full==100)
				break;
			
			int flag=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
					flag++;
			}
			
			if(flag==2)
			{
				System.out.print(i+"\t");
				full++;
				if(full==next)
				{
					System.out.println("\n");
					next+=10;
				}
			}
		}
	}
}
