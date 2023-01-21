
public class My_Calculation
{
	public static void main(String abc[])
	{
		int a=20, b=10;
		Math_ops O=new Math_ops();
		O.add(a, b);
		O.sub(a, b);
		O.mul(a, b);
	}

}

class Calculations
{
	int z;
	public void add(int x, int y)
	{
		z=x+y;
		System.out.println("The Addition is "+z);
	}
	 
	public void sub(int x, int y)
	{
		z=x-y;
		System.out.println("The Subtaction is "+z);
	}
}

class Math_ops extends Calculations
{
	public void mul(int x, int y)
	{
		z=x*y;
		System.out.println("The Multiplication is "+z);
	}
	
	public void div(int x, int y)
	{
		z=x/y;
		System.out.println("The Division is "+z);
	}
}