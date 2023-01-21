package java_file;

public class _7_Product {
	
	int PNumber;
	String PName;
	float PPrice;
	int PQuantity;
	float TotalPrice;

	public static void main(String[] args) {
		_7_Product obj=new _7_Product(777,"Laptop",80799.99f,2);
		obj.calculateTotal();
		obj.display();
	}
	
	_7_Product(int a, String b, float c, int d){
		PNumber=a;
		PName=b;
		PPrice=c;
		PQuantity=d;
	}
	
	void calculateTotal(){
		TotalPrice=PPrice*PQuantity;
		System.out.println("Total Amount Payable is :: "+TotalPrice);
	}
	
	void display() {
		System.out.println("\n\nYour Product Details....");
		System.out.println("Product No.  \t:: "+PNumber);
		System.out.println("Product Name \t:: "+PName);
		System.out.println("Product Price \t:: "+PPrice);
		System.out.println("Quantity \t:: "+PQuantity);
		System.out.println("Total Price \t:: "+TotalPrice);
	}

}
