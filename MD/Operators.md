> Arithmetic Operators

```java

package org.vishwa;

public class arithmeticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=17;
		int y=5;
		
        //Addition +
		System.out.println("Addition of X and Y is : " +(x + y));
        //Subtraction -
		System.out.println("Subtraction of X and Y is : " +(x - y));
        //Multiplication *
		System.out.println("Multiplication of X and Y is : " +(x * y));
        //Division /
		System.out.println("Division of X and Y is : " + (x / y));
        //Modulus %
		System.out.println("Modulus of X and Y is : " + (x % y));

	}

}
```
> Assignment Operators
```java
package org.vishwa;

public class assignmentOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 17;
		int y = x;
		int z = x + y;
		
		int a = 7;
		a = a + 3; // a += 3;
		
		System.out.println("The Value of X is : " +x );
		System.out.println("The Value of Y is : " +y );
		System.out.println("The Value of Z (or) Sum of X and Y is : " +z);
		
		System.out.println("The Value of A is " + a);

	}

}
```

> Unary Operator
```java
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
```