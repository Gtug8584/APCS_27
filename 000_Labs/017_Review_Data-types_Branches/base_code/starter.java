/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		System.out.println("What is your name?");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("What is your title? Ex: Pro skedaddler");
		String title = sc.nextLine();

		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
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
		System.out.println("You have 20 kill ponts to spend in the following: Strength, Dexterity, Intelligence, and Charisma. Spend them wisley");
		System.out.println("Strength (1-10):");
		int strength = sc.nextInt();
		sc.nextLine();
		if (strength>10){
			System.out.println("please input a smaller value.");
			strength = sc.nextInt();
		}
		int total = (20-strength);
		System.out.println("You have "+(total)+" left to spend");
		

		
		System.out.println("Dexterity (1-10):");
		int dexterity = sc.nextInt();
		if (dexterity>total){
			System.out.println("please input a smaller value.");
			dexterity = sc.nextInt();
		}
			total= (total-dexterity);
		System.out.println("You have "+(total)+" left to spend");
		
		System.out.println("Intellegence (1-10):");
		int intellegece = sc.nextInt();
		if (intellegece>total){
			System.out.println("please input a smaller value.");
			intellegece = sc.nextInt();
		}
			total= (total-intellegece);
		System.out.println("You have "+(total)+" left to spend");

		System.out.println("Charisma (1-10):");
		int charisma = sc.nextInt();
		if (charisma>total){
			System.out.println("please input a smaller value.");
			charisma = sc.nextInt();
		}
			total= (total-charisma);
		System.out.println("You have "+(total)+" left for next time");
		System.out.println("You are "+name+", the "+title+" of CVHS");
		System.out.println("Youre a "+choice+" with the following stats!");
		System.out.println(" Strength - "+strength);
		System.out.println("Dexterity - "+dexterity);
		System.out.println("Intelligence - "+intellegece);
		System.out.println("Charisma - "+charisma);
		System.out.println("Goof luck on your quest "+name+"!");
	}
}
