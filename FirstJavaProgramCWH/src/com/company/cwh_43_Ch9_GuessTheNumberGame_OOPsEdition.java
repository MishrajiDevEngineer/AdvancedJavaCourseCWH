package com.company;
import java.util.Scanner;
import java.util.Random;

class GuessTheNumberGame{
    private int luckyNumber;
    private int userGuess;
    boolean winner=false;
    int winnerRank = 0;
    int totalRound;


    public void setLuckyNumber(int ln){
        luckyNumber = ln;
    }

    /*
    public void getLuckyNumber(){
        System.out.println("The lucky number is: " + luckyNumber);
    }
    */


    public void isCorrectNumberSet(int ug){
        if(ug>0 && ug<=100){
            userGuess = ug;
            System.out.println("You Guess number is in between lucky number range,now guess as much Closer as you can");
        }
        else{
            System.out.println("You entered Wrong number,Please Enter the Valid Guess number between 1 and 100");
        }
    }
    public void getUserGuess(){
        System.out.println("\nLet's Compare it with Todays Lucky no. to see how close you are,\nYour Guess Number is:" + userGuess);
    }


    public boolean getwinnner(){
        return winner;
    }
    public void setRoundPlayed(int rp){
        totalRound = rp;
    }

    public void getRoundPlayed(){
        System.out.println("You have Guessed Correctly in " + totalRound + " Round of Game");
    }


    public void thisRoundResult(){
        int userBigger = userGuess - luckyNumber;
        //System.out.println(userBigger);
        int luckyBigger = luckyNumber - userGuess;
        //System.out.println(luckyBigger);

        if(userBigger>=0 && userBigger <=5 || luckyBigger>=0 && luckyBigger <=5){
            winner = true;
            winnerRank +=36;
            System.out.println("\nHurrah! You predict the Correct,could have difference of upto 5\nThat's okhey for a human with only 6round of gameplay ");
        }
        else if(userBigger > 5 && userBigger<=10 && luckyNumber > 50 || luckyBigger >5 && luckyBigger <=10 && luckyNumber > 50){
            winnerRank +=5;
            System.out.println("\nyou are so close to guess correct number toward upper range");
        }
        else if(userBigger>10 && userBigger <= 20 && luckyNumber>50 || luckyBigger>10 && luckyBigger <= 20 && luckyNumber>50){
            winnerRank +=4;
            System.out.println("\nyou are far to guess correct number toward upper range");
        }
        else if(userBigger>20 && userBigger <=35 && luckyNumber>50 || luckyBigger>20 && luckyBigger <=35 && luckyNumber>50){
            winnerRank +=3;
            System.out.println("\nyou are so far to guess the correct number toward upper range");
        }
        else if(userBigger>5 && userBigger<= 10 && luckyNumber < 50 ||luckyBigger>5 && luckyBigger <= 10 && luckyNumber < 50){
            winnerRank +=5;
            System.out.println("\nyou are so close to guess correct number toward lower range");
        }
        else if(userBigger>10 && userBigger <= 20 && luckyNumber<50 || luckyBigger>10 && luckyBigger <= 20 && luckyNumber<50){
            winnerRank +=4;
            System.out.println("\nyou are far to guess correct number toward lower range");
        }
        else if(userBigger>20 && userBigger <=35 && luckyNumber<50 || luckyBigger>20 && luckyBigger <=35 && luckyNumber<50){
            winnerRank +=3;
            System.out.println("\nyou are so far to guess the correct number toward lower range");
        }
        else{
            winnerRank +=2;
            System.out.println("\nYou are over far from guessing the lucky number");
        }
    }

    public void getFinalResult(){
        if(totalRound ==1){
            System.out.println("\nCongratulations! You are the top Guesser and your total point is: " + (7*2*winnerRank + 6));
        }
        else if(totalRound == 2){
            System.out.println("\nCongratulatiions! You Played very well and Your total point is: " + (6*winnerRank + 6));
        }
        else if(totalRound == 3){
            System.out.println("\nCongratulatiions! You Played very well and Your total point is: " + (5*winnerRank + 6));
        }
        else if(totalRound == 4){
            System.out.println("\nCongratulatiions! You Played very well and Your total point is: " + (4*winnerRank + 6));
        }
        else if(totalRound == 5){
            System.out.println("\nCongratulatiions! You Played very well and Your total point is: " + (3*winnerRank + 6));
        }
        else if(totalRound == 6){
            System.out.println("\nCongratulatiions! You Played very well and Your total point is: " + (2*winnerRank +6));
        }
        else{
            System.out.println("\nBetter Luck Next-Time, Please Come next Day to guess in a better Way.Your total point is: " + (winnerRank));
        }

    }
}

public class cwh_43_Ch9_GuessTheNumberGame_OOPsEdition {
    public static void main(String[] args) {
        GuessTheNumberGame mishraji = new GuessTheNumberGame();
        Scanner scan = new Scanner(System.in);
        Random luckypredict = new Random();

        int luckyNumberGenerated = luckypredict.nextInt(100) + 1;
        mishraji.setLuckyNumber(luckyNumberGenerated);
        //mishraji.getLuckyNumber();

        System.out.println("Let's Start 'Guess the Numebr Game', Let's see who guess the todays lucky no. in a fewer guesses");
        System.out.println("Also you have only 6-chance to guess the correct lucky no.,Those who guess the number in lowest round will win the game");

        int roundPlayed=0;
        for(int i=1; i <=6;i++){
            roundPlayed = i;
            System.out.format("\nLet's Begin the %d Round Now\n\t",i);
            System.out.println("Please Guess,Todays lucky no. between 1 to 100");
            int userEnter = scan.nextInt();
            mishraji.isCorrectNumberSet(userEnter);
            mishraji.getUserGuess();
            mishraji.thisRoundResult();

            if(mishraji.getwinnner()){
                System.out.println("\nYou Guessed the closest correct lucky number,Hence Game is over");
                break;
            }
        }
        mishraji.setRoundPlayed(roundPlayed);
        mishraji.getRoundPlayed();
        mishraji.getFinalResult();














        /*
        Create a Class GuessTheNumberGame, which allows a user to play "Guess the todays lucky  number"
        game once. Game should have the following methods:
        1. Constructor to generate the random number
        2. takeUserInput() to take a user Input of number
        3. isCorrectNumber() to detect whether the number entered by the user is true
        4. getter and setter for noOfGuesses
        Use proporties such as noOfGuesses(int), etc to get this task done!
        */

    }
}
