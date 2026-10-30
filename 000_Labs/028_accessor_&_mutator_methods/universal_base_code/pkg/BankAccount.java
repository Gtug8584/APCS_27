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
	
	public void displayAccountInfo(){
		System.out.println("Owner : "+owner);
		System.out.println("account number: "+accountnumber);
		System.out.println("status: "+isActive);
		System.out.println("balance: "+balance);

	}
	public void checkBalance(){
			System.out.println("balance: "+balance);
	}
	public String getOwner(){
		return owner;
	}
	public String setOwner(String a){
		owner=a;
		return owner;
	}
	public double getBalance(){
		return balance;
	}
	public boolean closeAccount(){
		isActive=false;
		return isActive;
	}
	public double deposit(double a){
		if(isActive==true){
			balance=a+balance;
			
		}
	return balance;
	}
	public void withdraw(double a){
		if(isActive==true&&a<balance){
			balance=balance-a;
		}
		
	}





}