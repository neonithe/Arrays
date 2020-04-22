package org.example;

public class Strings {

    public static void main(String[] args){
    p10();
    }
    public static void p1(){
    //What is the length of the String: "Java" ?
        String java ="Java";
        System.out.println("Length: "+java.length());
    }
    public static void p2(){
    //What char is at index position 6 in the following String:
    //"Long example sentence" ?
        String strings ="Long example sentence";
            char string = strings.charAt(6);
            System.out.println(string);

    }
    public static void p3(){
    //What is the index position of 'o' in the following String:
    //"Even longer example sentence" ?
    String strings ="Even longer example sentence";
        int string = strings.indexOf("o");
        System.out.println(string);

    }
    public static void p4(){
    //Given the following String: "Ok this is not as long!"
    //create a substring of only "not as long" (excluding the
    //exclamation point) and print it out.
    String strings ="Ok this is not as long";
        int first = strings.indexOf("n");   //included
        int last = strings.indexOf("g");    //Not included
        String print = strings.substring(first,last+1);
            System.out.println(print);

    }
    public static void p5(){
    //Convert the following String: "CAPS EQUALS SCREAMING" to
    //lowercase and print it out. Then convert it back to
    //uppercase and print it out again.
    String strings ="CAPS EQUALS SCREAMING";
        System.out.println(strings.toLowerCase());
        System.out.println(strings.toUpperCase());
    }
    public static void p6(){
    //Correct the following String: "Java is the worst
    //programming language!" by replacing the (obviously
    //incorrect) word "worst" with the word "best". Then print
    //out the sentence.
    String strings = "Java is the worst programming language!";
        System.out.println(strings.replaceFirst("worst","best"));
    }
    public static void p7(){
    //What is the output of the following String:
    //"\tJ\ta\tv\ta\t" after you trim it?
    String strings ="\tJ\ta\tv\ta\t";
        System.out.println(strings.trim());
    }
    public static void p8(){
    //Parse the following int: 20 to a String and add a 20 to the
    //end of the String. Printing it out should return: "2020".
        int sum =20;
            System.out.println(sum+"20");

        String strings = Integer.toString(sum);
            System.out.println(strings+"20");

        String strLast ="20";
            System.out.println(strings+strLast);
    }
    public static void p9(){
    //Oil and water don't go well together. Given the String:
    //"Oil and Water", split them up into the words "Oil","Water"
    //and store them in a String array.

        String txt = "Oil and Water";
            String[] splited = txt.split(" ");

        for(String array : splited) {
            System.out.println(array);
        }
        }
    public static void p10(){
    //Split the following String: "Carl,Susie,Fredrick,Bob,Erik"
    //into an array. Print out all names separately.
        String txt = "Carl,Susie,Fredrick,Bob,Erik";
        String[] splited = txt.split(",");

        for(String array : splited) {
            System.out.println(array);
        }
    }
    public static void p11(){

    }


}
