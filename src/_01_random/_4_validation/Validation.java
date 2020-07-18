//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		for (int i=0; i<=10; i++) {
			
		int randomChoice = randomMaker.nextInt(5);
		
		if (randomChoice == 0) {
			System.out.println("You did well");
		} else if (randomChoice == 1) {
			System.out.println("Great Job!");
		} else if (randomChoice == 2) {
			System.out.println("Thank you!");
		} else if (randomChoice == 3) {
			System.out.println("YES!");
		} else if (randomChoice == 4) {
			System.out.println("Congradulations!");
		}
		
		}
		

		// 1. Use each value of randomNumber to give the user a random compliment.

		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
