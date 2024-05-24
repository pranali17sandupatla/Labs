/*
2. Create a program with a logic that throws the ArrayIndexOutOfBoundsException while accessing 
elements in an array.

[Hint: Use array and loop and try to access the element beyond the last index]

*/

package com.threading;

public class Practical4Throw {

	public static void main(String[] args) 
	{
		//access an element outside bounds of the array
		int[] arr= {1,2,3,4,5};	//array element
		try {
			int index =arr.length+1;	// accessing index out of bounds

			System.out.println("Value at Index :"+ index +":"+ arr[index]);
		}
		catch(ArrayIndexOutOfBoundsException e) 
		{
			System.out.println(" ArrayIndexOutOfBoundsException handle");
			//handle the exception of array index out of bound
		}
	}
}

/*
OUTPUT :

 ArrayIndexOutOfBoundsException handle
*/