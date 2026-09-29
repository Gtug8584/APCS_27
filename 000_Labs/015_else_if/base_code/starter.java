/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		System.out.println("Pick a number between 1 - 1000: ");
		int rnjesus = (int)(Math.random()*1000)+1;
		Scanner sc = new Scanner(System.in);
		int tom = sc.nextInt();
		sc.nextLine();
		if (tom<rnjesus){
			System.out.println("Your number was smaller than the number. The number was "+rnjesus);
		}
		else{
			System.out.println("Your number was bigger than the number. The number was "+rnjesus);
		}
		


	}
}
