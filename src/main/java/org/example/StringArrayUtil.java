package org.example;

import java.util.Arrays;

public class StringArrayUtil {

    public static String[] add(final String[] source, String toAdd){
        String[] newArray = Arrays.copyOf(source, source.length +1);
        int offset = newArray.length-1;
        newArray[offset] = toAdd;
        Arrays.sort(newArray);
        return newArray;
    }

    public static String[] addAndSort(String[] source, String toAdd){
        source = add(source, toAdd);
        sort(source);
        return source;
    }

    public static void sort(String[] array){
        Arrays.sort(array);
    }
}
