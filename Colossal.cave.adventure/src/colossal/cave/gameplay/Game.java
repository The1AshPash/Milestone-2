package colossal.cave.gameplay;

import java.util.Scanner;

public class Game {

	private boolean GameOver;
	private Scanner scanner;

	public Game() {
		this.GameOver = false;
		this.scanner = new Scanner(System.in);
	}

	public void GameOver() {
		this.GameOver = true;
	}

	public void runGame() {
		do {
			System.out.println("Enter a command: ");
		} while (!this.GameOver);
	}

	public void testIfGameOver() {
		if (!this.GameOver) {

		}
	}
}
