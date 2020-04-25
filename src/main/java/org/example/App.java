package org.example;

import java.util.*;

/**
 * Week 3 exercises (Array is sooo damn hard), just my opinion.
 */
public class App 
{
    private static Scanner numObj = new Scanner(System.in);
    public static void main( String[] args )
    {
        //System.out.println("P2 inte klar kan inte få return value -1 ??? vet inte med denna???");
    p4();


    }
    public static void p1(){
        /*
        Write a program which will store elements in an array of type ‘int’ and print it out.
        Expected output: 11 23 39 etc..
        */

        int[] indexOf = {1,2,3,4,5,6,7,8,9};
            for(int i=0; i<indexOf.length; i++){
                System.out.print(indexOf[i]+" ");
            }
    }
    public static void p2(){
        /*Create a program and create a method with name ‘indexOf’ which will find and return the
        index of an element in the array. If the element doesn’t exist your method should
        return -1 as value. Expected output: Index position of number 5 is: 2.
         */

        int[] indexOf = {64,32,16,8,4,2,0};

            int index =5;
            int print = indexOf[index];
            int a = indexOf.length;
                    if (a < index) {
                        System.out.println("-1");
                    }else {
                        System.out.println(print);
            }


    }
    public static void p3(){
        /*Write a program which will sort string array.
        Expected output: String array: [Paris, London, New York, Stockholm]
        Sort string array: [London, New York, Paris, Stockholm]*/
        String[] array = {"Paris", "London", "New York", "Stockholm"};

        Arrays.sort(array);
            String a = Arrays.toString(array);
                System.out.println(a);
        /* Bättre alternativ
        Arrays.sort(array);
            System.out.println(Arrays.toString(array));
        */

    }
    public static void p4(){
    /*Write a program which will copy the elements of one array into another array.
    Expected output: Elements from first array: 1 15 20
    Elements from second array: 1 15 20*/
        int[] arrayOne = {1,2,3,4,5,6,7};
        int[] arrayTwo = Arrays.copyOf(arrayOne,arrayOne.length);

            System.out.println("Array one: "+Arrays.toString(arrayOne));
            System.out.println("Array two: "+Arrays.toString(arrayTwo));


    }
    public static void p5(){
    /*Create a two-dimensional string array [2][2]. Assign values to the 2d array containing
    any Country and City. Expected output: France Paris Sweden Stockholm*/

        String[][] array = {{"France", "Paris"}, {"Sweden", "Stockholm"}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
    }
    public static void p6(){
        /*Write a program which will set up an array to hold the next values in this
        order: 43, 5, 23, 17, 2, 14 and print the average of these 6 numbers.
        Expected output: Average is: 17.3*/
        /*Calc avarage, add all numbers, count the elements, and div sum / elements*/
        /************************************************************************************
            one way to add the elements
            for (int i=0; i<intAvarage.length; i++){ //Räknar värdet på alla elementen
                sum = sum + intAvarage[i];
            }
        ************************************************************************************/
        int[] arrayAvarage = {43,5,23,17,2,14};
        double sum =0;
        double sum2 =0;
        double elements = arrayAvarage.length;

        for(int num : arrayAvarage){
            sum = sum+num;
            sum2 = sum / elements;

        }System.out.printf("%.1f",sum2);

    }
    public static void p7(){
    /*Write a program which will set up an array to hold 10 numbers and print out only the uneven numbers.
     Expected output: Array: 1 2 4 7 9 12 Odd Array: 1 7 9
    int num =7;
    int sum =0;
       if (num%2 == 0){
           System.out.println("Yep");
       }else{
           System.out.println("Nepp");
       } // Ska ge "nepp" då det är udda
    */

        int[] array = {1,2,3,4,5,6,7,8,9,10};

        System.out.print("Even: ");
        for(int i=0; i<array.length; i++){
            if(array[i]%2 == 0){
                System.out.print(array[i]+",");
            }
        }
        System.out.println();
        System.out.print("Odd: ");
        for(int i=0; i<array.length; i++){
            if(array[i]%2 != 0){
                System.out.print(array[i]+",");
            }
        }
    }
    public static void p8(){
    /*Write a program which will remove the duplicate elements of a given
    array [20, 20, 40, 20, 30, 40, 50, 60, 50].
    Expected output: Array: 20 20 40 20 30 40 50 60 50
    Array without duplicate values: 20 40 30 50 60*/

    /*ArrayList > förstår inte riktigt koden (Funkar men skrotad för nu)
        ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(20, 20, 40, 20, 30, 40, 50, 60, 50));
        System.out.println(numbersList);
        List<Integer> cleanList = numbersList.stream().distinct().collect(Collectors.toList());
        System.out.println(cleanList);
    */

    }       //fattar noll för att jag inte fattar denna eller får ihop denna.
    public static void p9(){
    /*Write a method which will add elements in an array. Remember that arrays are fixed in size
    so you need to come up with a solution to “expand” the array.*/

    String[] array = {"Sofia","Linn"};
    String[] array2 = new String[array.length+1];           //Resize array2 to add another element

        for(int i=0; i<array.length; i++)                   //Add all elements from array to array2
            array2[i] = array[i];
            array2[array.length] = "Hannah";                //Add the new element to array2

        System.out.println("Array1: "+Arrays.toString(array));  //Print array without adding
        System.out.println("Array2: "+Arrays.toString(array2)); //Print array2 with new element

 /* ArrayList
        // Create an ArrayList that holds references to String
        ArrayList<String> names = new ArrayList<String>();

        // Capacity starts at 10, but size starts at 0
        System.out.println("initial size: " + names.size() );

        // Add three String references
        names.add("Amy");
        names.add("Bob");
        names.add("Cindy");
        names.add("Mattias");
        System.out.println("new size: " + names.size() );

        // Access and print out the Objects
        for ( int j=0; j<names.size(); j++ )
            System.out.println("element " + j + ": " + names.get(j) );
*/
    }
    public static void p10(){
    /*Write a program which will represent multiplication table stored in multidimensional array.
    Hint: You have two-dimensional array with values [[1,2,3,4,5,6,7,8,9,10], [1,2,3,4,5,6,7,8,9,10]]*/

        int[][] tableOfNum = {{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10}};

        int xLength = tableOfNum[0].length;
        int yLength = tableOfNum[1].length;

        int[][] multiTable = new int[xLength][yLength];
        for(int x=0; x < multiTable.length; x++){
            for(int y=0; y < multiTable.length; y++){
                multiTable[x][y] = (x+1)*(y+1);
            }
        }
        tableOfNum = multiTable;

        for(int x=0; x < tableOfNum.length; x++){
            for(int y=0; y < tableOfNum.length; y++){
                System.out.print("      "+tableOfNum[x][y]);
            }
            System.out.println();
        }

    }   //Behöver öva mer på dessa för att bli bättre
    public static void p11(){
    /*Write a program that ask the user for an integer and repeat that question until user give you a
    specific value that user already has been told about as a message in your program. Store these
     in an array and print that array. After that reverse the array elements so that the first element
     becomes the last element, the second element becomes the second to last element, etc. Do not just
     reverse the order in which they are printed. You need to change the way they are stored in the array.*/
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
    public static void p12(){
    /*
    Write a program which will print the diagonal elements of twodimensional array.
    Expected output: 1 4 9
    */
    //Samma som p10
        int[][] tableOfNum;

        int[][] multiTable = new int[3][3];
        for (int x = 0; x < multiTable.length; x++) {
            for (int y = 0; y < multiTable.length; y++) {
                multiTable[x][y] = (x + 1) * (y + 1);
            }
        }
        tableOfNum = multiTable;

        for (int x = 0; x < tableOfNum.length; x++) {
            for (int y = 0; y < tableOfNum.length; y++) {
                System.out.print("      " + tableOfNum[x][y]);
            }
            System.out.println();
        }
    }   //Behöver öva mer samma som p10
    public static void p13(){
    /*
    Create two arrays with arbitrary size and fill one with random numbers. Then copy over the numbers
    from the array with random numbers so that the even numbers are located in the rear (the right side)
    part of the array and the odd numbers are located in the front part (the left side).
    P7 Odd / Even
    int[] {1,2,3,4,5,6,7,8,9,10}  int[] {TOM}
    */
    p13();

    }
}

