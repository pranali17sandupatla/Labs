/*
3. Write a class with the name Perimeter using function overload that computes the perimeter of a square, a rectangle and a circle.

Formula:
Perimeter of a square = 4* s 

Perimeter of a rectangle = 2* (1 + b)

Perimeter of a circle = 2* (22/7)* r

*/

import java.util.Scanner;
class Perimeter
{
	void printData(int s)//creating method of square
	{
		int perimeter = 4* s;
		System.out.println("Perimeter Of a Square :"+ perimeter);
	}
	void printData(int l,int b)//creating method of rectangle
	{
		int perimeter = 2* (l + b);		
		System.out.println("Perimeter Of a Rectangle :"+perimeter);

	}
	void printData(double r)//creating method of circle
	{
		double perimeter = 2* (22/7)* r;
		System.out.println("Perimeter Of a Circle :"+perimeter);
	}
}
class PerimeterDemo
{
	public static void main(String args[])
	{
		Perimeter p=new Perimeter();//creating 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Choice :");// take user input
		
		int choice = sc.nextInt(); 
        switch (choice) //To user enter the choice 
		{
            case 1: // Square
                p.printData(2); // value side length 2
                break;
            case 2: // Rectangle
                p.printData(6, 8); // value length as 6 and breadth as 8
                break;
            case 3: // Circle
                p.printData(9.7); // value radius 9.7
                break;
            default:
                System.out.println("Invalid choice!");//if it is not choice
        }
    }
}


/*

OUTPUT

D:\Anudip Capgemini>javac PerimeterDemo.java

D:\Anudip Capgemini>java PerimeterDemo
Enter the Choice :
1
Perimeter Of a Square :8

D:\Anudip Capgemini>java PerimeterDemo
Enter the Choice :
3
Perimeter Of a Circle :58.199999999999996

D:\Anudip Capgemini>java PerimeterDemo
Enter the Choice :
2
Perimeter Of a Rectangle :28

*/