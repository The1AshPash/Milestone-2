package colossal.cave.items;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public final class ItemData {
    private static Map<String, ScorableItems> item;
  //Bullet point 4 (adjusted for functionality)  
    public static void init(){
        item = new HashMap<>();
        initializeItemData();

    }
// Bullet point 1
    private static void initializeItemData() {
		item.put("Medkit", new ScorableItems(10, 20, "It's small but it heals well"));
		item.put("Medpack", new ScorableItems(40, 100, "A proper Medpack, healing even the most grevious of wounds"));
		item.put("Datapad", new ScorableItems(700, 0, "A datapad with information on the Jedi"));
		item.put("Deathsticks", new ScorableItems(200, -10, "A taste of death"));
		item.put("Thermaslice", new ScorableItems(50, 0, "Yes, this is an easter egg"));
		item.put("Chiss Pyrowall Cracker", new ScorableItems(100, 0, "Chiss technology for hacking"));
		item.put("Chiss Comlink Cracker", new ScorableItems(100, 0, "Chiss technology for listening into Comlinks"));
		item.put("Incriminating Holograph", new ScorableItems(400, 0, "Blackmail material"));
		item.put("VIP Comcode List", new ScorableItems(200, 0, "A list of Comcodes of very important people"));
		item.put("Evidence of Jedi passage", new ScorableItems(500, 0, "The Jedi were here"));
		item.put("Holograph of Jedi activity", new ScorableItems(600, 0, "Holograph of the Jedi in action"));
		item.put("Evidence of Sith passage", new ScorableItems(500, 0, "The Sith were here"));
		item.put("Holograph of Sith activity", new ScorableItems(600, 0, "Holograph of the Sith in action"));
		item.put("Evidence of fight", new ScorableItems(700, 0, "The aftermath of a fight"));
		item.put("Evidence of Count Dooku's Killer", new ScorableItems(2000, 0, "The wreckage of battle hide clues to who the perpitrators are"));
		item.put("Evidence of General Grevious's Killer", new ScorableItems(2000, 0, "The Saber-burnt remains of the General hide clues to his undoing "));
		item.put("Evidence of a Sith amongst the Jedi", new ScorableItems(2000, 0, "Trechery has a high price"));
	}
   
    public static ScorableItems getItemData(String itemName){
        return item.get(itemName);
    }
//Bullet point 2
    public static void getAllFlavorText(){
        System.out.println("You found the secret list of item descriptions:");
        Iterator<Map.Entry<String, ScorableItems>> it = item.entrySet().iterator();
            while(it.hasNext()) {
                Map.Entry<String, ScorableItems> itemData = it.next();
                System.out.println(itemData.getKey() +" - " + itemData.getValue().flavorText);

    }
//Bullet point 3 is in Planet, Bullet point 5 is in Player(middle of the code), Bullet point 6 is in Player (bottom)
}
}
//Programmed by Ashley Milone