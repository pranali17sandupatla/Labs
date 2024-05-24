/*
 Lab6
2. write a program in Java to create a Map Interface where we can store the cricketer name in it
along with his scores and search for the batsman name and display his score.
*/
package com.ArrayList;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapInterfaceLab6 {

	public static void main(String[] args) 
	{
		Map<String, Integer> cs = new HashMap<>();
        
        // Populate the Map with sample data
        cs.put("Sachin Tendulkar", 100);
        cs.put("Virat Kohli", 120);
        cs.put("Rohit Sharma", 90);
        cs.put("MS Dhoni", 70);
       // System.out.println(cs);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the batsman name: ");
        String batsmanName = sc.nextLine();
        
     // Check if the batsman name
        if (cs.containsKey(batsmanName)) 
        {
        	int score = cs.get(batsmanName);
            System.out.println("Score of " + batsmanName + ": " + score);
        } else 
        {
            // If the batsman name doesn't exist, display a message
            System.out.println("Batsman not found!");
        } 

	}
}

/*
OUTPUT :
	
	Enter the batsman name: MS Dhoni
	Score of MS Dhoni: 70
	
	Enter the batsman name: Hardik Pandya
	Batsman not found!
*/