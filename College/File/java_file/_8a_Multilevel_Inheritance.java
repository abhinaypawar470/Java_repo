package java_file;

class Calculation {
	
	void add(float x, float y) {
		System.out.println("\nThe Addition of "+x+" and "+y+" is "+(x+y));
	}
	
	void sub(float x, float y) {
		System.out.println("\nThe Subtraction of "+x+" and "+y+" is "+(x-y));
	}
}

class NewCalculation1 extends Calculation{
	
	void mul(float x, float y) {
		System.out.println("\nThe Multiplication of "+x+" and "+y+" is "+(x*y));
	}
	
	void div(float x, float y) {
		System.out.println("\nThe Division of "+x+" and "+y+" is "+(x/y));
	}
}

class NewCalculation2 extends NewCalculation1{
	
	void mod(float x, float y) {
		System.out.println("\nThe Moduls of "+x+" and "+y+" is "+(x+y));
	}
}

public class _8a_Multilevel_Inheritance {

	public static void main(String[] args) {
		NewCalculation2 obj=new NewCalculation2();
		obj.add(12, 8);
		obj.sub(45, 13);
		obj.mul(13, 67);
		obj.div(77, 7);
		obj.mod(69, 9);
	}

}
