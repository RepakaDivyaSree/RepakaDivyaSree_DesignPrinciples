package com.epam.calculator;

/*SRC that performs division and also implements another interface Exceptions
to throw an exception when divided by 0*/

public class Division implements Operation,Exceptions
{
	public void exceptions()
	{
	System.out.println("Sorry! Cannot divide number by 0");
	}
	public void operation(double num1,double num2)
	{
	System.out.println(num1+" / "+num2+" = "+(num1/num2));
	}
}
