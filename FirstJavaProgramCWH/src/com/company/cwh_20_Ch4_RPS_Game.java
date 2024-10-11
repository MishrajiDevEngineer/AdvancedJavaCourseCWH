package com.company;
import java.util.Scanner;

public class cwh_20_Ch4_RPS_Game {
    public static void main(String[] args) {
        // Let compute always chooses paper in this game
        String Rock = "rock";
        String Paper = "paper";
        String Scissor = "scissor";

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Your Choice from below given choices");
        System.out.println("Enter any option provided, options are: Rock,Paper,Scissor");
        String userstring = sc.next().toLowerCase();

        if (userstring.equals(Rock)){
            System.out.println("Computer chooses Paper, You have lost this Game");
        }
        else if(userstring.equals(Paper)) {
            System.out.println("Computer chooses Paper, This is a draw");
        }
        else if (userstring.equals(Scissor)){
            System.out.println("Computer chooses Paper, You have won the game successfully! Hurrah! ");
        }
    }
}
