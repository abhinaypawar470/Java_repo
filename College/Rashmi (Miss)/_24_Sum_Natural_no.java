
public class _24_Sum_Natural_no
{
	public static void main(String args[])
	{
		System.out.println("The 1st 10 Natural Number ::");
		int a=0;
		for(int i=1;i<=10;i++)
		{
			if(i==6)
				System.out.println();
			System.out.print(i+"\t");
			a+=i;
		}
		System.out.println("\n\nThe SUM of 1st 10 Natural Number :: "+a);
	}
}
