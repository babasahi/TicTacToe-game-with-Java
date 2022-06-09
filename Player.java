public class Player {
	private String name;
	private char choice;

	private char[] moves = new char[9];

	Player(String name, char choice, char[] moves) {
		this.name = name;
		this.choice = choice;
		this.moves = moves;
	}
}
