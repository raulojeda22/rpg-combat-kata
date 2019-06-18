package example;

public class Thing extends Actor{
	
	
	private double health = 2000;
	private int faction=0;
	
	public double getHealth() {
		return health;
	}
	public void setHealth(double health) {
		this.health = health;
	}
	
	
	public Thing() {
		super();
	}
	public Thing(double health) {
		super();
		this.health=health;
	}

	public Thing(String name) {
		super(name);
	}
	
	public boolean checkStatus(){
		if(this.getHealth()<=0) {
			return false;
		}
		return true;
	}

	public int getFaction() {
		return faction;
	}
	public void setFaction(int faction) {
		this.faction = faction;
	}
}
