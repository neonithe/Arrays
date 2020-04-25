package org.example;

import java.util.Arrays;

public class Tests2 {

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

        int[] arr = {1, 1, 2, 2, 1, 1};
        int n = arr.length;

        int x = 0;
        int[] arr2 = new int[n];
        int[] arr3 = new int[n];

      arr2[0] = arr[0];
    /*    for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr[i] == arr2[j]) {

                }else { arr2[j] = arr[i];}
            }
        }*/
        int xy=0;
        int nn=0;
        if (arr[0] == arr2[0]){
            xy++;
        }else { nn++;

        System.out.println(xy);
        System.out.println(nn);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }
}
/*        int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5};
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
*/




