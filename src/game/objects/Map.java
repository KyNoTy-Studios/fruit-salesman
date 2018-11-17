

import java.util.*;

public class Map {


	final int emptyPodium = 1;	// Making a boundary variable for podium and border
	final int border = 2;    	
	int mapCol = 8;		// These define the map dimensions
	int mapRow = 8;
	int mapArr[][] = new int[mapCol][mapRow];	//making the 2d array that is the "map"

	// no self defined constructors needed because there shouldn't be any other call other than 	Map exampleMap = new Map(); 
	
	public void makeBorder()
	{
		for (int i = 0; i < mapCol; i++) 
		{
			mapArr[0][i] = border;
			mapArr[mapCol - 1][i] = border;
		}
		
		for (int i = 0; i < mapRow; i++) 
		{
			mapArr[i][0] = border;
			mapArr[i][mapRow-1] = border;
		}
	}
	
	public void addPodiums()
	{
		mapArr[2][2] = emptyPodium;
		mapArr[5][2] = emptyPodium;
		mapArr[2][5] = emptyPodium;
		mapArr[5][5] = emptyPodium;
	}
	
	public void addFruit(int col, int row, int fruit)
	{
		mapArr[col][row] = fruit;
	}
		
		/**
		* Checks if the podium is full
		* @param map 2D int array representing the map position.
		* @param col integer representing the column posiiton in the map.
		* @param row integer representing thr row position in the map.
		* @return boolean representing whether the podium is full or not.
		*/
	public boolean isFull(int col, int row ) 
	{
		// If it doesn't equal empty podium, it's a full podium
		if (mapArr[col][row] != 1) return true;
		else return false;
	}
		
		/**
		* Prints the entire map
		* @param map 2D array representing the game map.
		*/
	public void mapPrint()
	{
			for (int[] row : mapArr) 
			{
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
	public void fill(int col, int row, int fruit) 
	{
			if (mapArr[col][row] == 1) 
			{
				mapArr[col][row] = fruit;
			}
	}
		
		/**
		* Removes a fruit value from the selected podium.
		* @param map 2D int array representing the game map.
		* @param col int representing the column position of the podium.
		* @param row int representing the row position of the podium.
		*/
	public void remove(int col, int row) 
	{
			if (mapArr[col][row] != 0 && mapArr[col][row] != 1 && mapArr[col][row] != 2) 
			{
				mapArr[col][row] = -1;
			}
	}


}