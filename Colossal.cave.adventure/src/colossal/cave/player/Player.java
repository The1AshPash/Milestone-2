package colossal.cave.player;

import java.util.Scanner;

import colossal.cave.items.LightSaver;

public class Player {

	private LightSaver lightsaver;
	private int hp;
	private final int MAX_HP = 100;
	private final int DAMAGE = 15;

	public Player() {
		this.hp = hp;
		this.lightsaver = lightsaver;

	}

	public void playerIntro() {
		Scanner s = new Scanner(System.in);
		System.out.println("Do you want to play colossal cave adventure? (Star Wars edition?)");
		s.nextLine();

	}
}
