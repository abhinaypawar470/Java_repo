
class Employee
{
	float Salary=20000;
}

class Coder extends Employee
{
	int bonus=5000;
	
	public static void main(String abc[])
	{
		Coder c=new Coder();
		System.out.println("Salary is :: "+c.Salary);
		System.out.println("Bonus is :: "+c.bonus);

	}
}
