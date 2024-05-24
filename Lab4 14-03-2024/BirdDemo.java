/*
Practical 3

1 . Define interfaces "Flyable" and "Swimmable with methods fly() and swim() respectively. Implement these interfaces in a class 'Bird" to demonstrate multiple interface implementation.
*/

interface Flyable
{
	void fly();//creating method of flyable interface
}
interface Swimmable
{
	void swim();//creating method of swimmable interface
}
class Bird implements Flyable, Swimmable
{
	public void fly()//calling method of interface
	{
		System.out.println("This the Flyable class method");
	}
	public void swim()//creating method of swimmable interface
	{
		System.out.println("This is the method of swimmable class");
	}
}
class BirdDemo
{
	public static void main(String args[])
	{
		Bird b=new Bird();//creating object of bird class
		b.fly();//calling fly method
		b.swim();//calling swim method
	}
}



/*

OUTPUT


D:\Anudip Capgemini>java BirdDemo
This the Flyable class method
This is the method of swimmable class

*/