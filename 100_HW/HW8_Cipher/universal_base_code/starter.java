/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static void type1(String a){
		a= Cipher.encode(a);
		System.out.println(a);
	}
	public static void type2(String a, int b){
	
		a= Cipher.keyedEncode(a,b);
		System.out.println(a);
		
	}
	public static void userdecripter(String a){
		a=Cipher.encode(a);
		System.out.println(a);
	}
	
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		String b = sc.nextLine();
		type1(b);
		String c = sc.nextLine();
		type1(c);
		String d = sc.nextLine();
		type1(d);
		String e = sc.nextLine();
		int j = sc.nextInt();
		sc.nextLine();
		type2(e,j);
		String f = sc.nextLine();
		type1(f);
		String g = sc.nextLine();
		int k = sc.nextInt();
		sc.nextLine();
		type2(g,k);
		String h = sc.nextLine();
		int l = sc.nextInt();
		sc.nextLine();
		type2(h,l);
		String i = sc.nextLine();
		type1(i);

		System.out.println("Now put in a normal sentence to have incrpted(like star wars messages)");
		String x = sc.nextLine();
		userdecripter(x);




	}
}
