package com.epam.calculator;

/*S.O.L.I.D
  KISS
  DRY
  YAGNI principles
  This shows ISP(Interface segregation principle) to implement two different methods in two different classes
*/

public interface Operation
{
	void operation(double num1,double num2);
}

