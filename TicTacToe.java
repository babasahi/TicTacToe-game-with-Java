
import java.util.Scanner;

enum gameStatus {
	playing,
	even,
	xWin,
	oWIn,
}

public class TicTacToe {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Game game = new Game();
		int turn = 0;
		int index = 0;
		BoardTable board = new BoardTable();
		game.initBoard();
		board.printBoard(game.getBoard());

		System.out.print("Which you would like to start with X or O ? :");
		char choice = scanner.next().charAt(0);

		while (game.checkGameStatus() == gameStatus.playing) {
			if (turn % 2 == 0) {
				System.out.println("X Choose position:");
				index = scanner.nextInt();
				game.play(index, 1);
				board.printBoard(game.getBoard());
				turn++;
			} else {
				System.out.println("O Choose position:");
				index = scanner.nextInt();
				game.play(index, 1);
				board.printBoard(game.getBoard());
				turn++;
			}

		}
		if (game.checkGameStatus() == gameStatus.even) {
			System.out.println("Even !!");
		} else if (game.checkGameStatus() == gameStatus.xWin) {
			System.out.println("X won !!");
		} else {
			System.out.println("O Won");
		}
	}

}

class Game {

	private static int[] board = new int[9];

	public int[] getBoard() {
		return board;
	}

	public void initBoard() {

		for (int i = 0; i < board.length; i++) {
			board[i] = 0;
		}
	}

	public void play(int indenum, int play) {
		if (play != 0) {
			board[indenum] = play;
		}

	}

	public gameStatus checkGameStatus() {
		int playedCount = 0;
		for (int i = 0; i < board.length; i++) {
			if (board[i] != 0) {
				playedCount++;
			}
		}
		if (playedCount < 5) {
			return gameStatus.playing;
		} else if (playedCount == 9) {
			return gameStatus.even;
		} else {
			if (lookForWin(-1)) {
				return gameStatus.oWIn;
			} else {
				return gameStatus.xWin;
			}
		}

	}

	static boolean lookForWin(int num) {
		if (board[0] == num && board[1] == num && board[2] == num) {
			return true;
		} else if (board[3] == num && board[4] == num && board[5] == num) {
			return true;
		} else if (board[6] == num && board[7] == num && board[8] == num) {
			return true;
		} else if (board[0] == num && board[3] == num && board[6] == num) {
			return true;
		} else if (board[1] == num && board[4] == num && board[7] == num) {
			return true;
		} else if (board[2] == num && board[5] == num && board[8] == num) {
			return true;
		} else if (board[0] == num && board[4] == num && board[8] == num) {
			return true;
		} else if (board[2] == num && board[4] == num && board[6] == num) {
			return true;
		} else {
			return false;
		}

	}
}

class BoardTable {

	public void printBoard(int[] board) {
		System.out.println(
				"     " + numToSymbol(board[0]) + " | " + numToSymbol(board[1]) + " | " + numToSymbol(board[2]));
		System.out.println("    " + "---+---+---");
		System.out.println(
				"     " + numToSymbol(board[3]) + " | " + numToSymbol(board[4]) + " | " + numToSymbol(board[5]));
		System.out.println("    " + "---+---+---");
		System.out.println(
				"     " + numToSymbol(board[6]) + " | " + numToSymbol(board[7]) + " | " + numToSymbol(board[8]));

	}

	private String numToSymbol(int num) {
		if (num == -1) {
			return "O";
		} else if (num == 1) {
			return "X";
		} else {
			return "";
		}
	}
}
