/*
4. Create a class named Car with attributes make, model, year, and color. Include a method start() that prints "Car started" and a method stop() that prints "Car stopped"
*/

class Car
{
	String model;//Attributes of car
	int year;
	String color;
	
	Car(String model, int year, String color)//Parameterized constructor
	{
        this.model = model;
        this.year = year;
        this.color = color;
	}
	void start()//start method of class car
	{
		this.model = model;
        this.year = year;
        this.color = color;
		System.out.println("Car started");//printing output
		System.out.println("Model :"+this.model+" Year :"+this.year+" Color :"+this.color);
		
	}	
	void stop()//stop method of class car
	{
		System.out.println("Car stopped");//printing output
	}
}
class CarDemo
{
	public static void main(String args[])
	{
		Car c1=new Car("Maruti Suzuki",2024,"Black");//printing values of start method
		c1.start();//calling start method
		c1.stop();//calling stop method
	}
}


/*

OUTPUT
D:\Anudip Capgemini>java CarDemo
Car started
Car stopped

D:\Anudip Capgemini>javac CarDemo.java

D:\Anudip Capgemini>java CarDemo
Car started
Model :Maruti Suzuki Year :2024 Color :Black
Car stopped

*/