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
		int c=(int)(Math.random()*150)+51;
		int [] arr=new int[c];
		int min= 200;
		int max=51;
		int rnjesus=0;
		int x=0;
		int a=0;
		
		while(x<1000){
			arr[rnjesus]=(int)(Math.random()*100)+1;
			if(min>arr[rnjesus]){
				min=arr[rnjesus];
			}
			if(max<arr[rnjesus]){
				max=arr[rnjesus];
			}
			a=a+arr[rnjesus];

			x++;
		}
		a=a/x;
		System.out.println("the size is "+c+" the min is "+min+" the max is "+max+" the average is "+a);

		
	}
}
