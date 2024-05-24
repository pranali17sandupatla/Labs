/*
4. Create a base class with constructor and inherit it in the derived class and call the base class constructor in derived class.
*/

class Base
{
	// Constructor of the base class
	Base()
	{
		System.out.println("This is Base constructor ");
	}
	public void getbase()
	{
		System.out.println("This is Base class method ");
	}
}
// Derived class inheriting from Base class
class Derived extends Base
{
	Derived()// Constructor of the derived class
	{
		super();
		System.out.println("This is derived class constructor ");
	}
}
class Practical3
{
	public static void main(String args[])
	{
		// Creating an instance of the derived class
		Derived d=new Derived();
		d.getbase();
	}
}


/*

OUTPUT


D:\Anudip Capgemini>java Practical3

This is Base constructor
This is derived class constructor
This is Base class method

*/
