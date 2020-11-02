package colossal.cave.items;

import java.util.ArrayList;
import java.util.List;
// note the requirements are met and will be notated with comments throughout the code(mostly in ItemData). 
public class ScorableItems {
	
	public int score;
	private int hpChange;
	public String flavorText;
	
	
	public ScorableItems(int score, int hpChange, String text){
		this.score = score;
		this.hpChange = hpChange;
		this.flavorText= text;
		
	}
}
//Programmed by Ashley Milone