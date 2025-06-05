package com.oopsProject;

public class Board {
	private char[][] grid;

	public Board() {
		grid = new char[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				grid[i][j] = '-';
			}
		}
	}

	public void displayBoard() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(grid[i][j] + " ");
				if (j < 2) {
					System.out.print(" | ");
				}
			}
			System.out.println();
			if (i < 2) {
				System.out.println("---------");
			}
		}
	}

	public void makeMove(int row, int column, char symbol) {
		if (row < 0 || row >= 3 || column < 0 || column >= 3) {
			System.out.println("Please make a valid move");
		} else if (grid[row][column] != '-') {
			System.out.println("Sorry! There is already " + grid[row][column] + " is placed");
		} else {
			grid[row][column] = symbol;
		}
	}

	public char checkWinner() {
		for (int i = 0; i < 3; i++) {
			if (grid[i][0] != '-' && grid[i][0] == grid[i][1] && grid[i][1] == grid[i][2]) {
				return grid[i][0];
			}
		}
		for (int i = 0; i < 3; i++) {
			if (grid[0][i] != '-' && grid[0][i] == grid[1][i] && grid[1][i] == grid[2][i]) {
				return grid[0][i];
			}
		}
		if (grid[0][0] != '-' && grid[0][0] == grid[1][1] && grid[1][1] == grid[2][2]) {
			return grid[0][0];
		}
		if (grid[0][2] != '-' && grid[0][2] == grid[1][1] && grid[1][1] == grid[2][0]) {
			return grid[0][2];
		}
		return 'N';
	}

	public boolean isBoardFull() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (grid[i][j] == '-') {
					return false;
				}
			}
		}
		return true;
	}
}
