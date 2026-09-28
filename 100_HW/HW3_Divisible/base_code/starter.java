/*
 *	Author:
 *  Date:
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Please enter an integer: ");
		int number1=sc.nextInt();
		String jhg=sc.nextLine();
		System.out.print("Please enter another integer: ");
		int number2=sc.nextInt();
		String df=sc.nextLine();
		
		if(number1%2==0){
			System.out.println(number1+" is divisible by 2!");
		}
		if(number1%3==0){
			System.out.println(number1+" is divisible by 3!");
		}
		if(number1%4==0){
			System.out.println(number1+" is divisible by 4!");
		}
		if(number1%5==0){
			System.out.println(number1+" is divisible by 5!");
		}
		if(number2%2==0){
			System.out.println(number2+" is divisible by 2!");
		}
		if(number2%3==0){
			System.out.println(number2+" is divisible by 3!");
		}
		if(number2%4==0){
			System.out.println(number2+" is divisible by 4!");
		}
		if(number2%5==0){
			System.out.println(number2+" is divisible by 5!");
		}


	}
}
