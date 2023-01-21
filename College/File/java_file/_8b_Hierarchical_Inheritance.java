package java_file;

class Mobile_Phone {
	int model_no;
	String brand;
	String colour;
	float price;
	int battery;
	String type;
	
	
	void call() {
		System.out.println(brand+" "+type+" Making a Call !!!");
	}
	
	void message() {
		System.out.println(brand+" "+type+" Sending Message !!!");
	}
	
	void camera() {
		System.out.println(brand+" "+type+" Clicked Photo !!!");
	}
	
	void speaker() {
		System.out.println(brand+" "+type+" Playing Sound !!!");
	}
	
	void radio() {
		System.out.println(brand+" "+type+" Playing FM Radio !!!");
	}
}

class KeypadPhone extends Mobile_Phone {
	float keypad_size;
	
	KeypadPhone(){
		type="Keypad Phone";
		brand="Nokia";
	}
}

class SmartPhone extends Mobile_Phone {
	float display_size;
	String Stylus;
	
	SmartPhone() {
		type="Smart Phone";
		brand="Apple";
	}
	
	void finger_print_scanner() {
		System.out.println(brand+" "+type+" Scanning Finger !!!");
	}
	
	void face_recognition() {
		System.out.println(brand+" "+type+" Scanning Face !!!");
	}
	
	void games () {
		System.out.println(brand+" "+type+" Playing Video Game !!!");
	}
}

class FoldingPhone extends SmartPhone {
	
	FoldingPhone() {
		type="Folding Phone";
		brand="Samsung";
	}
	
	void desktop_mode() {
		System.out.println(brand+" "+type+" in Desktop Mode !!!");
	}
	
	void Multiwindow() {
		System.out.println(brand+" "+type+" using Multi-Window Function !!!");
	}
}

public class _8b_Hierarchical_Inheritance {

	public static void main(String[] args) {
		FoldingPhone samsung=new FoldingPhone();
		SmartPhone apple=new SmartPhone();
		KeypadPhone nokia=new KeypadPhone();
		
		samsung.call();
		samsung.desktop_mode();
		System.out.println();
		apple.call();
		apple.games();
		System.out.println();
		nokia.call();
		nokia.radio();
	}

}
