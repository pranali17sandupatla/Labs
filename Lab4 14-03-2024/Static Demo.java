/*
2.Write a program to demonstrate static block take two static variables name and id and print them.
*/

class StaticBlockDemo
{
	static String name;//static variable
	static int id;
	
	static //static block initialize variables
	{
		name="Pranali";
		id=111;
	}
	public static void main(String args[])
	{
		System.out.println("Name :"+name);//printing values
		System.out.println("ID :"+id);
	}
}

/*
OUTPUT


D:\Anudip Capgemini>java StaticBlockDemo
Name :Pranali
ID :111
*/