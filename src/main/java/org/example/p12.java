package org.example;

public class p12 {

    public static void main(String[] args){
/*
        int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        int n = arr.length;


        n = removeDuplicates(arr, n);

        // Print updated array
        for (int i=0; i<n; i++)
            System.out.print(arr[i]+" ");
    }*/

    // Function to remove duplicate elements
    // This function returns new size of modified
    // array.

  /*  static int removeDuplicates(int arr[], int n)
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

        return j;*/
    }
}
/*     Resultat
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
 */