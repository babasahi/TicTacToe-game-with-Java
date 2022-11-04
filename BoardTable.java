public class BoardTable {

	public void printBoard(int[] board) {
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

	private String numToSymbol(int num) {
		if (num == -1) {
			return "O";
		} else if (num == 1) {
			return "X";
		} else {
			return " ";
		}
	}
}
