package org.example;

import java.util.*;
import java.util.stream.Collectors;

import static org.example.Multiplication.multi;
import static org.example.Multiplication.multi2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println("P2 inte klar kan inte få return value -1 ??? vet inte med denna???");
       p10();


    }
    public static void p1(){
        /*
        Write a program which will store elements in an array of type ‘int’ and print it out.
        Expected output: 11 23 39 etc..
        */

        int[] indexOf = {1,2,3,4,5,6,7,8,9};
            for(int i=0; i<indexOf.length; i++){
                System.out.print(indexOf[i]+",");
            }
    }
    public static void p2(){
        /*Create a program and create a method with name ‘indexOf’ which will find and return the
        index of an element in the array. If the element doesn’t exist your method should
        return -1 as value. Expected output: Index position of number 5 is: 2.
         */

        int[] indexOf = {0,2,5,16,32,64};

            int indexFound = Arrays.binarySearch(indexOf,5);
            int indexNotFound = Arrays.binarySearch(indexOf, -1);

            System.out.println(indexFound);
            System.out.println(indexNotFound);



    }
    public static void p3(){
        /*Write a program which will sort string array.
        Expected output: String array: [Paris, London, New York, Stockholm]
        Sort string array: [London, New York, Paris, Stockholm]*/
        ArrayList<String> cityArray = new ArrayList<String>();
            cityArray.add("Paris");
            cityArray.add("London");
            cityArray.add("New York");
            cityArray.add("Stockholm");


            for (String beforeSort : cityArray){
                System.out.print(beforeSort+",");

            }
            System.out.println("");
                Collections.sort(cityArray);
            System.out.println("Sorterad");

            for (String afterSort : cityArray){
                System.out.print(afterSort+",");
            }
    }
    public static void p4(){
    /*Write a program which will copy the elements of one array into another array.
    Expected output: Elements from first array: 1 15 20
    Elements from second array: 1 15 20*/
        int[] arrayOne={1,15,20};
        int[] arrayTwo=new int[arrayOne.length]; //Length är antalet element i en array

        // Listan som ska få kopian = Det som ska kopieras (Listan, antalet i listan)
            arrayTwo= Arrays.copyOf(arrayOne,arrayOne.length);
        // i=index=0 ; 0<antalet i lista ; 0 + 1 ;
                for(int i=0; i<arrayTwo.length; i++){
        // lista[0] + 1,2,3 osv tills det är slut
                    System.out.print(arrayTwo[i]+", ");
                }


    }
    public static void p5(){
    /*Create a two-dimensional string array [2][2]. Assign values to the 2d array containing
    any Country and City. Expected output: France Paris Sweden Stockholm*/
    /*    String[] cityArray = new String[2][2];

            cityArray[0][0] ="France Paris";
            cityArray[0][1] ="Sweden Stockholm ";
            cityArray[1][0] ="Finland Helsinki";
            cityArray[1][0] ="Germany Berlin";

                for(int i=0; i<cityArray.length; ++i){
                    for(int j=0; j<cityArray.length; ++j){
                        System.out.println(cityArray[i][j]);
                        System.out.print(cityArray[i]);
                    }
                }*/
    }       //Denna är inte färdig
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
        double[] intAvarage = {43,5,23,17,2,14};
        double sum=0;

        for (double num : intAvarage){
                sum = sum+num;
            }
            double avarage = sum / intAvarage.length;

                System.out.println("Antal element: "+intAvarage.length);
                System.out.println("Summa alla element: "+sum);
                System.out.format("Avarage: %.1f", avarage);

    }
    public static void p7(){
    /*Write a program which will set up an array to hold 10 numbers and print out only the uneven numbers.
     Expected output: Array: 1 2 4 7 9 12 Odd Array: 1 7 9
    */
        int[] arrayInput = {1,2,4,7,9,12};

            System.out.println("Even");
            for (int i=0; i<arrayInput.length; i++){
                if (arrayInput[i]%2 == 0) {
                    System.out.print(arrayInput[i]+",");
                }
            }
            System.out.println("");
            System.out.println("Odd");
            for (int i=0; i<arrayInput.length; i++) {
                if (arrayInput[i]%2 != 0){
                    System.out.print(arrayInput[i]+",");
                }
            }
    }    //Lär dig och förklara koden
    public static void p8(){
    /*Write a program which will remove the duplicate elements of a given
    array [20, 20, 40, 20, 30, 40, 50, 60, 50].
    Expected output: Array: 20 20 40 20 30 40 50 60 50
    Array without duplicate values: 20 40 30 50 60*/
        ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(20, 20, 40, 20, 30, 40, 50, 60, 50));
        System.out.println(numbersList);
        List<Integer> cleanList = numbersList.stream().distinct().collect(Collectors.toList());
        System.out.println(cleanList);

    }    //Kolla om man kan göra på något annat sätt
    public static void p9(){
    /*Write a method which will add elements in an array. Remember that arrays are fixed in size
    so you need to come up with a solution to “expand” the array.*/
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

    }    //Skriv om koden och lär dig den
    public static void p10() {
    /*Write a program which will represent multiplication table stored in multidimensional array.
    Hint: You have two-dimensional array with values [[1,2,3,4,5,6,7,8,9,10], [1,2,3,4,5,6,7,8,9,10]]*/
    multi2();

    }
    public static void p11() {
    /*Write a program that ask the user for an integer and repeat that question until user give you a
    specific value that user already has been told about as a message in your program. Store these
     in an array and print that array. After that reverse the array elements so that the first element
     becomes the last element, the second element becomes the second to last element, etc. Do not just
     reverse the order in which they are printed. You need to change the way they are stored in the array.*/


    }
    public static void tester(){

    String[] names = new String[0];
        names = StringArrayUtil.add(names,"Mattias Andersson");
        names = StringArrayUtil.add(names, "Michelle Johansson");
        names = StringArrayUtil.addAndSort(names, "Ameer Rasheed");
        
        System.out.println(Arrays.toString(names));
    }
}
