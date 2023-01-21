package java_file;

class Area_Rectangle {
	private float length;
	private float breadth;
	private float Area;

	private void Cal_Area() {
		Area=length*breadth;
		System.out.println("The Area of Rectangle is :: "+Area+" CM");
	}

	public void setLength_Breadth(float length, float breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public float getLength() {
		return length;
	}

	public float getBreadth() {
		return breadth;
	}

	public void show_Area() {
		Cal_Area();
	}
}

public class _11_Encapsulation {

	public static void main(String[] args) {
		Area_Rectangle obj=new Area_Rectangle();
		obj.setLength_Breadth(17, 10);
		System.out.println("Rectangle Details in CMs ...");
		System.out.println("Length  :: "+obj.getLength());
		System.out.println("Breadth :: "+obj.getBreadth());
		obj.show_Area();
	}
}
