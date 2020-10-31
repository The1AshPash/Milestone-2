package colossal.cave.planet;

import java.util.HashMap;
import java.util.Map;

import colossal.cave.items.Items;

public class Planet {

	private final int locationId;
	private final String description;
	private final Map<String, Integer> moves;

	private String currentPlanet;

	public Planet(int locationId, String description) {
		this.locationId = locationId;
		this.description = description;
		this.moves = new HashMap<>();
		this.moves.put("Quit", 0);
	}

	public int getLocation() {
		return locationId;
	}

	public String getDescription() {
		return description;
	}

	public void move(String direction, int location) {
		moves.put(direction, location);
	}

	public Map<String, Integer> getMoves() {
		return new HashMap<String, Integer>(moves);
	}	
	
	
}
