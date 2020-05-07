package org.example;

import java.util.Arrays;

public class Tests {

    public static void main(String[] args) {
        //tests();
        tests2();
/*        int[][] tableOfNum;

            int[][] multiTable = new int[3][3];
            for(int x=0; x < multiTable.length; x++){
                for(int y=0; y < multiTable.length; y++){
                    multiTable[x][y] = (x+1)*(y+1);
                    tableOfNum = multiTable;
                    System.out.print("      "+tableOfNum[x][y]+"\n");
                }
            }System.out.println();
         //   tableOfNum = multiTable;

            for(int x=0; x < tableOfNum.length; x++){
                for(int y=0; y < tableOfNum.length; y++){
                    System.out.print("      "+tableOfNum[x][y]);
                }
                System.out.println();
            }*/
    }

    public static void tests2() {

        int[] arr  = {1, 1, 2, 2, 1, 1};
        int[] arrs = {1, 1, 1, 1, 2};
        int n = arr.length;

        int x = 0;
        int[] arr2 = new int[n];

        int j=0;

        for (int i = 0; i < arr.length; i++) {
            if( arr[i] == arr2[j] ){

            }
        }
    }
}

/****

 //array [20, 20, 40, 20, 30, 40, 50, 60, 50].
 //Expected output: Array: 20 20 40 20 30 40 50 60 50
 //Array without duplicate values: 20 40 30 50 60

/**
int[] array = {20, 20, 40, 20, 30, 40, 50, 60, 50};
    int[] temp = new int[5];
    int j = 0;
        Arrays.sort(array);

                for (int i = 0; i < array.length - 1; i++) {
        if (array[i] != array[i + 1]) {
        temp[j++] = array[i];
        }
        }
        temp[j++] = array[array.length - 1];



        for (int i=0; i<temp.length; i++)
        System.out.print(temp[i]+" ");
        }

        ***/

/***************************************************
        int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        int n = arr.length;

        int[] temp = new int[n];

        // Start traversing elements
        int j = 0;
        for (int i=0; i < n-1; i++)

            // If current element is not equal
            // to next element then store that
            // current element
            if (arr[i] != arr[i+1])
                temp[j++] = arr[i];

        // Store the last element as whether
        // it is unique or repeated, it hasn't
        // stored previously
        temp[j++] = arr[n-1];

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(temp));

        // Modify original array
        for(int i=0; i < j; i++)
            arr[i] = temp[i];

            System.out.println(Arrays.toString(arr));
            System.out.println(j);
            n = j;
        for (int i=0; i < n; i++)
            System.out.print(arr[i]+" ");
    }

    public static void tests(){
        int[] array = {20,40,20,40};
            Arrays.sort(array);
            // Listan ligger i ordning
        int length = array.length;

           // Räkna hur många objekt som är samma
            int ij=0;
            int j =0;
                for(int i=0; i < length-1; i++){
                    if (array[i] == array[i+1]) {
                        ij = ij+1;
                    }
                } System.out.println(ij);
                // Lägg ett objekt
                int[] newArray = new int[ij];
                    for(int i=0; i < length-1; i++){
                        if(array[i] == array[i+1]){
                            newArray[j++] = array[i];
                        }
                    }

                System.out.println(Arrays.toString(newArray));

                int kk =0; //20 & 40
                if (array[0] != array[1]){
                 //   kk = kk+1;
                } else{ kk = kk+1;}
                if // 40 & 20
                   (array[1] != array[2]){
                    kk = kk+1;
                } //else{ kk = kk+1;}
                if //20 & 40
                    (array[2] != array[3]){
                 //   kk = kk+1;
                } else{ kk = kk+1;}
                System.out.println(kk);

 int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5};
 int n = arr.length;


 n = removeDuplicates(arr, n);

 // Print updated array
 for (int i=0; i<n; i++)
 System.out.print(arr[i]+" ");
 }

 // Function to remove duplicate elements
 // This function returns new size of modified
 // array.

 static int removeDuplicates(int arr[], int n)
 {
 // Return, if array is empty
 // or contains a single element

 if (n==0 || n==1)   //Retunerar 1 om det är en i listan eller Retunerar 0 om det inte är något annars inget alls
 return n;

 int[] temp = new int[n];

 // Start traversing elements
 int j = 0;
 for (int i=0; i<n-1; i++)
 // If current element is not equal
 // to next element then store that
 // current element
 if (arr[i] != arr[i+1])
 temp[j++] = arr[i];

 // Store the last element as whether
 // it is unique or repeated, it hasn't
 // stored previously
 temp[j++] = arr[n-1];

 // Modify original array
 for (int i=0; i<j; i++)
 arr[i] = temp[i];

 return j;
 }
 }
 Resultat
 1  2  3  4  5            Array1 : 1,2,3,4,5 || array 2 1,2,3,4,5
 2  4  6  8  10
 3  6  9  12 15
 4  8  12 16 20
 5  10 15 20 15


 Ta array1 * array2 ( array1[0] * array2[0] = 1 * 1 = 1
 array1[2] * array2[2] = 3 * 3 = 9

 Förklarning for
        for (int i=0; i < 2; i++)
        for 1. Sätter värde innan loopen (int i=0;) ,
            2. Bästämmer villkoren för loopen att köra (i < 2) i detta fallet ska i vara mindre än 2,
                om den är det ska loopen starta om igen och om falsk avbryts den.
            3. För varje gång den körs lägger den till 1 (i++) för varje loopning ökas värdet på i med 1
                tills den når villkoren, dvs avslutning av loop.
                for i for sats inom scope;
                En for sats loppas till villkor uppnås, har man flera for loopar inom scopet ökas värdet på den senare
                först till villkor uppnås innan den backar hela vägen till första for satsen.

                I detta fallet rör det sig om 2d Arrays[][]
                for ( 0; 0<2; 0+1)       loop en gång paus >>> for (0; 0<2; 0+1)
                for ( 0; 0<2; 0+1)   loop en gång      >>> for (1; 1<2; 1+1) tills villkor uppfyllt
                arr1[0][0] >> arr1[0][0]                >>> arr1[0][1]

                logisk följd arr1[0][0] > arr1[0][1] > arr1[0][2] villkor uppfyllt for2 kör for 1
                arr1[1][0] > arr1[1][1] > arr1[1][2] villkor uppfyllt for2 kör for 1
                arr1[2][0] > arr1[2][1] > arr1[2][2] alla villkor uppfyllda for2 och for1 klart

 /***********************************************************************
 // Först läs det första elementet sedan leta upp nästa element
 for (int i = 0; i < array.length; i++) {
 for (int j = 0; j < array.length; j++) {
 if (array[i] == array[j]) {
 System.out.print(" i "+array[i]+", ");
 System.out.print(" j "+array[i]+", ");
 array[i] = 0;
 //  delete(array,i);
 }
 }
 System.out.println(Arrays.toString(array));
 }
 System.out.println(Arrays.toString(array));
 }

 public static void delete(int[] array, int index) {
 //Temp array with new size
 int[] useList = new int[array.length - 1];
 int nonDeletedElements = array.length - (index + 1);

 //Copy the elements before the index pos
 System.arraycopy(array, 0, useList, 0, index);
 //Copy the elements after the index pos
 System.arraycopy(array, index + 1, useList, index, nonDeletedElements);
 //Update person array with new list
 array = useList;
 System.out.print(Arrays.toString(array)+", ");
 }
 }

 //Find index via id number (target)
 int index =0;

 for(int i=0; i < person.length; i++){
 if(person[i].getPersonId() == target){
 index =i;
 }
 }
 }

 int[] arrInput = {20, 20, 40, 20, 30, 40, 50, 60, 50};
 int length = arrInput.length;
 length = duplicateElement(arrInput, length);
 // printing elements
 for(int a = 0; a < length; a++)
 {
 System.out.print(arrInput[a] + " hello");
 }
 System.out.println("Hello");
 }

 public static int duplicateElement(int[] arrNumbers, int num)
 {
 if(num == 0 || num == 1)
 {
 return num;
 }
 int[] temp = new int[num];
 int b = 0;
 for(int a = 0; a < num - 1; a++)
 {
 if(arrNumbers[a] != arrNumbers[a + 1])
 {
 temp[b++] = arrNumbers[a];
 }
 }
 temp[b++] = arrNumbers[num - 1];
 for(int a = 0; a < b; b++)
 {
 arrNumbers[a] = temp[a];
 }
 return b;
 }
 }
 /*Write a program which will remove the duplicate elements of a given
 array [20, 20, 40, 20, 30, 40, 50, 60, 50].
 Expected output: Array: 20 20 40 20 30 40 50 60 50
 Array without duplicate values: 20 40 30 50 60*/

/************************************************************************
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
 return j;

 **************************************************************/




