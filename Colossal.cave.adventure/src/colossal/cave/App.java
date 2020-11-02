package colossal.cave;

import colossal.cave.items.LightSaber;
import colossal.cave.player.Player;

public class App {

	public static void main(String[] args) {
		Player player = new Player();
		player.playerIntro();
		String saberChoice = null;
		ItemData.init();
		LightSaber lightsaber = new LightSaber(saberChoice);

		lightsaber.saberColor();
		player.gamePlay();

	}

}
