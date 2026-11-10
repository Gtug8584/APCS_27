/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;


class starter {
	public static boolean checkPrime(int x){
		int a=x-1;
		while(a>=2){
			if(x%a==0){
				return false;
			}
			a=a-1;
		}
			return true;
		
	}
	public static void printPrimes(int a){
		int count = 2;
		while(count<=a){
			if(checkPrime(count)){
				System.out.println(count + " is a prime number.");
			}
		count++;
		}
		return;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input a number and ill print out primes until there.");
		int a=sc.nextInt();
		sc.nextLine();
		printPrimes(a);

	}
}
