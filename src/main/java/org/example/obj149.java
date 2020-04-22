package org.example;

public class obj149 {

    public static void main(String[] args){
            // x = horizontel y = vertical
            int[][] numbers = new int[10][10];

            numbers = timesTable(3, 3);

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
