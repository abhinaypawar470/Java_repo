
public class _30_Employee {
	String name;
	int doj;
	String address;
	
	public void print_details(String x, int y, String z) {
		name=x;
		doj=y;
		address=z;
		System.out.print(name+"\t "+doj+"\t\t\t "+address+"\n");

	}

	public static void main(String[] args) {
		System.out.print("Name\t Year of Joining\t Address\n");
		
		_30_Employee obj1=new _30_Employee();
		obj1.print_details("Robert", 1994, "64C-Wallstreat");
		_30_Employee obj2=new _30_Employee();
		obj1.print_details("Sam", 2000, "68D-Wallstreat");
		_30_Employee obj3=new _30_Employee();
		obj1.print_details("John", 1999, "26B-Wallstreat");

	}
}
