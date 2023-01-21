class A 
{
	A()
	{
		System.out.println("A constructor");
	}
	
	public A(int i)
	{
		System.out.println("A constructor with parameter");
	}

}

class B extends A
{
	B()
	{
		System.out.println("B constructor");
	}
	
	public B(int i)
	{
		System.out.println("B constructor with parameter");
	}
}

public class multilevel1
{
	public static void main(String abd[])
	{
		B b=new B();
	}
}
