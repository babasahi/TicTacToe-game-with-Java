package socketsgame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.net.URL;

public class NetworkHandler {

	public void sendNewBoard(int[] newBoard) {

	}

	public int[] getAddresse() {
		int[] addr = new int[4];
		try {
			URL url = new URL("http://checkip.amazonaws.com/");
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
			String str = br.readLine();

			for (int i = 0; i < str.split(".").length; i++) {
				addr[i] = Integer.parseInt(str.split(".")[i]);
			}
		} catch (Exception e) {

			System.out.println(e);

		}

		return addr;

	}

	public int[] getNewBoard() {
		int[] newBoard = new int[9];
		return newBoard;
	}

	public static void main(String[] args) throws IOException {

	}
}
