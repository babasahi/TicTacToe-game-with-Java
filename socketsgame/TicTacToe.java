package socketsgame;

import java.util.Scanner;

public class TicTacToe {

	static Scanner scanner = new Scanner(System.in);

	private static void printBoard(int[] board) {
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

	static private String numToSymbol(int num) {
		if (num == -1) {
			return "O";
		} else if (num == 1) {
			return "X";
		} else {
			return " ";
		}
	}

	public static void main(String[] args) {
		GameLogic game = new GameLogic();
		int turn = 0;
		int index = 0;

		printBoard(game.board);
		int firstPlay = 0;

		System.out.println("Start with X :");

		while (game.gameStatus() == "p") {
			if (turn % 2 == 0) {
				if (firstPlay == 0) {
					System.out.println("X Choose position:");
					index = scanner.nextInt();
					game.play(index, 1);
					firstPlay = 1;
					printBoard(game.board);
					turn++;
					if (game.gameStatus() == "E") {
						System.out.println("Even !!");
					} else if (game.gameStatus() == "X") {
						System.out.println("X won !!");
					} else if (game.gameStatus() == "O") {
						System.out.println("O Won");
					}
				} else {
					do {
						System.out.println("X Choose position:");
						index = scanner.nextInt();
					} while (game.board[index] != 0);
					game.play(index, 1);
					firstPlay = 1;
					printBoard(game.board);
					turn++;
					if (game.gameStatus() == "E") {
						System.out.println("Even !!");
					} else if (game.gameStatus() == "X") {
						System.out.println("X won !!");
					} else if (game.gameStatus() == "O") {
						System.out.println("O Won");
					}
				}

			} else {
				do {
					System.out.println("O Choose position:");
					index = scanner.nextInt();
				} while (game.board[index] != 0);
				game.play(index, -1);
				firstPlay = 1;
				printBoard(game.board);
				turn++;
				if (game.gameStatus() == "E") {
					System.out.println("Even !!");
				} else if (game.gameStatus() == "X") {
					System.out.println("X won !!");
				} else if (game.gameStatus() == "O") {
					System.out.println("O Won");
				}
			}

		}

	}

}
