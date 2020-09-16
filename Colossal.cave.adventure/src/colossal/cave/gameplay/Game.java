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
}
