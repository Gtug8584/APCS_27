/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		System.out.print("A number between 0 - 9: ");
	System.out.println( (int)(Math.random()*9) );
		System.out.print("A number between 1 - 100: ");
	System.out.println( (int)(Math.random()*100+1));
		System.out.print("A number between 2.5 and 3.5: ");
	System.out.println( 2.5+Math.random()*1);
		System.out.print("A double between 14 and 589: ");
	System.out.println( 14+Math.random()*575);
}
}