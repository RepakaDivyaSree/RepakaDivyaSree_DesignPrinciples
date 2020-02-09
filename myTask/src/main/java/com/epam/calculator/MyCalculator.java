import com.epam.calculator.Addition;
import com.epam.calculator.Subtraction;
import com.epam.calculator.Multiplication;
import com.epam.calculator.Division;
import com.epam.calculator.Operation;
import com.epam.calculator.Exceptions;

import java.util.Scanner;

 
public class MyCalculator
{
	public static void main(String arg[])
	{

	Addition a=new Addition();
	Subtraction s=new Subtraction();
	Multiplication m=new Multiplication();
	Division d=new Division();
	//User Menu
	System.out.println("########SIMPLE CALCULATOR########");
	System.out.println("########       MENU      ########");
	
	System.out.println("\t1: ADDITION\n\t2: SUBTRACTION\n\t3: MULTIPLICATION\n\t4: DIVISION");
	
	Scanner sc=new Scanner(System.in);
	int ch;
	do
	{
	System.out.println("Enter any two numbers:");
	double number1=sc.nextDouble();
	double number2=sc.nextDouble();

	System.out.println("Choose one of the above operations:");
	int choice=sc.nextInt();
	switch(choice)
	{
	case 1:
		a.operation(number1,number2);
		break;
	case 2:
		s.operation(number1,number2);
		break;
	case 3:
		m.operation(number1,number2);
		break;
	case 4:
		if(number2==0)
		{
		d.exceptions();
		break;
		}
		else
		{
		d.operation(number1,number2);
		break;
		}
	}
	
		System.out.println("Press 1 to quit and 0 to continue!");
		ch=sc.nextInt();
	}while(ch!=1);
	System.out.println("########     THANK YOU    ########");
	}
}
	
			