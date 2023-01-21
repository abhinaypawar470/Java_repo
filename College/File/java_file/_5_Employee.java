package java_file;

public class _5_Employee {
	
	int empno;
	String ename;
	float basic;
	float hra;
	float da;
	float netpay;

	public static void main(String[] args) {
		_5_Employee obj=new _5_Employee();
		obj.haveData(420,"Abhinay",80000,15000,5000);
		obj.dispData();
	}
	
	void haveData(int a, String b, float c, float d, float e) {
		empno=a;
		ename=b;
		basic=c;
		hra=d;
		da=e;
		calculate();
	}
	
	void calculate() {
		netpay=basic+hra+da;
		System.out.println("The Net Pay is "+netpay);
	}
	
	void dispData() {
		System.out.println("\n\nYour Salary Details....");
		System.out.println("Employee No. \t:: "+empno);
		System.out.println("Employee Name\t:: "+ename);
		System.out.println("Basic Salary \t:: "+basic);
		System.out.println("HRA          \t:: "+hra);
		System.out.println("DA           \t:: "+da);
		System.out.println("Net pay      \t:: "+netpay);
	}

}
