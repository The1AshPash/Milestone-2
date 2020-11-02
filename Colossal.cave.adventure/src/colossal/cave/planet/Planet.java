package colossal.cave.planet;

import java.util.HashMap;
import java.util.Map;
import java.util.*;


import colossal.cave.items.Item;

public class Planet {

	private final int locationId;
	private final String description;
	private final Map<String, Integer> moves;
	private List<String> inventory;

	private String currentPlanet;

	public Planet(int locationId, String description, ArrayList<String> inventory) {
		this.locationId = locationId;
		this.description = description;
		this.moves = new HashMap<>();
		this.moves.put("Quit", -1);
		this.inventory = inventory;
	}

	public int getLocation() {
		return locationId;
	}

	public String getDescription() {
		return description;
	}

	public void addDirection(String direction, int location) {
		moves.put(direction, location);
	}

	public Map<String, Integer> getMoves() {
		return new HashMap<String, Integer>(moves);
	}
	public String getAllItems(){
		String returnString = "";
		ListIterator<String> itemsIterator = inventory.listIterator();
		while (itemsIterator.hasNext()){
			returnString+= itemsIterator.next();
			if(itemsIterator.hasNext()){
				returnString+=", ";
			}

		} 
		return returnString;
	}	
	
	
}
