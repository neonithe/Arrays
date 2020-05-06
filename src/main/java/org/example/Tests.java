package org.example;

import java.util.Arrays;

public class Tests {

    public static int number = 1;
    public int number2 = 1;

    public static void main(String[] args) {
/*
    array [20, 20, 40, 20, 30, 40, 50, 60, 50].
    Expected output: Array: 20 20 40 20 30 40 50 60 50
    Array without duplicate values: 20 40 30 50 60*/

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

}

        // Först läs det första elementet sedan leta upp nästa element
   /*     for (int i = 0; i < array.length; i++) {
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

/*
        //Find index via id number (target)
        int index =0;

        for(int i=0; i < person.length; i++){
            if(person[i].getPersonId() == target){
                index =i;
            }
        }



    }*/


 /*   {
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
} */
    /*Write a program which will remove the duplicate elements of a given
    array [20, 20, 40, 20, 30, 40, 50, 60, 50].
    Expected output: Array: 20 20 40 20 30 40 50 60 50
    Array without duplicate values: 20 40 30 50 60*/
/*
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
*/
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




