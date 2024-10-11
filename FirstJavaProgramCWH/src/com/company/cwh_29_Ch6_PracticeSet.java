package com.company;

public class cwh_29_Ch6_PracticeSet {
    public static void main(String[] args) {

        // 1. create array of 5 floats and calculate their sum
        float [] marks = {22.5f, 33.5f, 44.5f, 77.5f, 88.5f, 99.5f};
        float sum = 0;
        for(float element: marks){
            sum = sum + element;
        }
        System.out.println("The sum of each element of marks-Array is " + sum);


        //2. program to find out that given integer is present in an array or not
        float num = 9f;
        boolean isInArray = false;
        for(int i = 0; i < marks.length;i++) {
            if (num == marks[i]) {
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("The value is present in the array");
        }else {
            System.out.println("The value is not present int the array");
        }


        //3. program to find average of physics subject marks using (each loop)
        float physicssum = 0;
        for(float element: marks){
            physicssum = physicssum + element;
        }
        System.out.println("The length of marks array is " + marks.length);
        System.out.println("The Average of physics marks is " + physicssum/marks.length);



        // 4. program to add two matrices of size 2*3
        int [][] mat1 = {{1, 2, 3},
                {4, 5, 6}};

        int [][] mat2 = {{2, 4, 6},
                {3, 4, 2}};

        int [][] result = {{0, 0 , 0},
                {0, 0, 0}};

        System.out.println("\n");  // for additonal line for clear view

        // Checking the matrix format for correct matrix addition
        System.out.println("Checking the matrix format for correct matrix additon");
        for(int i=0; i<mat1.length; i++){ // run row no. of times
            for(int j=0; j<mat1[i].length; j++){ // run coloumn no. of times
                System.out.format("Setting value for i=%d and j=%d\n",i,j);
            }
        }


        // Actual code:
        System.out.println("\n" + "Additon of two matrix mat1 + mat2");
        for(int i=0; i<mat1.length; i++){
            for(int j=0; j<mat1[i].length; j++){
                result[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        //5. Reverse the values of given Array
        int [] arr = {1, 3, 4, 5, 8, 9};
        int l = arr.length;
        int greatestInteger = Math.floorDiv(l , 2); //gratestInteger means taking values just before any decimal
        int temp;

        for(int i = 0; i < greatestInteger; i++){
            temp = arr[i];
            arr[i] = arr[l - i - 1];
            arr[l - i -1] = temp;
        }
        System.out.print("The revers of an array will be ");
        for(int element: arr){
            System.out.print(element + " ");
        }

        // 6. Program to find the max. element value in an array
        System.out.println("\n"); // new line for better view

        int [] maxarr = {34, 66, 88, 45, 104, 49,99,};
        for(int i = 1; i < maxarr.length; i++){
            if(maxarr[0] < maxarr[i]){
                maxarr[0] = maxarr[i];
            }
        }
        System.out.println("The max-value of an element in the arry is " + maxarr[0]);

        // 6. Another way to find the max. element value in an arry
        int max = 0;
        for(int element: maxarr){
            if(max < element){
                max = element;
            }
        }
        System.out.println("The max-value using each loop method will be " + max);


        // 6. Another way to find the min. element value in an arry
        int [] minarr = {34, 66, 88, 45, 104, 49,99,};
        int min = Integer.MAX_VALUE;
        for(int element: minarr){
            if(min > element){
                min = element;
            }
        }
        System.out.println("The min-value using each loop method will be " + min);


        // 7. Program to find out whether an array is sorted or not
        int [] nonSortedArray = {393, 323, 432, 222, 444, 111, 665,786};
        boolean isSortedArr = true;
        for(int i = 0; i< nonSortedArray.length - 1; i++){
            if(nonSortedArray[i]> nonSortedArray[i+1]){
                isSortedArr = false;
                break;
            }
        }
        if(isSortedArr){
            System.out.println("This Array is Sorted");
        }
        else{
            System.out.println("This Array is not Sorted");
        }
    }
}
