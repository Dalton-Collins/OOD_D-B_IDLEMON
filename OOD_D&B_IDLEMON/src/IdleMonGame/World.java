package IdleMonGame;

import java.util.ArrayList;

public class World {
	
	WinCondition wc;
	ArrayList<Rule> rules;
	
	public World(WinCondition WC, ArrayList<Rule> RULES){
		wc = WC;
		rules = RULES;
	}
	
	public ArrayList<Integer> getInitialResources(){
		ArrayList<Integer> initResources = new ArrayList<Integer>();
		initResources.add(1000);
		initResources.add(0);
		initResources.add(0);
		return initResources;
	}
	
	
	
	public WinCondition getWinCondition(){
		return wc;
	}
}
