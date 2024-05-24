/* 1. WAP to create a simple calculator program that takes user input for two numbers and an operator (+, -, *, /) and performs the corresponding arithmetic operation using conditional statements.
*/
 
import java.util.Scanner;

class Calculator 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);//Taking user input

        System.out.print("Enter first number: ");//print num1
        double num1 = sc.nextDouble();//num1 user input

        System.out.print("Enter second number: ");//printing  num2
        double num2 = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");//choose operator
        char operator = sc.next().charAt(0);

        double result = 0;

        if (operator == '+') 
		{
            result = num1 + num2;
        } else if (operator == '-') 
		{
            result = num1 - num2;
        } else if (operator == '*') 
		{
            result = num1 * num2;
        } else if (operator == '/') 
		{
            if (num2 != 0) 
			{
                result = num1 / num2;
            } else 
			{
                System.out.println("Error! Division by zero.");//invalid operator
            }
        } else 
		{
            System.out.println("Error! Invalid operator.");
        }

        System.out.println("Result: " + result);//pritn the result
    }
}

/*

OUTPUT

D:\Anudip Capgemini>java Calculator
Enter first number: 20
Enter second number: 10
Enter operator (+, -, *, /): +
Result: 30.0

*/