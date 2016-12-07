package IdleMonGame;

public interface Rule {
	public void alterGame(Game g);
	//some rules will be type 0 - they are not time dependant, 
	//so they apply once at the start of the world
	public int type = 0;
}
