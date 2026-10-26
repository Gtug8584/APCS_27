/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import java.util.Scanner;

class starter {
    public static int getObject(){
        int rnjesus = (int)(Math.random()*3)+1;
        int comchoice=0;
        if(rnjesus==1){
            comchoice=1;
        }
        else if(rnjesus==2){
            comchoice=2;
        }
        else{
            comchoice=3;
        }
        return comchoice;
    }

    public static int compare2(){
        int result = 0;
        int player1choice=(int)(Math.random()*3)+1;
        int player2choice=(int)(Math.random()*3)+1;

            if(player1choice==1&&player2choice==2){
                result=2;
            }
            else if(player1choice==1&&player2choice==3){
                result=1;
            }
            else if(player1choice==2&&player2choice==1){
                result=1;
            }
            else if(player1choice==2&&player2choice==3){
                result=2;
            }
            else if(player1choice==3&&player2choice==1){
                result=2;
            }
            else if(player1choice==3&&player2choice==2){
                result=1;
            }
            return result;

    }
//rock is 1, paper is 2, scissors is 3
    public static void main(String[] args) {
        int rpc = 0;
        while(rpc!=10000){
        System.out.println("Would you like to play the com?(yes/no/done)");
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();
        
        
        if(choice.equalsIgnoreCase("yes")){
            System.out.println("Pleaase enter rock paper or scissors:");
            String ropasc = sc.nextLine();
            if (ropasc.equalsIgnoreCase("rock")){
                rpc=1;
            }
            else if(ropasc.equalsIgnoreCase("paper")){
                rpc=2;
            }
            else if (ropasc.equalsIgnoreCase("scissors")){
                rpc=3;
            }
            else{
                System.out.println("try again");
            }
            int compchoice = getObject();
            if(compchoice==rpc){
                System.out.println("You tied!");
            }
            else if(compchoice==1&&rpc==2){
                System.out.println("You win");
            }
            else if(compchoice==1&&rpc==3){
                System.out.println("You lose");
            }
            else if(compchoice==2&&rpc==1){
                System.out.println("You lose");
            }
            else if(compchoice==2&&rpc==3){
                System.out.println("You win");
            }
            else if(compchoice==3&&rpc==1){
                System.out.println("You win");
            }
            else if(compchoice==3&&rpc==2){
                System.out.println("You lose");
            }
        }
            String comvcom="";
            int timestie = 0;
            int times1win = 0;
            int times2win = 0;
        if(choice.equalsIgnoreCase("no")){
            System.out.println("How many times should the com play?");
            int timesplay = sc.nextInt();
            while(timesplay!=rpc){
            int onevone = compare2();
            
            if(onevone==0){
                comvcom="tie";
                timestie=timestie+1;
            }
            if(onevone==1){
                comvcom="Player1 wins";
                times1win= times1win+1;
            }
            if(onevone==2){
                comvcom="Player2 wins";
                times2win=times2win+1;
            }

            rpc=rpc+1;
            }
            System.out.println("Times 1 won: "+times1win);
            System.out.println("Times 2 won: "+times2win);
            System.out.println("Times tied: "+timestie);
        }
        if(choice.equalsIgnoreCase("done")){
            rpc=10000;
        }



        



        }
            
        }









    }

