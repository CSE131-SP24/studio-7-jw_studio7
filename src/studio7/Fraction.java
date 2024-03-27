package studio7;

public class Fraction {
	
	private double numerator;
	private double denominator;
	
	
	public Fraction(double n, double d) {
		numerator = n;
		denominator = d;
	}
	
	public double N() {
		return numerator;
	}
	public double D() {
		return denominator;
	}
	
	
	public Fraction add(Fraction f0) {
		double newN = (f0.N() *  denominator) + (numerator * f0.D());
		double newD = denominator * f0.D();
		Fraction f_new = new Fraction(newN, newD);
		return f_new;
	}
	
	public Fraction multiply(Fraction f0) {
		double newN = f0.N() * numerator;
		double newD = f0.D() * denominator;
		Fraction f_multi = new Fraction(newN, newD);
		return f_multi;
	}
	public Fraction reciprocal() {
		double newN = denominator;
		double newD = numerator;
		Fraction f_r = new Fraction(newN, newD);
		return f_r;
	}
	//public Fraction simplify() {
		//while()
	//}
	
	public String toString() {
		return numerator + "/" + denominator;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction f0 = new Fraction (3.0, 4.0);
		Fraction f1 = new Fraction (1.0, 3.0);
		System.out.println(f0);
		System.out.println(f1);
		System.out.println(f0.add(f1));
		System.out.println(f0.multiply(f1));
		
		

	}

}
