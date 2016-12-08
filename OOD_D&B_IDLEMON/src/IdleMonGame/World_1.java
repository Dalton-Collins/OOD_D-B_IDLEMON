package IdleMonGame;

import java.util.ArrayList;

public class World_1 extends World{

	public World_1(WinCondition WC, ArrayList<Rule> RULES) {
		super(WC, RULES);
		
		resources.add(100000);//grass
		resources.add(0);
		resources.add(0);
	}

}
