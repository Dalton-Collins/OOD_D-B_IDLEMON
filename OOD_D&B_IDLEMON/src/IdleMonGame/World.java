package IdleMonGame;

import java.util.ArrayList;

public class World {
	//this is the superclass for all worlds
	WinCondition wc;
	ArrayList<Rule> rules;
	ArrayList<Integer> resources;
	
	public World(WinCondition WC, ArrayList<Rule> RULES){
		wc = WC;
		rules = RULES;
		
	}
	//Grass
	//Water
	//Flame
	public ArrayList<Integer> getInitialResources(){
		return resources;
	}
	
	
	
	public WinCondition getWinCondition(){
		return wc;
	}
}
