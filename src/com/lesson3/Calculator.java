package com.lesson3;
//perform simple calculation using methods
public class Calculator {
	//declare instance variables to store result of
	private double result;
	
	//declare a method Called add - each method describes behavior
	//with two parameters
	public void add(double numberOne, double numberTwo){
	//add value numberOne and numberTwo and store in instance variables (result)
	result = numberOne + numberTwo;
	// display
	System.out.println(numberOne + " + " + numberTwo + " = " + result);
	
	result = numberOne - numberTwo;
	System.out.println(numberOne + " - " + numberTwo + " = " + result);
	
	result = numberOne * numberTwo;
	System.out.println(numberOne + " * " + numberTwo + " = " + result);
	
	result = numberOne / numberTwo;
	System.out.println(numberOne + " / " + numberTwo + " = " + result);
	
	}//ends the body of add method
	
	
	public static void main(String[] args) {
		
		// reuse the Calculator class
		//declare a variable of type of Calculator
		Calculator calc;
		calc = new Calculator();
		
		calc.add(12.6, 18);

	}// end mains

}// end class
