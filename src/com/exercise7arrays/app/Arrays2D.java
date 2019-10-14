package com.exercise7arrays.app;

public class Arrays2D 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Constants
		final int ROWS = 10;
		final int COLS = 10;
		
		//variables
		int count = 0;
		
		//Array 2d
		int[][] matrix = new int[ROWS][COLS];
		
		for (int i = 0; i < ROWS; i++) 
		{
			for (int j = 0; j < COLS; j++) 
			{
				matrix[i][j] = count;
				count++;
			}
		}
		for (int i = 0; i < ROWS; i++) 
		{
			for (int j = 0; j < COLS; j++) 
			{
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println(" ");
		}

	}

}
