/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
		Scanner sc = new Scanner(System.in);
		String choice = sc.nextLine();
		if (choice.equalsIgnoreCase("rogue")){
			System.out.println("Youve chosen the Rogue! How cunning!");
		}
		else if(choice.equalsIgnoreCase("wizard")){
			System.out.println("Youve chosen the wizard! Excelior!");
		}
		else if(choice.equalsIgnoreCase("warrior")){
			System.out.println("Youve chosen the warrior! for honor!");
		}
		else{
			System.out.println("youve decided not to chose a role. rerun the program");
		}


	}
}
