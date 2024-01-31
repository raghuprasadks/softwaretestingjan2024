package javabasics;

public class Calculator {
	
	public int add (int num1,int num2) {
		return num1+num2;
	}
	
	public int subtract (int num1,int num2) {
		return num1-num2;
	}
	
	public int multiply (int num1,int num2) {
		return num1-num2;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator calsi = new Calculator();
		
		int result =calsi.add(100, 150);
		System.out.println("Result of addtion is "+result);
	}

}
