package com.company;
import java.util.Scanner;
import java.util.Random;

class SmartRPSGame {
    private int playerChoice;
    private int computerChoice;
    private int totalWining = 0;
    private int totalLost = 0;

    public void setPlayerChoice(int pChoice) {
        playerChoice = pChoice;
    }

    public void getPlayerChoice() {
        String[] arr = {"Null", "Rock", "Paper", "Scissor"};
        if (playerChoice <= 3 && playerChoice > 0) {
            System.out.format("You choose: \"%s\",\nPlease wait for computer choice...", arr[playerChoice]);
        } else {
            System.out.println("Please Enter Valid Choice");
        }
    }

    public void setComputerChoice(int cChoice) {
        computerChoice = cChoice;
    }

    public void getComputerChoice() {
        String[] comp_arr = {"Rock", "Paper", "Scissor"};
        System.out.format("\nComputer Choice: \"%s\"\n", comp_arr[computerChoice]);
    }

    public void Gameplay(int i1) {
        if ((playerChoice == 1 && computerChoice == 2) || (playerChoice == 2 && computerChoice == 0) || (playerChoice == 3 && computerChoice == 1)) {
            System.out.println("Round " + i1 + " Result... \n\tCongratulation!,You win this Round Hurrah!\n");
            totalWining += 1;

        }
        else if ((playerChoice == 1 && computerChoice == 1) || (playerChoice == 2 && computerChoice == 2) || (playerChoice == 3 && computerChoice == 0)) {
            System.out.println("Round " + i1 + " Result... \n\toops!,You lost this Round\n");
            totalLost += 1;
        } else {
            System.out.println("Round " + i1 + " Result... \n\toh ho!This Round is Draw!\n");
        }
    }

    public void getFinalResult(){
        if(totalWining>totalLost){
            System.out.format("You win %d round and lost %d round out of 5\n\tBig Hurrah! You Won this Match",totalWining,totalLost);
        }
        else if(totalWining<totalLost){
            System.out.printf("You lost %d round and win only %d out of 5\n\tSorry! You Lost This Match, Better Luck Next-Time",totalLost,totalWining);
        }
        else{
            System.out.println("This Match is a Draw,Play Smartly Next-Time");
        }
    }
}
public class cwh_41_SmartRPS_Game {
    public static void main(String[] args) {
        SmartRPSGame rpsobj = new SmartRPSGame();
        Scanner scan = new Scanner(System.in);
        Random predict = new Random();


        System.out.println("\nWelcome to the Smart World of \"Rock,Paper,Scissor Classic Game\" 5-Continous Round of Game will decide the result\n.\n.");

        for(int i =1;i<=5;i++) {
            System.out.format("Round %d Begin Now...\n",i);
            System.out.println("\n\tPlease Enter your desired option\nChoose 1 for Rock,2 for Paper,3 for Scissor");
            int user_Choice = scan.nextInt();
            rpsobj.setPlayerChoice(user_Choice);
            rpsobj.getPlayerChoice();

            int smartChoice = predict.nextInt(3);
            rpsobj.setComputerChoice(smartChoice);
            rpsobj.getComputerChoice();
            rpsobj.Gameplay(i);
        }
        rpsobj.getFinalResult();
    }
}
