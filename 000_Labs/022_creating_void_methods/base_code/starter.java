/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void toString (String tom){
		return;
	}
	public static void StringCombined (String holland){
		System.out.println(holland);
		return;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Write a sentence!");
		String sentence1 = sc.nextLine();
		toString(sentence1);
		System.out.println("Write another one!");
		String sentence2 = sc.nextLine();
		System.out.println("This is using meathods!!!!!");
		StringCombined(sentence1+" "+sentence2);
	



		
	}
}
