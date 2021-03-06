package com.lesson3;
//calculate salary payment based on working Hr(standard hr, overtime hr)
public class Payment {

	// declare instance variables for the values to be calculated
	
	private double standardPay;
	private double overtimePay;
	private double totalPay;
	
	
	// declare a method with 3 params to calculate the payment
	public void calculatePayment(double payRate, double standardHours, double overtimHours){
		
		// calculate the overtime payment
		standardPay = payRate * standardHours;
		
		double overtimePayRate = payRate * 1.5;
		overtimePay = overtimePayRate * overtimHours;
		
		totalPay = standardPay + overtimePay;
	}
	
	public void dispayPayment(){
		System.out.println("My standard pay: " + standardPay);
		System.out.println("My standard overtime pay: " + overtimePay);
		System.out.println("My total pay: " + totalPay);
	}
	
	public static void main(String[] args) {
		
		//declare a variable of type of Payment
		Payment myPayment;
		
		//create an object of type Payment
		myPayment = new Payment();
		
		double pR, sH, oH;
		pR = 20;
		sH = 40;
		oH = 20;
		
		myPayment.calculatePayment(pR, sH, oH);
		myPayment.dispayPayment();
		
		myPayment.calculatePayment(19.5, 35, 12);
		myPayment.dispayPayment();

	}// end mains

}// end class
