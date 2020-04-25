package org.example;

import java.util.Arrays;

public class Tests {

    public static void main(String[] args) {
    /*Write a program which will remove the duplicate elements of a given
    array [20, 20, 40, 20, 30, 40, 50, 60, 50].
    Expected output: Array: 20 20 40 20 30 40 50 60 50
    Array without duplicate values: 20 40 30 50 60*/

        int[] array = {20, 20, 40, 20, 30, 40, 50, 60, 50};
        //20,20,20,30,40,40,50,50,60
            Arrays.sort(array);
        int arrayLength = array.length;
        int a =0;
        if (arrayLength == 0 || arrayLength == 1){
            a =arrayLength;
        }
                                                        //new array with the length of the first array
        int[] tempArray = new int[a];
        int j =0;
            for(int i=0; i<a-1; i++) {                  //index =0; 0 < 9-1(8); 0+1; (i=0; i<8; i+1)
                if (array[i] != array[i + 1]) {         //if array[0](20) not equal array[0+1(2)] (20)+index[1](20)
                        tempArray[j++] = array[i];      //tempArray[0+1(1)] (20)+index[1](20) = array[0](20)
                }
            }
            tempArray[j++] = array[a-1];                //tempArray[0+1(1)] (20) = array[9-1(8)]
                                                        //tempArray[1] = array[8] tempArray(20) = array(60)
        for(int i=0; i<j; i++){                         //
            array[i] = tempArray[i];                    //
        }
        for (int i=0; i<a; i++){                        //
            System.out.print(array[i]+",");             //
        }
    }
}

  /*
    int arr[] = {10,20,20,30,30,40,50,50};
    int length = arr.length;
        length = removeDuplicateElements(arr, length);
        //printing array elements
        for (int i=0; i<length; i++)
            System.out.print(arr[i]+" ");
    }
    public static int removeDuplicateElements(int arr[], int n){

            int[] array = new int[8];
            int j = 0;
            for (int i=0; i<8-1; i++){
                if (arr[i] != arr[i+1]){
                    array[j++] = arr[i];
                }
            }
            array[j++] = arr[n-1];
            // Changing original array
            for (int i=0; i<j; i++){
                arr[i] = array[i];
            }
            return j;*/




