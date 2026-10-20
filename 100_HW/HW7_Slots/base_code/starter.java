/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		System.out.println("Slot machine stuff");
		System.out.println("start with $100, put in less that total money, 3 numbers from 1-10 will be rolled");
		System.out.println("if 2 numbers match, double inputed money, if 3, tripple, if none, lose money");
		int wealth=100;
		int ran1 = ((int)(Math.random()*10+1));
		int ran2 = ((int)(Math.random()*10+1));
		int ran3 = ((int)(Math.random()*10+1));
		Scanner sc=new Scanner(System.in);
		while(wealth>0){
		System.out.println("Do you want to play?(Say yes, or y)");
		String playornoplay = sc.nextLine();
		if(playornoplay.equalsIgnoreCase ("y")||playornoplay.equalsIgnoreCase ("yes")){
			System.out.println("You have $"+wealth+", how much to spend?");
			int spent =sc.nextInt();
			sc.nextLine();
			System.out.println("Great! your roles are:");
			System.out.print(ran1+", ");
			System.out.print(ran2+", and ");
			System.out.println(ran3);
			if(ran1==ran2||ran1==ran3||ran2==ran3){
				System.out.println("You got 2 that are the same, your money has been doubled!");
				wealth=wealth-spent;
				spent = spent*2;
				wealth=spent+wealth;
				System.out.println("You have "+wealth+" left");
				ran1 = ((int)(Math.random()*10+1));
			 	ran2 = ((int)(Math.random()*10+1));
		 		ran3 = ((int)(Math.random()*10+1));
			}
			else if(ran1==ran2&&ran2==ran3){
				System.out.println("You got 3 that are the same, your money has been tripled!");
				wealth=wealth-spent;
				spent = spent*3;
				wealth=spent+wealth;
				System.out.println("You have "+wealth+" left");
				ran1 = ((int)(Math.random()*10+1));
			 	ran2 = ((int)(Math.random()*10+1));
		 		ran3 = ((int)(Math.random()*10+1));
			}
			else if(ran1!=ran2||ran1!=ran2||ran2!=ran3){
				wealth=wealth-spent;
				System.out.println("You didnt get any matches, you have "+wealth+" left");
			}
		}
		else if(playornoplay.equalsIgnoreCase ("n")||playornoplay.equalsIgnoreCase ("no")){
			System.out.println("WHY????? 99% of gamblers quit before winning big!");
			break;
		}
		else{
			System.out.println("That is not an answer, try again");

		}



		}
	}
}

