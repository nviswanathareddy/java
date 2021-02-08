package org.vishwa;

public class unaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = -17;
		
		int y = 10;
		int z = 7;
		
		int a = 10;
		int b = 7;
		
		//Negative Operator -x
		System.out.println("The Initial Value of X is : " +(x) );
		System.out.println("The Negative Value of X is : " +(-x) );
		
		//Post Increment Operator y++
		System.out.println("The Initial Value of Y is : " +(y++) );
		System.out.println("The Post Increased Value of Y is : " +(y++) );
		
		//Pre Increment Operator ++z
		System.out.println("The Pre Increased Value of Z is : " +(++z) );
		
		//Post Decrement Operator a--
		System.out.println("The Initial Value of A is : " +(a--) );
		System.out.println("The Pre Decrement Increased Value of A is : " +(a--) );
		
		//Pre Decrement Operator --b
		System.out.println("The Pre Decrement Value of B is : " +(--b) );


	}

}