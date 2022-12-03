package socketsgame;

import java.util.Scanner;

public class GameLogic {

	public int[] board = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };

	public static String numToSymbol(int num) {
		if (num == -1) {
			return "O";
		} else if (num == 1) {
			return "X";
		} else {
			return " ";
		}
	}

	public static void printBoard(int[] board) {
		System.out.println("");
		System.out.println("");
		System.out.println(
				"     " + numToSymbol(board[0]) + "  |  " + numToSymbol(board[1]) + "  | "
						+ numToSymbol(board[2]));
		System.out.println("    " + "_______________");
		System.out.println(
				"     " + numToSymbol(board[3]) + "  |  " + numToSymbol(board[4]) + "  | "
						+ numToSymbol(board[5]));
		System.out.println("    " + "_______________");
		System.out.println(
				"     " + numToSymbol(board[6]) + "  |  " + numToSymbol(board[7]) + "  | "
						+ numToSymbol(board[8]));
		System.out.println("");
		System.out.println("");

	}

	public void play(int position, int play) {
		if (board[position] == 0) {
			board[position] = play;
		}

	}

	public boolean checkWinner(int[] board, int player) {
		if (board[0] == player && board[1] == player && board[2] == player) {
			return true;
		} else if (board[3] == player && board[4] == player && board[5] == player) {
			return true;
		} else if (board[6] == player && board[7] == player && board[8] == player) {
			return true;
		} else if (board[0] == player && board[3] == player && board[6] == player) {
			return true;
		} else if (board[1] == player && board[4] == player && board[7] == player) {
			return true;
		} else if (board[2] == player && board[5] == player && board[8] == player) {
			return true;
		} else if (board[0] == player && board[4] == player && board[8] == player) {
			return true;
		} else if (board[2] == player && board[4] == player && board[6] == player) {
			return true;
		}
		return false;

	}

	public int numPlayedPositions(int[] board) {
		int num = 0;
		for (int i : board) {
			if (i != 0) {
				num++;
			}
		}
		return num;
	}

	public String gameStatus() {
		if (numPlayedPositions(board) < 5) {
			return "p";
		}
		if (checkWinner(board, -1)) {
			return "O";
		}
		if (checkWinner(board, 1)) {
			return "X";
		}
		if (numPlayedPositions(board) == 9) {
			return "E";
		}
		return "p";
	}

	public void startGame() {
		int firstPlay = 0;
		int turn = 0;
		int index = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Start with X :");

		while (gameStatus() == "p") {

			if (turn % 2 == 0) {
				if (firstPlay == 0) {
					System.out.println("X Choose position:");
					index = scanner.nextInt();
					play(index, 1);
					firstPlay = 1;
					printBoard(board);
					turn++;
					if (gameStatus() == "E") {
						System.out.println("Even !!");
					} else if (gameStatus() == "X") {
						System.out.println("X won !!");
					} else if (gameStatus() == "O") {
						System.out.println("O Won");
					}
				} else {
					do {
						System.out.println("X Choose position:");
						index = scanner.nextInt();
					} while (board[index] != 0);
					play(index, 1);
					firstPlay = 1;
					printBoard(board);
					turn++;
					if (gameStatus() == "E") {
						System.out.println("Even !!");
					} else if (gameStatus() == "X") {
						System.out.println("X won !!");
					} else if (gameStatus() == "O") {
						System.out.println("O Won");
					}
				}

			} else {
				do {
					System.out.println("O Choose position:");
					index = scanner.nextInt();
				} while (board[index] != 0);
				play(index, -1);
				firstPlay = 1;
				GameLogic.printBoard(board);
				turn++;
				if (gameStatus() == "E") {
					System.out.println("Even !!");
				} else if (gameStatus() == "X") {
					System.out.println("X won !!");
				} else if (gameStatus() == "O") {
					System.out.println("O Won");
				}
			}

		}

	}

	public static void main(String[] args) {

	}
}