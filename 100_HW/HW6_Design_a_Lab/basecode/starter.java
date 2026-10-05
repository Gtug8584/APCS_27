/*
 *	Author:
 *  Date:
 * 	Collaborator:
 */

import java.util.*;
import java.util.Scanner;
public class starter {
    public static void main(String[] args) {
        System.out.println("Welcome to the Poole quiz");
        System.out.println("What is the best sub system of robotics?");
        Scanner sc = new Scanner(System.in);
        String sub = sc.nextLine();
        if(sub.equalsIgnoreCase("infrastructure")){
            System.out.println("Congrats, you are so right!");
            System.out.println("Now for the next thing, would you rather be a freshy all over again or be a sophomore and have sophomore slump?");
            String year = sc.nextLine();
            if(year.equalsIgnoreCase("freshy")){
                System.out.println("Being a freshy is great");
                System.out.println("Time fo the last thing! What is the number?(1-1000)");
                int rnjesus = (int)(Math.random()*1000+1);
                int num = sc.nextInt();
                if(num==rnjesus){
                    System.out.println("You are actually blessed, how did you do that?!?!?!?!?!?!");
                    System.out.println("I guess you can just win now");
                }
                else{
                    System.out.println("You should try again, 99% of gamblers quit before winning big!");
                    System.out.println("I'll still give you a chance to come back");
                    System.out.println("What is objectivley the best number in the world hint:(think about grades)");
                    int bestnum = sc.nextInt();
                    if(bestnum>=90){
                        System.out.println("You are correct, get an A on all of your tests!!!!");
                    }
                    else{
                        System.out.println(" Im so sorry but you failed this test, try one more time");
                    }
                }
            }
            else{
                System.out.println("Grades matter!!!!!!");
            }
        }
        else{
            System.out.println("You are so terribly wrong, join the light side!");
        }
        
    }
}
