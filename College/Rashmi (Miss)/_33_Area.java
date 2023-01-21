
public class _33_Area {
	
	float pi=3.14f;
	public void findArea(int a) {
		System.out.println("\n\nArea of Square = "+(a*a));
	}
	
	public void findArea(int len, int wid) {
		System.out.println("\n\nArea of Rectangle = "+(len*wid));
	}
	
	public void findArea(float rad) {
		System.out.println("\n\nArea of Circle = "+(pi*rad*rad));
	}
	
	public static void main(String args[]) {
		_33_Area myobj=new _33_Area();
		System.out.println("Values are in CM");
		myobj.findArea(20);
		myobj.findArea(30, 15);
		myobj.findArea(10.5f);
	}
}
