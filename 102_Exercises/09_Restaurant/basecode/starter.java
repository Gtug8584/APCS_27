/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	System.out.println("===========================================");
	System.out.println("         WELCOME RESTURANT OWNER!          ");
	System.out.println("===========================================");
	Scanner sc = new Scanner (System.in);
	System.out.print ("What's the name of your restautant? ");
	String resturant=sc.nextLine();
	System.out.print("What's your name? ");
	String name=sc.nextLine();
	System.out.println("Great to see you, "+name+"! Let's set up a menu for "+resturant+"!");
	System.out.println("Tonight's menue has room for eaxactly 3 items. Let's go!");
	System.out.println("");
	System.out.println("--- Item #1 ---");
	System.out.print("Item name: ");
	String Item1=sc.nextLine();
	System.out.print("Price of "+Item1+ "($)");
	double price1=sc.nextDouble();
	sc.nextLine();
	System.out.print("How many of "+Item1+" would you like?");
	int item1amount=sc.nextInt();
	sc.nextLine();
	System.out.println("Added "+item1amount+"x "+Item1+" to your order! ($"+(item1amount*price1)+(")"));

	System.out.println("--- Item #2 ---");
	System.out.print("Item name: ");
	String Item2=sc.nextLine();
	System.out.print("Price of "+Item2+ "($)");
	double price2=sc.nextDouble();
	sc.nextLine();
	System.out.print("How many of "+Item2+" would you like?");
	int item2amount=sc.nextInt();
	sc.nextLine();
	System.out.println("Added "+item2amount+"x "+Item2+" to your order! ($"+(item2amount*price2)+(")"));

	System.out.println("--- Item #3 ---");
	System.out.print("Item name: ");
	String Item3=sc.nextLine();
	System.out.print("Price of "+Item3+ "($)");
	double price3=sc.nextDouble();
	sc.nextLine();
	System.out.print("How many of "+Item3+" would you like?");
	int item3amount=sc.nextInt();
	sc.nextLine();
	System.out.println("Added "+item3amount+"x "+Item3+" to your order! ($"+(item3amount*price3)+(")"));

	System.out.println("Nice choices! What tip percentage would you like to leave? (ex: 15, 18, 20):");
	double tip=sc.nextDouble();
	double percent=(tip/100);

	System.out.println("===========================================");
	System.out.println(("      ")+resturant+(" - Menue For Today      "));
	System.out.println("Owner : "+name);
	System.out.println("-------------------------------------------");
	System.out.println("Item          Qty          Price           ");
	System.out.println(Item1+"         "+item1amount+"         "+(price1*item1amount));
	System.out.println(Item2+"          "+item2amount+"         "+(price2*item2amount));
	System.out.println(Item3+"          "+item3amount+"         "+(price3*item3amount));
	System.out.println("-------------------------------------------");
	double total=((item1amount*price1)+(item2amount*price2)+(item3amount*price3));
	System.out.println("Subtotal:                    "+((item1amount*price1)+(item2amount*price2)+(item3amount*price3)));
	System.out.println("Tax (9.75%):                 "+(total/(9.75)));
	System.out.println("Tip:                         "+tip);
	System.out.println("Tip Amount:                  "+(percent*total));
	System.out.println("===========================================");
	System.out.println("TOTAL:                      $"+(total+(percent*total)+(total/(9.75))));
	System.out.println("===========================================");
	System.out.println("");
	System.out.println("Thanks for eating at "+name+("!"));
	System.out.println("Come back soon -- we'll always have a byte for you!");
	}
}
