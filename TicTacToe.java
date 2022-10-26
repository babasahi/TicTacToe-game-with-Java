
import java.util.Scanner;

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
