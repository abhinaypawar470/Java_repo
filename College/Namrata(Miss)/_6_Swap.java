
public class _6_Swap
{
	public static void main(String[] args)
	{
		int a=2;
		int b=4;
		System.out.print("Before Swapping...\n"+"A="+a+"\nB="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.print("\n\nAfter Swapping...\n"+"A="+a+"\nB="+b);
	}
}
