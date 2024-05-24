//3.Write a program using TreeSet insert Integer values and print them.
package com.Lab7;

import java.util.TreeSet;

public class TreeSetLab7 {

	public static void main(String[] args)
	{
		TreeSet<Integer> ts = new TreeSet<>();

		// Inserting integer values
		ts.add(10);
		ts.add(20);
		ts.add(50);
		ts.add(30);
		ts.add(70);
		ts.add(100);

        System.out.println("Integer values in TreeSet: " + ts);
	}

}
/*
OUTPUT :

Integer values in TreeSet: [10, 20, 30, 50, 70, 100]
*/