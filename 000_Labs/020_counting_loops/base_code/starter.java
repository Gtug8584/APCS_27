/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String name = sc.nextLine();
		System.out.print("Please enter num of times you want it printed: ");
		int timesprint = sc.nextInt();
		int c = 0;
		while (true){
			
			if(c==timesprint){
				break;
			}
			System.out.println(name);
			c=c+1;
		}



		
	}
}
