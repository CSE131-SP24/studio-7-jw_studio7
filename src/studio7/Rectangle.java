package studio7;

public class Rectangle {
	
	private double length;
	private double width;
	
	public Rectangle(double initLength, double initWidth){
		length = initLength;
		width = initWidth;
	}
	
	public double Perimeter() {
		System.out.println((length+width)*2);
		return (length+width)*2;
	}
	
	public double Area() {
		System.out.println(length*width);
		return length*width;
	}
	
	public boolean testSquare() {
		if (length==width) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isSmaller(Rectangle r0, Rectangle r1) {
		if (r0.Area()< r1.Area()) {
			System.out.println(true);
			return true;
		}
		else {
			System.out.println(false);
			return false;
		}
	}
	
	public String toString() {
		return "length: "+length+" "+"width: "+width;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle(3.0, 4.0);
		r1.Perimeter();
		r1.Area();
		System.out.println(r1);
		Rectangle r0 = new Rectangle(2.0, 1.0);
		r0.Perimeter();
		r0.Area();
		r1.isSmaller(r0, r1);

	}

}
