
class ParentClass
{
   	ParentClass() //Parent class constructor
	{
		System.out.println("Constructor of Parent");
   	}
}
class JavaExample extends ParentClass
{
   	JavaExample() //child class constructor
	{
   		super();
		System.out.println("Constructor of Child");
   	}
   	
}

public class Q {

	public static void main(String args[])
	{
		JavaExample Jobj=new JavaExample();
   	}
}
