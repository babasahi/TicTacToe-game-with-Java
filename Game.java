import java.util.Arrays;

public class Game {

	private static int[] board = new int[9];

	public int[] getBoard() {
		return board;
	}

	public void setBoard(int[] newBoard) {
		board = newBoard;
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

	static String[] convertBoardToString(int[] numBoard) {
		String[] sboard = new String[9];
		for (int i = 0; i < numBoard.length; i++) {
			if (numBoard[i] == -1) {
				sboard[i] = String.valueOf('O');
			} else if (numBoard[i] == 1) {
				sboard[i] = String.valueOf('X');
			} else {
				sboard[i] = null;
			}
		}
		return sboard;
	}

	static String checkWinner(int[] newBoard) {
		String[] sboard = convertBoardToString(newBoard);
		for (int a = 0; a < 8; a++) {
			String line = null;

			switch (a) {
				case 0:
					line = sboard[0] + sboard[1] + sboard[2];
					break;
				case 1:
					line = sboard[3] + sboard[4] + sboard[5];
					break;
				case 2:
					line = sboard[6] + sboard[7] + sboard[8];
					break;
				case 3:
					line = sboard[0] + sboard[3] + sboard[6];
					break;
				case 4:
					line = sboard[1] + sboard[4] + sboard[7];
					break;
				case 5:
					line = sboard[2] + sboard[5] + sboard[8];
					break;
				case 6:
					line = sboard[0] + sboard[4] + sboard[8];
					break;
				case 7:
					line = sboard[2] + sboard[4] + sboard[6];
					break;
			}
			// For X winner
			if (line.equals("XXX")) {
				return "X";
			}

			// For O winner
			else if (line.equals("OOO")) {
				return "O";
			}
		}

		for (int a = 0; a < 9; a++) {
			if (Arrays.asList(board).contains(
					String.valueOf(a + 1))) {
				break;
			} else if (a == 8) {
				return "draw";
			}
		}

		return null;
	}
}