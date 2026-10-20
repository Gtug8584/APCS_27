/*
 *	Author:  
 *  Date: 
*/

import java.io.*;
import java.util.*;
import java.time.*;
import java.time.format.*;

class starter {
	static long startTime = 0;
	static ArrayList<String> arr = new ArrayList<String>();

	public static void main(String args[]) throws InterruptedException {
		System.out.print("welcome to typing game, it is currently ");
		getTime();
		System.out.println(" and we are ready to play");
		System.out.println("Give a sentence and type it fast");
		System.out.println("you can 1.Play random. 2.Play set. 3.Quit.");
		Scanner sc = new Scanner(System.in);
		int game = sc.nextInt();
		populateArrayList();
		String a =getSentence();
		if(game == 1){
			System.out.println("your sentence is: ");
			System.out.println(a);
			countdown();
			startTimer();
			sc = new Scanner(System.in);
			String b = sc.nextLine();

			System.out.println("Nice job, here are the results");
			System.out.print("Time: ");
			endTimer();
			System.out.print("Errors: ");
			compareSentences(a, b);
			lettersInSentence(a);


		}
		if(game == 2){
			System.out.println(" Selct the number of the sentence yoiu would like to play:");
			int selected = sc.nextInt();
			getSentence(selected);
			System.out.println("your sentence is: ");
			System.out.println(a);
			countdown();
			startTimer();
			sc = new Scanner(System.in);
			String b = sc.nextLine();

			System.out.println("Nice job, here are the results");
			System.out.print("Time: ");
			endTimer();
			System.out.print("Errors: ");
			compareSentences(a, b);
			lettersInSentence(a);
		}
		if(game==3){
			System.out.println("");
		}
		
	}

	// This method returns the local current time as a String
	public static String getTime(){
		LocalTime now = LocalTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("hh:mm:ss a");
        return now.format(format);
	}

	// This method starts a clock that can be used throughout the program
	public static void startTimer(){
		startTime = System.nanoTime();
	}

	// This method stops the timer clock and returns a double of the seconds and milliseconds of the stopwatch
	public static double endTimer() throws InterruptedException{
		long endTime = System.nanoTime();
		long timeSeconds = ((endTime - startTime)/1000000);
		double decSeconds = timeSeconds/1000.0;
		System.out.println(timeSeconds+decSeconds);
		return decSeconds;
	}

	// This method does a 3 second countdown and prints it to the terminal
	public static void countdown(){
		System.out.println("Starting countdown...");
		for (int i = 0; i < 3; i++) {
			System.out.println(3-i);
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		System.out.println("Go!");
	}

	// This method sets up a list of sentences to be called from. 
	// This should only be called once prior to getting sentences.
	private static void populateArrayList(){
		File f = new File("sentences.txt");
		try(Scanner fsc = new Scanner(f)){
			while(fsc.hasNextLine()){
				arr.add(fsc.nextLine());
			}
		}
		catch(FileNotFoundException e){
			System.err.println("File not found: " + e.getMessage());
		}
	}

	// This chooses 1 of the 100 sentences in the list to return.
	public static String getSentence(){
		populateArrayList();
		int rand = (int)(Math.random()*100);
		return arr.get(rand);
	}

	// This returns the same sentence for the same integer given.
	public static String getSentence(int index){
		populateArrayList();
		return arr.get(index%100);
	}

	//  This returns the number of letters, spaces, and punctuations in a sentence.
	public static int lettersInSentence(String sent){
		return sent.length();
	}
	
	// This returns the number of words in a sentence
	public static int wordsInSentence(String sent){
		int spaceCount = 0;
		while(sent.indexOf(" ") > -1){
			spaceCount++;
			sent = sent.substring(sent.indexOf(" ")+1);
		}
		return ++spaceCount;
	}

	// This method does a letter by letter comparison of each word and returns the number of errors.
	public static int compareSentences(String given, String typed){
		int errors = 0;
		while(given.length() > 0 && typed.length() > 0){
			if(!given.substring(0,1).equals(typed.substring(0,1)))
				errors++;
			given = given.substring(1);
			typed = typed.substring(1);
		}
		System.out.println(errors);
		return errors;
	}

}
