package colossal.cave.items;

import java.util.HashMap;
import java.util.Map;

public final class ItemData {
	private Map<String, Item> item;

    public void init(){
        item = new HashMap<>();
        initializeItemData();

    }

    public void initializeItemData() {
		item.put("Medkit", new Item(10, 20, "It's small but it heals well"));
		item.put("Medpack", new Item(40, 100, "A proper Medpack, healing even the most grevious of wounds"));
		item.put("Datapad", new Item(700, 0, "A datapad with information on the Jedi"));
		item.put("Deathsticks", new Item(200, -10, "A taste of death"));
		item.put("Thermaslice", new Item(50, 0, "Yes, this is an easter egg"));
		item.put("Chiss Pyrowall Cracker", new Item(100, 0, "Chiss technology for hacking"));
		item.put("Chiss Comlink Cracker", new Item(100, 0, "Chiss technology for listening into Comlinks"));
		item.put("Incriminating Holograph", new Item(400, 0, "Blackmail material"));
		item.put("VIP Comcode List", new Item(200, 0, "A list of Comcodes of very important people"));
		item.put("Evidence of Jedi passage", new Item(500, 0, "The Jedi were here"));
		item.put("Holograph of Jedi activity", new Item(600, 0, "Holograph of the Jedi in action"));
		item.put("Evidence of Sith passage", new Item(500, 0, "The Sith were here"));
		item.put("Holograph of Sith activity", new Item(600, 0, "Holograph of the Sith in action"));
		item.put("Evidence of fight", new Item(700, 0, "The aftermath of a fight"));
		item.put("Evidence of Count Dooku's Killer", new Item(2000, 0, "The wreckage of battle hide clues to who the perpitrators are"));
		item.put("Evidence of General Grevious's Killer", new Item(2000, 0, "The Saber-burnt remains of the General hide clues to his undoing "));
		item.put("Evidence of a Sith amongst the Jedi", new Item(2000, 0, "Trechery has a high price"));
	}
   
    public Item getItemData(String itemName){
        return item.get(itemName);
    }

}