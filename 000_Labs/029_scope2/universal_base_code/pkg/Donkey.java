/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class Donkey {
	private String name;

	public Donkey() {
		name = "Donkey";
	}

	private String getName(){
		return name;
	}

	public void interact(Ogre shrek){
		System.out.println(shrek + ", parfaits may be the most delicious thing on the whole planet!");
		return;
	}



}
