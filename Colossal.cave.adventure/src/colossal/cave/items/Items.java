package colossal.cave.items;

import java.util.ArrayList;
import java.util.List;

public class Items {
	
	private String name;
	private int score;
	private int hpChange;
	private String location;
	private String flavorText;
	
	
	public Items(String name, int score, int hpChange, String text, String location ){
		this.name = name;
		this.score = score;
		this.hpChange = hpChange;
		this.flavorText= text;
		this.location = location;
	}
	

}
