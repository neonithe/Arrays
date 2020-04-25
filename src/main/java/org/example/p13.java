package org.example;

import java.util.Arrays;

public class p13 {

    public static void main(String[] args) { /*
    Create two arrays with arbitrary size and fill one with random numbers. Then copy over the numbers
    from the array with random numbers so that the even numbers are located in the rear (the right side)
    part of the array and the odd numbers are located in the front part (the left side).
    P7 Odd / Even
    int[] {1,2,3,4,5,6,7,8,9,10}  int[] {TOM} */
        /**
         Se ren kod method oddEvenArray
         **/
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            String print = Arrays.toString(oddEvenArray(array));
                    System.out.println(print);

    }

    public static void tests(int array[]) {
        int index1 = 0;
        int index2 = 0;
        int index3 = 0;

        int[] oddArray = new int[5];
        int[] evenArray = new int[5];
        for (index1 = 0; index1 < array.length; index1++) {
            if (array[index1] % 2 != 0) {
                oddArray[index2] = array[index1];
                index2++;
            } else {
                evenArray[index3] = array[index1];
                index3++;
            }
        }
        System.out.print(Arrays.toString(oddArray));
        System.out.println(Arrays.toString(evenArray));
        // Time to merge the Arrays into one array
        int totalLength = oddArray.length + evenArray.length;
        int[] totalArray = new int[totalLength];
        int indexPosition = 0;
        //for - each (variable : array)
        for (int content : oddArray) {
            totalArray[indexPosition] = content;
            indexPosition++;                        //add until condition is 5 in this case
        }
        // Adds all the elements from oddArray into totalArray then continue
        //
        for (int content : evenArray) {
            totalArray[indexPosition] = content;
            indexPosition++;
        }
        System.out.println("The complicated way: " + Arrays.toString(totalArray));

        // After workshop today I´ll try System.arraycopy();
        int oddLength = oddArray.length;                         // 5
        int evenLength = evenArray.length;                       // 5
        int[] totalArray2 = new int[oddLength + evenLength]; // 5 + 5 = 10
        System.arraycopy(oddArray, 0, totalArray2, 0, oddLength);
        // Source array (Oddarray (1,3,5,7,9))
        // start position, in the array (oddArray (0)),
        // to witch array to copy to (totalArray2) ,
        // were to start in the destination array (0) ,
        // Number of elements to copy (5)
        System.arraycopy(evenArray, 0, totalArray2, oddLength, evenLength);
        // Source array (Oddarray (2,4,6,8,10))
        // start position, in the array (evenArray (0)),
        // to witch array to copy to (totalArray2) ,
        // were to start in the destination array (5) , oddLength is 5 from then add new elements
        // Number of elements to copy (5)
        System.out.println("The easy way: " + Arrays.toString(totalArray2)); // Gott d funkade!!!
    }

    public static int[] oddEvenArray(int[] array) {
    int index1 = 0;
    int index2 = 0;
    int index3 = 0;

        int[] oddArray = new int[5];
        int[] evenArray = new int[5];

        for (index1 = 0; index1 < array.length; index1++) {
            if (array[index1] % 2 != 0) {
                oddArray[index2] = array[index1];
                index2++;
            } else {
                evenArray[index3] = array[index1];
                index3++;
            }
        }
            int oddLength = oddArray.length;
            int evenLength = evenArray.length;

                int[] totalArray = new int[oddLength + evenLength];

                    System.arraycopy(oddArray, 0, totalArray, 0, oddLength);
                    System.arraycopy(evenArray, 0, totalArray, oddLength, evenLength);

        return totalArray;
    }
}
