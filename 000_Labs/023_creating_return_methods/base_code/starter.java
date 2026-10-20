/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static int pow(int x,int y){
		int times = 0;
		int a =1;
		while(times!=y){
			a *= x;
			times=times+1;
		}
		System.out.println(a);
		return a;
		}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type in an integer");
		int num1 = sc.nextInt();
		System.out.println("Type in an integer");
		int num2 = sc.nextInt();
		pow(num1,num2);


		
	}
}
