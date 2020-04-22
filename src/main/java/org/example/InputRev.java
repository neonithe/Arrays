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
        for(int i=0; i < array.length/2; i++) {
            int reverse = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = reverse;
        }
        for (int i=0; i< array.length; i++){
            System.out.println("Number "+(i+1)+" : ");
            System.out.println(array[i]+"\n");
        }
        /*
        Först betsämma hur många element det ska vara array[5]
        Sedan lägg till värde för varje element array[0] = {1} array[1] = {2} osv
        Sedan lägg om dem så sista värdet kommer först array[0] = array[1]
        Sedan skriv ut listan
        */
    }
}
