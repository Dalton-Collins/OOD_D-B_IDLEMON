package IdleMonGame;

public class Flame_10000_Win implements WinCondition{

	@Override
	public boolean hasWon(World w) {
		//if the world has 10000 flame resources.
		if(w.resources.get(2) == 10000){
			return true;
		}
		return false;
	}

}
