package com.company;

public class cwh_28_Ch6_MultiDimensionArrays {
    public static void main(String[] args) {

        int [] marks; // 1-D Array
        int [][] flats; // 2-D Arrays
        flats = new int[2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;

        // Displaying the 2-D Array ( uisng for loop )
        // Note: flats.length provides length of flat, flat.length = no. of rows-Array
        // Note: flat[i].length mean for each row length it runs for no. of coloumn i.e int [][] building = new int [1][2];
        // for buildings[0] = provides no. of coloums for row =0 and builidin[1] = provides no. of coloums for row = 1
        for(int i = 0; i<flats.length; i++){
            for(int j = 0; j<flats[i].length; j++){
                System.out.print(flats[i][j] + " ");
            }
            System.out.println();
        }

        // Similary 3-D Arrays also can be created
        String[][][] multiDimensionalFlat = new String[2][3][4];

    }
}