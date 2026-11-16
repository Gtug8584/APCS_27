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
		int [] arr= new int[1000];
		int rnjesus=0;
		for(int x=0;x<1000;x++){
			rnjesus=(int)(Math.random()*100)+1;
			arr[rnjesus]=rnjesus;
			System.out.println(arr[rnjesus]);
		}


		
	}
}
