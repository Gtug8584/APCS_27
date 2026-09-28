/*
 *	Author:
 *  Date:
 * 	Collaborator:
*/

import java.util.Scanner;
class starter {
	public static void main(String args[]) {
		int rnjesus = (int) (Math.random()*2);
		Scanner sc = new Scanner(System.in);
		if(rnjesus==0){

		
		System.out.println("The goal of the game is to guess a word with two hints!");
		System.out.println("");
		System.out.println("Its a fruit!");
		System.out.print("What is your guess? ");

		String guess1 = sc.nextLine();
		if(guess1.equalsIgnoreCase("apple")){
		System.out.println("You got it!");
		}
		else{
		System.out.println ("Try again, it is red.");
		String guess2= sc.nextLine();
		if(guess2.equalsIgnoreCase("apple")){
		System.out.println("You got it!");
}
		else{
		System.out.println("It was apple, good luck next time!");
}
		}
		}
	
		if(rnjesus==1){

		
		System.out.println("The goal of the game is to guess a word with two hints!");
		System.out.println("");
		System.out.println("It's a planet in our solar system!");
		System.out.print("What is your guess? ");
		String otherguess1 = sc.nextLine();
		if(otherguess1.equalsIgnoreCase("earth")){
		System.out.println("You got it!");
		}
		else{
		System.out.println ("Try again, it's the only one with humans on it.");
		String otherguess2= sc.nextLine();
		if(otherguess2.equalsIgnoreCase("earth")){
		System.out.println("You got it!");
}
		else{
		System.out.println("It was earth, good luck next time!");
}
		}
		}
	

if(rnjesus==2){

		
		System.out.println("The goal of the game is to guess a word with two hints!");
		System.out.println("");
		System.out.println("Its a furry animal!");
		System.out.print("What is your guess? ");
		String otherotherguess1 = sc.nextLine();
		if(otherotherguess1.equalsIgnoreCase("cat")){
		System.out.println("You got it!");
		}
		else{
		System.out.println ("Try again, it is a feline friend.");
		String otherotherguess2= sc.nextLine();
		if(otherotherguess2.equalsIgnoreCase("cat")){
		System.out.println("You got it!");
}
		else{
		System.out.println("It was cat, good luck next time!");
}












	}
}
	}
}
		
		
	



