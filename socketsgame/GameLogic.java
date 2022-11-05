package socketsgame;

class GameLogic {

	public int[] board = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };

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

	public static void main(String[] args) {

	}
}