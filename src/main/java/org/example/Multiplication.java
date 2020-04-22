package org.example;

public class Multiplication {

    public static void multi() {

    }

    public static void multi2() {
        // x = horizontel y = vertical
        int[][] numbers = new int[10][10];

        numbers = timesTable(10, 10);

        for (int x = 0; x < numbers.length; x++) {
            for (int y = 0; y < numbers.length; y++) {
                System.out.print("        "+ numbers[x][y]);
            }
            System.out.println();
        }
    }

    private static int[][] timesTable(int a, int b) {
        int[][] table = new int[a][b];
        for (int x=0; x<table.length; x++){
            for(int y=0; y<table.length; y++){
                table[x][y] = (x+1)*(y+1);
            }
        }
        return table;
    }

}
