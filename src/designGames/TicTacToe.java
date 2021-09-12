package designGames;

import java.util.Scanner;

public class TicTacToe {

	private char[][] gameBoard = new char[3][3];
	private int size = 3;

	TicTacToe() {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				gameBoard[i][j] = '-';
			}
		}
	}

	public boolean printWinner(char player, int x, int y) {
		int row = 0, col = 0, diag = 0, rDiag = 0;

		for (int i = 0; i < size; i++) {
			if (gameBoard[x][i] == player)
				row++;
			if (gameBoard[i][y] == player)
				col++;
			if (gameBoard[i][i] == player)
				diag++;
			if (gameBoard[i][size - (i + 1)] == player)
				rDiag++;
		}
		if (row == size || col == size || diag == size || rDiag == size) {
			return true;
		} else {
			return false;
		}
	}

	private void addMove(char player, int x, int y) {
		// TODO:: add conditions
		if (gameBoard[x][y] == '-') {
			gameBoard[x][y] = player;
		}
	}

	private void printBoard() {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(gameBoard[i][j]);
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		System.out.println("Initializing game============");
		boolean player1 = true;
		int moves = 0;
		boolean flag = false;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		TicTacToe board = new TicTacToe();
		while (!flag && moves < (board.size * board.size)) {
			System.out.println("Player " + (player1 ? 'X' : 'O') + " input");
			int x = sc.nextInt();
			int y = sc.nextInt();
			board.addMove((player1 ? 'X' : 'O'), x, y);
			flag = board.printWinner((player1 ? 'X' : 'O'), x, y);
			if (flag) {
				System.out.println((player1 ? 'X' : 'O') + " wins !!!!!!");
				return;
			}
			board.printBoard();
			player1 = !player1;
			moves += 1;
		}
		if (!flag) {
			System.out.println("Match Drawn");
		}
	}
}
