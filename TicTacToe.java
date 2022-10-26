
import java.util.Scanner;
import java.lang.*;

public class TicTacToe {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		Game.initBoard();
		Game.System.out.print("Which you would like to start with X or O ? :");
		char choice = scanner.next().charAt(0);

		if (choice == 'X') {
			while (playNumber < 9 && !finisher) {

				BoardPrinter(PositionFinder(), X);
				BoardPrinter(PositionFinder(), O);

			}
			System.out.println("End Game !");
		} else if (choice == 'O') {
			while (playNumber < 9 && !finisher) {

				BoardPrinter(PositionFinder(), O);
				BoardPrinter(PositionFinder(), X);

			}
			System.out.println("End Game !");
		} else {
			System.out.println("Invalid inputs !, Please enter X or O ");

		}
	}

}
