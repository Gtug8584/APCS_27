/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Dog max = new Dog("Max",4);
		Dog hannah=new Dog("Hannah","lab");
		boolean maxsleep=max.isSleeping();
		if(maxsleep==false){
			max.bark();
		}
		else if(maxsleep==true){
			System.out.println("The dog is asleep");
		}
		boolean hannahsleep=hannah.isSleeping();
		if((hannahsleep==true)&&(maxsleep==false)){
			hannah.bark();
		}
		if((hannahsleep==false)&&(maxsleep==false)){
			hannah.bark();
		}


	}
}
