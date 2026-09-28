/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		System.out.println("Welcome to the Fortune Cookie Grnerator!");
		System.out.println("");
		int gr= (int)(Math.random ()*10);
		if (gr==0){
			System.out.println("Mr. Poole approves");
		}
		if (gr==1){
			System.out.println("Make it happen");
		}
		if (gr==2){
			System.out.println("You are selling");
		}
		if (gr==3){
			System.out.println("You will not succeed");
		}
		if (gr==4){
			System.out.println("You will fail your next test");
		}
		if (gr==5){
			System.out.println("Mr. Poole does not approve");
		}
		if (gr==6){
			System.out.println("You will forget all of the english language");
		}
		if (gr==7){
			System.out.println("Your BMI will be over 100");
		}
		if (gr==8){
			System.out.println("You will fall in love with a litteral potato");
		}
		if (gr==9){
			System.out.println("You will have gamer posture");
		}
		
	}
}
