/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers to create a range for your random number");
		System.out.print("Please enter an integer: ");
		int num1= sc.nextInt();
		System.out.print("Please enter another integer (bigger than the first): ");
		int num2= sc.nextInt();
		System.out.println("Your range is "+num1+" to "+num2+".");
		System.out.println("Here are 5 numbers generated in that range. ");
		int range= (num2-num1);
		System.out.print( (int)(num1+Math.random()*range));
		System.out.print(", ");
		System.out.print( (int)(num1+Math.random()*range));
		System.out.print(", ");
		System.out.print( (int)(num1+Math.random()*range));
		System.out.print(", ");
		System.out.print( (int)(num1+Math.random()*range));
		System.out.print(", ");
		System.out.print( (int)(num1+Math.random()*range));
	}
}
