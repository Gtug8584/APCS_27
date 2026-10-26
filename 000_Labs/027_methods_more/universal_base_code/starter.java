/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		System.out.println("Were making an account whats ur info?");
		System.out.println("1=nothing");
		System.out.println("2=owner");
		System.out.println("3=owner and deposit");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		sc.nextLine();
		if(choice==1){
			BankAccount x = new BankAccount();
			BankAccount d = new displayAccountInfo();
			
		}
		if(choice==2){
			System.out.println("What is the owner's name?");
			String ownername = sc.nextLine();
			BankAccount y = new BankAccount(ownername);
			System.out.println("Account info:");
			BankAccount c = new displayAccountInfo();
			
		}
		if(choice==3){
			System.out.println("What is the owner's name?");
			String ownername = sc.nextLine();
			System.out.println("How much is the deposit?");
			double initialdeposit = sc.nextInt();
			BankAccount z = new BankAccount(ownername,initialdeposit);
			System.out.println("Account info:");
			BankAccount b = new displayAccountInfo();
			
		}
		System.out.println("Would you like to check the balance(yes/no)");
		String balcheck = sc.nextLine();
		if(balcheck=="yes"){
			BankAccount a =new checkBalance();
		}
		else{
			System.out.println("no prob");
		}
	}
}
