package colossal.cave.player;

import java.util.HashMap;
import java.util.Map;
import java.util.*;
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
		planets.put(0, new Planet(0, "You are now on the planet of Coruscant", new ArrayList<String>(Arrays.asList("Medkit","Thermaslice"))));
		planets.put(1, new Planet(1, "You are now on the planet of Utapau", new ArrayList<String>(Arrays.asList("Medkit","Thermaslice"))));
		planets.put(2, new Planet(2, "You are now on the planet of Mygeeto", new ArrayList<String>(Arrays.asList("Medkit","Thermaslice"))));
		planets.put(3, new Planet(3, "You are now on the planet of Felucia", new ArrayList<String>(Arrays.asList("Medkit","Thermaslice"))));
		planets.put(4, new Planet(4, "You are now on the planet of Kashyyyk", new ArrayList<String>(Arrays.asList("Medkit","Thermaslice"))));
		planets.put(5, new Planet(5, "You are now on the planet of Cato Neimoidia", new ArrayList<String>(Arrays.asList("Medkit","Thermaslice"))));
		planets.put(6, new Planet(6, "You are now on the planet of Saleucami", new ArrayList<String>(Arrays.asList("Medkit","Thermaslice"))));
		planets.put(7, new Planet(7, "You are now on the planet of Mustafar", new ArrayList<String>(Arrays.asList("Medkit","Thermaslice"))));

		planets.get(0).addDirection("East", 1);

		planets.get(1).addDirection("West", 0);
		planets.get(1).addDirection("North", 3);
		planets.get(1).addDirection("East", 2);
		planets.get(1).addDirection("South", 4);

		planets.get(2).addDirection("South", 5);
		planets.get(2).addDirection("West", 4);

		planets.get(3).addDirection("North", 5);
		planets.get(3).addDirection("South", 1);
		planets.get(3).addDirection("East", 7);

		planets.get(4).addDirection("North", 1);
		planets.get(4).addDirection("East", 2);
		planets.get(4).addDirection("West", 6);

		planets.get(5).addDirection("North", 2);

		planets.get(6).addDirection("East", 4);

		planets.get(7).addDirection("West", 3);

		System.out.println(
				"You just won the Battle of Battle of Coruscant. Now you must choose a location to go (North, South, East, or West)");

		Map<String, String> command = new HashMap<>();
		command.put("QUIT", "Quit");
		command.put("NORTH", "North");
		command.put("SOUTH", "South");
		command.put("WEST", "West");
		command.put("EAST", "East");

		int i = 1;
		while (true) {
			if (i == -1)
				break;
			System.out.println(planets.get(i).getDescription());
			System.out.println("You find: " + planets.get(i).getAllItems());

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
