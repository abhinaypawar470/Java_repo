import java.util.Scanner;

public class _31_Employee {
	int empno;
	String ename;
	float basic;
	float hra;
	int da;
	float netpay;
	
	public void haveData(int i ,String j, float k, float l, int m) {
		empno=i;
		ename=j;
		basic=k;
		hra=l;
		da=m;
		dispData();
		calculate();
	}
	
	public void calculate() {
		netpay=basic+hra+da;
		System.out.println("\n\nThe Net Pay is "+netpay);
	}
	
	public void dispData() {
		System.out.println("\n\nEmployee No. :: "+empno);
		System.out.println("Name :: "+ename);
		System.out.println("Basic Salary :: "+basic);
		System.out.println("HRA :: "+hra);
		System.out.println("DA :: "+da);
	}
	
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		_31_Employee E1=new _31_Employee();
		
		System.out.println("Enter the your Employee No., Name, Basic Salary, HRA, Dearness Allowance Respectively???");
		int a=input.nextInt();
		String b=input.next();
		float c=input.nextFloat();
		float d=input.nextFloat();
		int e=input.nextInt();
		E1.haveData(a, b, c, d, e);
	}
	
}
