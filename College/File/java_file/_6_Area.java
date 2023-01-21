package java_file;

public class _6_Area {

	float pi=3.14f;
	
	public static void main(String args[]) {
		_6_Area myobj=new _6_Area();
		System.out.println("Values are in CM");
		System.out.println("\n\nSide = "+20);
		myobj.findArea(20);
		System.out.println("\n\nLength = 30\nBreadth = 15");
		myobj.findArea(30, 15);
		System.out.println("\n\nRadius = "+10.5f);
		myobj.findArea(10.5f);
	}
	
	public void findArea(int a) {
		System.out.println("Area of Square = "+(a*a));
	}
	
	public void findArea(int len, int wid) {
		System.out.println("Area of Rectangle = "+(len*wid));
	}
	
	public void findArea(float rad) {
		System.out.println("Area of Circle = "+(pi*rad*rad));
	}
}
