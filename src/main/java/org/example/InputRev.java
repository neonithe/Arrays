package org.example;

import java.util.Scanner;

public class InputRev {

    private static Scanner numObj = new Scanner(System.in);

    public static void main(String[] args){

        System.out.print("How many numbers do wish to add to the list? :");
        int amount = numObj.nextInt();

        int[] array = new int[amount];
        for (int i=0; i < array.length; i++){
            System.out.print("Nr " +(i+1)+" : ");
             array[i] = numObj.nextInt();
        }

    }

    public static int inputFunction(){
        return int input = numObj.nextInt();
    }

    public static int arrangeList(){

    }
}
