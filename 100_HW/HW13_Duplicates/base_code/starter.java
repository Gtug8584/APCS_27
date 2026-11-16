/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		int [] arr=new int[20];
		int x=0;
		int y=0;
		int z=0;
		int rnjesus=0;
		int target=(int)(Math.random()*10)+1;
		while(x<20){
			rnjesus=(int)(Math.random()*10)+1;
			arr[rnjesus]=rnjesus;
			System.out.println("the number is "+arr[rnjesus]);
			if(arr[rnjesus]==z){
				System.out.println(arr[rnjesus]+" is a duplicate at "+x+" and "+(x+1));
			}
			z=arr[rnjesus];
			if(arr[rnjesus]==target){
				y++;
				System.out.println(arr[rnjesus]+" at "+x+" is a target");
			}
			x++;
		}
		System.out.println(y+" total targets");


	}
}
