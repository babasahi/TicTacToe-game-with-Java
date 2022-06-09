public class Board {

	private char[] board = new char[9];
	boolean isPlaying;

	enum gameState {
		playing,
		win,
		lose
	};

	gameState state = gameState.playing;

}
