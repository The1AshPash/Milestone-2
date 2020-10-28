package colossal.cave.planet;

import java.util.HashMap;
import java.util.Map;

import colossal.cave.items.Items;

public class Planet {

	private final int locationId;
	private final String description;
	private final Map<String, Integer> moves;
	private Map<String, Items> item; // Temp.

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
	
	//Temp.
	public void tempitems() {
		item.put("Medkit", new Items(1, 10, 20, "It's small but it heals well", "TBD"));
		item.put("Medpack", new Items(2, 40, 100, "A proper Medpack, healing even the most grevious of wounds", "TBD"));
		item.put("Datapad", new Items(3, 700, 0, "A datapad with information on the Jedi", "TBD"));
		item.put("Deathsticks", new Items(4, 200, -10, "A taste of death", "TBD"));
		item.put("Thermaslice", new Items(5, 50, 0, "Yes, this is an easter egg", "TBD"));
		item.put("Chiss Pyrowall Cracker", new Items(6, 100, 0, "Chiss technology for hacking", "TBD"));
		item.put("Chiss Comlink Cracker", new Items(7, 100, 0, "Chiss technology for listening into Comlinks", "TBD"));
		item.put("Incriminating Holograph", new Items(8, 400, 0, "Blackmail material", "TBD"));
		item.put("VIP Comcode List", new Items(9, 200, 0, "A list of Comcodes of very important people", "TBD"));
		item.put("Evidence of Jedi passage", new Items(10, 500, 0, "The Jedi were here", "TBD"));
		item.put("Holograph of Jedi activity", new Items(11, 600, 0, "Holograph of the Jedi in action", "TBD"));
		item.put("Evidence of Sith passage", new Items(16, 500, 0, "The Sith were here", "TBD"));
		item.put("Holograph of Sith activity", new Items(17, 600, 0, "Holograph of the Sith in action", "TBD"));
		item.put("Evidence of fight", new Items(12, 700, 0, "The aftermath of a fight", "TBD"));
		item.put("Evidence of Count Dooku's Killer", new Items(13, 2000, 0, "The wreckage of battle hide clues to who the perpitrators are", "TBD"));
		item.put("Evidence of General Grevious's Killer", new Items(14, 2000, 0, "The Saber-burnt remains of the General hide clues to his undoing ", "TBD"));
		item.put("Evidence of a Sith amongst the Jedi", new Items(15, 2000, 0, "Trechery has a high price", "TBD"));
		
		
		
		
	}
	
	
	
}
