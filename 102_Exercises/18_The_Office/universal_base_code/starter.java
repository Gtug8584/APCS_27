/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();



		Employee Dwight = new Employee(1987, "Dwight","Schrute", 4416.66);
		Dwight.raiseSalary(0);
		Dwight.employeeToString();
		

		Employee jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		jim.raiseSalary(30);
		jim.employeeToString();
		

		Employee pam = new Employee(2011, "Pam","SBeesly", 2250);
		pam.raiseSalary(1);
		pam.employeeToString();
		

		Employee tom = new Employee(1, "Tom","Holland", 500000);
		tom.raiseSalary(100);
		tom.employeeToString();
		
	}
}
