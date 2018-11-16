import java.util.*;

public class Map
{

public static void main(String[] args)
{

	final int mapCol = 8; 
	final int mapRow = 8;
	final int emptyPodium = 1; // making a boundary variable for podium and border
	final int border = 2;
	int mapArr[][] = new int[mapCol][mapRow]; // map declared
	mapArr[2][2] = emptyPodium; // These are podiums
	mapArr[5][2] = emptyPodium;
	mapArr[2][5] = emptyPodium;
	mapArr[5][5] = emptyPodium;
	
	for (int i = 0; i < mapCol; i++) //Making the border
	{
		mapArr[0][i] = border;
		mapArr[mapCol - 1][i] = border;
	}
	
	for (int i = 0; i < mapRow; i++) //Making the border
	{
		mapArr[i][0] = border;
		mapArr[i][mapRow-1] = border;
	}
	mapPrint(mapArr);
	
}

public boolean isFull(int [][] map, int col, int row ) // checks if the podium is full
{
	if (map[col][row] != 1) //if it doesn't equal empty podium, it's a full podium
	{
		return true;
	}
	else return false;
}

static void mapPrint(int mapArr[][]) //prints the entire map
{
	for (int[] row : mapArr)
	{
		System.out.format("%s%n", Arrays.toString(row));
	}
}

static void fill(int [][] map, int col, int row, int fruit) // puts a fruit value into the selected slot (podium)
{
	if (map[col][row] == 1)
	{
		map[col][row] = fruit;
	}
}

static void remove(int [][] map, int col, int row)
{
	if (map[col][row] != 0 && map[col][row] != 1 && map[col][row] != 2)
	{
		map[col][row] = -1;
	}
}

}