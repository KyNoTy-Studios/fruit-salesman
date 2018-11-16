package game.objects;

import java.util.*;

public class Map {

    public static void main(String[] args) {

        final int mapCol = 8;
        final int mapRow = 8;
        // Making a boundary variable for podium and border
        final int emptyPodium = 1;
        final int border = 2;
        // Map declared
        int mapArr[][] = new int[mapCol][mapRow];
        // These are podiums
        mapArr[2][2] = emptyPodium;
        mapArr[5][2] = emptyPodium;
        mapArr[2][5] = emptyPodium;
        mapArr[5][5] = emptyPodium;

        // Making the border
        for (int i = 0; i < mapCol; i++) {
            mapArr[0][i] = border;
            mapArr[mapCol - 1][i] = border;
        }

        for (int i = 0; i < mapRow; i++) {
            mapArr[i][0] = border;
            mapArr[i][mapRow-1] = border;
        }
        mapPrint(mapArr);
    }

    /**
     * Checks if the podium is full
     * @param map 2D int array representing the map position.
     * @param col integer representing the column posiiton in the map.
     * @param row integer representing thr row position in the map.
     * @return boolean representing whether the podium is full or not.
     */
    public boolean isFull(int [][] map, int col, int row ) {
        // If it doesn't equal empty podium, it's a full podium
        if (map[col][row] != 1) return true;
        else return false;
    }

    /**
     * Prints the entire map
     * @param map 2D array representing the game map.
     */
    static void mapPrint(int[][] map) {
        for (int[] row : map) {
            System.out.format("%s%n", Arrays.toString(row));
        }
    }

    /**
     * Puts a fruit value into the selected podium.
     * @param map 2D int array representing the game map.
     * @param col int representing the column position of the podium.
     * @param row int representing the row position of the podium.
     * @param fruit int representing the id of the fruit being placed.
     */
    static void fill(int[][] map, int col, int row, int fruit) {
        if (map[col][row] == 1) {
            map[col][row] = fruit;
        }
    }

    /**
     * Removes a fruit value from the selected podium.
     * @param map 2D int array representing the game map.
     * @param col int representing the column position of the podium.
     * @param row int representing the row position of the podium.
     */
    static void remove(int[][] map, int col, int row) {
        if (map[col][row] != 0 && map[col][row] != 1 && map[col][row] != 2) {
            map[col][row] = -1;
        }
    }
}