/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		int rnjesus = (int)(Math.random()*1000)+1;
		Scanner sc = new Scanner (System.in);
		System.out.println("put in a number(1-1000)");
		int num = sc.nextInt();
		while(num!=rnjesus){
			System.out.println("Try again, you were "+(rnjesus-num)+"away");
			rnjesus = (int)(Math.random()*1000)+1;
		}
		if(num==rnjesus){
			System.out.println("Finally!");
		}

		
	}
}
