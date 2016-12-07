package IdleMonGame;

import java.util.Map;

public class Player {
	//unique player name
	String name;
	//map of world number to time achieved
	Map<Integer, Integer> scores;
	
	//this info will be saved to disk when save is selected
	public Player(String NAME, Map<Integer, Integer> SCORES){
		name = NAME;
		scores = SCORES;
	}
}
