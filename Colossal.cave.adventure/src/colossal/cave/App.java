package colossal.cave;

import colossal.cave.gameplay.Game;

public class App {

	public static void main(String[] args) {

		System.out.println(
				"Welcome to our Colossal Cave Adventure (Star Wars edition). \nUse HELP command to get all available commands\n"
						+ "In a galaxy far far away you just landed on Naboo....\n");

		Game g = new Game();
		g.runGame();
	}

}
