public class Board {

	private char[] board = {'','',''};
	boolean isPlaying = false;

	enum gameState {
		playing,
		win,
		lose
	};

	gameState state = gameState.playing;

}
