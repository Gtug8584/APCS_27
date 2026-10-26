/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class BankAccount {
	// -------GLOBAL VARIABLES-------
private String owner;
private int accountnumber;
private double balance;
private boolean isActive;
private static int nextAccountNumber= (int)(Math.random()*950)+50;

	// -------CONSTRUCTORS-------
	public BankAccount(){
		 owner = "unknown";
		 accountnumber=nextAccountNumber;
		 balance=0;
		 isActive=true;
		 nextAccountNumber=nextAccountNumber+1;

	}

	public BankAccount(String a){
		 owner = a;
		 accountnumber=nextAccountNumber;
		isActive=true;
		 balance=0;
		 nextAccountNumber = nextAccountNumber+1;
	}

	public BankAccount(String a, double b){
		 owner=a;
		 accountnumber=nextAccountNumber;
		 isActive=true;
		 balance=b;
		 nextAccountNumber=nextAccountNumber+1;

	}
	public void BankAccountToString(){
		System.out.println("Owner : "+owner);
		System.out.println("account number: "+accountnumber);
		System.out.println("status: "+isActive);
		System.out.println("balance: "+balance);

	}





	






	// -------METHODS-------

}