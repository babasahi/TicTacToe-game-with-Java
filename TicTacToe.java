
import java.util.Scanner;

public class TicTacToe {

	enum gameStatus {
		playing,
		even,
		xWin,
		oWIn,
	}

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Game game = new Game();
		int turn = 0;
		int index = 0;
		BoardTable board = new BoardTable();
		game.initBoard();
		board.printBoard(game.getBoard());
		int firstPlay = 0;

		System.out.println("Start with X :");

		while (Game.checkWinner(game.getBoard()) == null) {
			if (turn % 2 == 0) {
				if (firstPlay == 0) {
					System.out.println("X Choose position:");
					index = scanner.nextInt();
					game.play(index, 1);
					firstPlay = 1;
					board.printBoard(game.getBoard());
					turn++;
				} else {
					do {
						System.out.println("X Choose position:");
						index = scanner.nextInt();
					} while (game.getBoard()[index] != 0);
					game.play(index, 1);
					firstPlay = 1;
					board.printBoard(game.getBoard());
					turn++;
				}

			} else {
				do {
					System.out.println("O Choose position:");
					index = scanner.nextInt();
				} while (game.getBoard()[index] != 0);
				game.play(index, -1);
				firstPlay = 1;
				board.printBoard(game.getBoard());
				turn++;
			}

		}
		if (Game.checkWinner(game.getBoard()).equals("draw")) {
			System.out.println("Even !!");
		} else if (Game.checkWinner(game.getBoard()).equals('X')) {
			System.out.println("X won !!");
		} else {
			System.out.println("O Won");
		}
	}

}
