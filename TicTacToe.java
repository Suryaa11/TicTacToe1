package com.oopsProject;

import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		Scanner z = new Scanner(System.in);
		Board board = new Board();
		System.out.print("Enter the symbol to start X or O : ");
		char ch1 = z.next().charAt(0);
		char ch2 = (ch1 == 'X') ? 'O' : 'X';
		while (!board.isBoardFull() && board.checkWinner() == 'N') {
			board.displayBoard();
			System.out.println(ch1 + " Player turn");
			System.out.print("Enter the row : ");
			int row = z.nextInt();
			System.out.print("Enter the column : ");
			int column = z.nextInt();
			board.makeMove(row, column, ch1);
			char temp = ch1;
			ch1 = ch2;
			ch2 = temp;
		}

	}

}
