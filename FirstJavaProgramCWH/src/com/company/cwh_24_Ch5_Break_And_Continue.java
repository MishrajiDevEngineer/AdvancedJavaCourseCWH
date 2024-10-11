package com.company;

public class cwh_24_Ch5_Break_And_Continue {
    public static void main(String[] args){
        //Break using forLoop
        for(int i = 1; i<5; i++){
            System.out.println(i);
            System.out.println("forLoop is great");
            if(i==2){
                System.out.println("Ending for loop due to break condition");
                break;
            }
        }
        System.out.println("\n"); //printing new line for readability



        //Break using while loop
        int j =1;
        while(j<5){
            System.out.println(j);
            System.out.println("whileLoop is great");
            if(j==2){
                System.out.println("while loop ends here due to break condition");
                break;
            }
            j++;
        }
        System.out.println("\n"); //new line for readability



        //Break using doWhile loop
        int k =1;
        do {
            System.out.println(k);
            System.out.println("doWhile is great");
            if(k==2){
                System.out.println("doWhile Loop ending due to break condition");
                break;
            }
            k++;
        }while(k<5);
        System.out.println("\n"); //new line for readability



        //continue using forLoop
        for(int l = 1; l<4; l++) {
            if (l == 2) {
                System.out.println("skipping for loop for l==2, due to continue condition");
                continue;
            }
            System.out.println(l);
            System.out.println("forLoop is great");
        }
        System.out.println("\n"); //new line for readability


        // continue using doWhile Loop
        int m=0;
        do{
            m++;
            if(m==2){
                System.out.println("Skipping doWhile Loop for l==2 due to 'continue' condition");
                continue;
            }
            System.out.println(m);
            System.out.println("doWhile Loop is great");
        }while(m<4);
    }
}
