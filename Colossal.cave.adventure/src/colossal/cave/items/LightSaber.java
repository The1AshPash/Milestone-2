package colossal.cave.items;

import java.util.Scanner;

public class LightSaber {

	private String choice;

	// player has option to choose different colors
	// three options,

	public LightSaber(String initialChoice) {
		this.choice = choice;

	}

	public void saberColor() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Which color lightsaber do you want (Red, Green, Blue)?");
		String saberChoice = scanner.nextLine();
		if (saberChoice.equals("Red")) {
			System.out.println("You chose the Red lightsaber");
			choice = "Red";
		} else if (saberChoice.equals("Green")) {
			choice = "Green";
			System.out.println("You chose the Green lightsaber");
		} else if (saberChoice.equals("Blue")) {
			choice = "Blue";
			System.out.println("You chose the Blue lightsaber");
		}

	}

	public String getChoice() {
		return choice;
	}

	public void setChoice(String saberChoice) {
		this.choice = saberChoice;
	}

}
