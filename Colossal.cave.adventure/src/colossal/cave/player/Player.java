package colossal.cave.player;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import colossal.cave.gameplay.Game;
import colossal.cave.items.LightSaber;
import colossal.cave.planet.Planet;

public class Player {

	private static Map<Integer, Planet> planets = new HashMap<>();
	private LightSaber lightsaver;
	private int hp;
	private final int MAX_HP = 100;
	private final int DAMAGE = 15;
	private final String STARTING_LOCATION = "Naboo";
	private Planet planet;

	public Player() {
		this.hp = hp;
		this.lightsaver = lightsaver;

	}

	public void playerIntro() {
		Game game = new Game();
		Scanner s = new Scanner(System.in);
		System.out.println("Do you want to play colossal cave adventure? (Star Wars edition?) (Yes, No)");
		String userInput = s.nextLine();
		if (userInput.equals("Yes")) {
			System.out.println("You chose to play the game!");
//			game.runGame();

		} else if (userInput.equals("No")) {
			System.out.println("You're missing out");
			game.GameOver(0);
		}

	}

	public void gamePlay() {

		Scanner scanner = new Scanner(System.in);
		planets.put(0, new Planet(0, "You are now on the planet of Coruscant"));
		planets.put(1, new Planet(1, "You are now on the planet of Utapau"));
		planets.put(2, new Planet(2, "You are now on the planet of Mygeeto"));
		planets.put(3, new Planet(3, "You are now on the planet of Felucia"));
		planets.put(4, new Planet(4, "You are now on the planet of Kashyyyk"));
		planets.put(5, new Planet(5, "You are now on the planet of Cato Neimoidia"));
		planets.put(6, new Planet(6, "You are now on the planet of Saleucami"));
		planets.put(7, new Planet(7, "You are now on the planet of Mustafar"));

		planets.get(1).move("West", 1);
		planets.get(1).move("North", 3);
		planets.get(1).move("East", 2);
		planets.get(1).move("South", 4);

		planets.get(2).move("South", 5);
		planets.get(2).move("West", 4);
		planets.get(2).move("Quit", 0);

		System.out.println(
				"You just won the Battle of Battle of Coruscant. Now you must choose a location to go (North, South, East, or West)");

		Map<String, String> command = new HashMap<>();
		command.put("Quit", "Quit");
		command.put("NORTH", "North");
		command.put("SOUTH", "South");
		command.put("WEST", "West");
		command.put("EAST", "East");

		int i = 1;
		while (true) {
			System.out.println(planets.get(i).getDescription());
			if (i == 0)
				break;

			Map<String, Integer> moves = planets.get(i).getMoves();
			System.out.println("Available moves are: Enter a command below");
			for (String move : moves.keySet()) {
				System.out.println(move + " ");

			}
			System.out.println();
			String direction = scanner.nextLine().toUpperCase();
			if (direction.length() > 1) {
				String[] words = direction.split(" ");
				for (String word : words) {
					if (command.containsKey(word)) {
						direction = command.get(word);
						break;
					}
				}
			}
			if (moves.containsKey(direction)) {
				i = moves.get(direction);

			} else {
				System.out.println("Direction is not available");
			}
		}

	}
}
