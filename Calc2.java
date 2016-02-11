package ooCalculator;

public class Calc {

	private double number; 
	
	Calc(double n) {
		number = n; }
	
	public void add(double n) {
		number += n;
	}
	
	public void subtract(double n) {
		number -= n;
	}
	
	public void division(double n) {
		number /= n;
	}
	
	public void multiplication(double n) {
		number *= n;
	}
	
	public double show() {
		return number;
	}

	public static void main(String[] args) {
		
		Calc Calcu = new Calc(2); 
		
		Calcu.add(10);
		System.out.println(Calcu.show());
		Calcu.subtract(2.25);
		System.out.println(Calcu.show());
		Calcu.multiplication(10);
		System.out.println(Calcu.show());
		Calcu.division(2);
		System.out.println(Calcu.show());
		
		
		
	}
}


