package org.example;

public class ObjectTest {
    public static int number = 1;

    static {
        System.out.println(number);
    }

    private String name;

    public static void main(String[] args) {
        ObjectTest obj = new ObjectTest();
    }

    public ObjectTest(){
        name="Erik";
    }

    {
        System.out.println(name);
    }

    static String foo;

    static {

    foo ="Hello";
}

}
