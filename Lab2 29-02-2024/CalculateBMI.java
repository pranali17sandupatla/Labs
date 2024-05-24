/*
3. A program that calculates Body Mass Index (BMI) based on user input of weight and height, and then categorizes the BMI into underweight, normal, overweight, or obese categories using if-else statements.
*/

import java.util.Scanner;

public class CalculateBMI 
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

        double bmi = calculateBMI(weight, height);
        System.out.println("Your BMI is: " + bmi);

        categorizeBMI(bmi);
    }

    public static double calculateBMI(double weight, double height) 
	{
        double bmi = weight / (height * height);
        return bmi;
    }

    public static void categorizeBMI(double bmi) 
	{
        if (bmi < 18.5) 
		{
            System.out.println("You are underweight");
        } else if (bmi >= 18.5 && bmi < 25) 
		{
            System.out.println("You are normal weight");
        } else if (bmi >= 25 && bmi < 30) 
		{
            System.out.println("You are overweight");
        } else 
		{
            System.out.println("You are obese");
        }
    }
}



/*

OUTPUT

D:\Anudip Capgemini>java CalculateBMI
Enter your weight in kilograms: 8
Enter your height in meters: 3
Your BMI is: 0.8888888888888888
You are underweight


*/