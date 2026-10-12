/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		System.out.println("Pick a number between 1 - 1000: ");
		int rnjesus = (int)(Math.random()*1000)+1;
		Scanner sc = new Scanner(System.in);
		int tom = sc.nextInt();
		sc.nextLine();
		while(rnjesus!=tom){
		if (tom<rnjesus){
			System.out.println("Your number was smaller than the number. ");
		}
		else{
			System.out.println("Your number was bigger than the number.");
		}
		tom = sc.nextInt();
		}
		System.out.println("You got it!");



		
	}
}
