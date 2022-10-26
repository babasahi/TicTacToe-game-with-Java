
enum gameStatus {
	playing,
	even,
	xWin,
	oWIn,
}

public class Game {

	private static int[] board = new int[9];

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

	static gameStatus checkGameStatus() {
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
