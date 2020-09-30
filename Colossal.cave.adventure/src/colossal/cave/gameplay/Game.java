package colossal.cave.gameplay;

import java.util.Scanner;

import colossal.cave.player.Player;

public class Game {

	private boolean GameOver;
	private Scanner scanner;

	public Game() {
		this.GameOver = false;
		this.scanner = new Scanner(System.in);
	}

	public void GameOver(int n) {
		this.GameOver = true;
		System.exit(n);

	}

	public void runGame() {
		do {
			System.out.println("Enter a command: ");
			scanner.nextLine();
			break;
		} while (!this.GameOver);
		testIfGameOver();

	}

	public void testIfGameOver() {
		if (!this.GameOver) {
			System.out.println("Game Over!");

		}

	}

	public void startGame() {
		Player player = new Player();
		player.playerIntro();
	}
}
