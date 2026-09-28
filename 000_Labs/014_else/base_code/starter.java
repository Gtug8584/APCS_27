/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
Scanner sc = new Scanner (System.in);
		System.out.print("Pick a random number between 1 - 1000: ");
		int number = sc.nextInt();
		int luck = (int)(Math.random ()*1000);
		if (luck==number){
			System.out.println("YOU GOT IT!!!!!!!!!!!!!!!!");
		}
		else{
			System.out.println("You got it wrong, it was "+luck+ " did you know that 99% of gamblers quit before winning big");
		}
	}
}