package calculator;

import org.junit.jupiter.api.Test;

public class Calculator {
	
	public float a;
	public float b;
	
	public Calculator(float a, float b) {
		this.a=a;
		this.b=b;
	}
	
	public float add() {
		return a+b;
	}
	
	public float subtract() {
		return a-b;
	}
	
	public float multiply() {
		return a*b;
	}
	
	public float divide() {
		return a/b;
	}
	
	@Test
	public void checkCalculator() {
		Calculator c = new Calculator(25, 10);
		System.out.println("The sum of two numbers is: "+c.add());
		System.out.println("The substraction of two numbers is: "+c.subtract());
		System.out.println("The multi[lication of two numbers is: "+c.multiply());
		System.out.println("The division of two numbers is: "+c.divide());
	}

}
