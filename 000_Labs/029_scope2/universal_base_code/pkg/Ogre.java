/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class Ogre {
	public String name;

	public Ogre() {
		name = "Shrek";
		boolean ugly = true;
	}

	public String getName(){
		return name;
	}

	public boolean isUgly(boolean a){
		return a;
	}

	public void interact(Donkey donkey){
		System.out.println(donkey + ", what are you doing in my swamp?!");
		return;
	}


}
