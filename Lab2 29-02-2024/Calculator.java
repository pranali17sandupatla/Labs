/*
1. WAP for creating the mini calculator. you have to perform an operation on the basis of user choice until the user press yes to continue(add, mul, sub,div)
*/

import java.util.Scanner;

class  Calculator1
{
	public static void main(String[] args) 
{
    char operator;//
    Double number1, number2, result;

    // create an object of Scanner class
    Scanner sc = new Scanner(System.in);
	char choice;
	do{
    // ask users to enter operator
    System.out.println("Choose an operator: +, -, *, or /");
    operator = sc.next().charAt(0);

    // ask users to enter numbers
    System.out.println("Enter first number");
    number1 = sc.nextDouble();

    System.out.println("Enter second number");
    number2 = sc.nextDouble();

    switch (operator) {

      // performs addition between numbers
      case '+':
        result = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + result);
        break;

      // performs subtraction between numbers
      case '-':
        result = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + result);
        break;

      // performs multiplication between numbers
      case '*':
        result = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + result);
        break;

      // performs division between numbers
      case '/':
        result = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + result);
        break;

      default:
        System.out.println("Invalid operator!");
    }
		System.out.print("Do you want to Continue? (y/n): ");
        choice = sc.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        System.out.println("Goodbye!");
        sc.close();
  }
}

/*

OUTPUT

D:\Anudip Capgemini>java Calculator1
Choose an operator: +, -, *, or /
+
Enter first number
10
Enter second number
20
10.0 + 20.0 = 30.0
Do you want to Continue? (y/n): y
Choose an operator: +, -, *, or /
/
Enter first number
20
Enter second number
40
20.0 / 40.0 = 0.5 

*/
            
