package example;

public abstract class Character extends Actor{
	private int level = 1;
	private int faction=1;
	
	private double health = 1000;
	
	public Character() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Character(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public abstract int getAttackRange() ;
	
	public double getHealth() {
		return health;
	}
	public void setHealth(double health) {
		this.health = health;
	}
	
	public boolean checkStatus(){
		if(this.getHealth()<=0) {
			return false;
		}
		if(this.getHealth()>1000) {
			this.setHealth(1000);
		}
		return true;
	}
	
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getFaction() {
		return faction;
	}
	public void setFaction(int faction) {
		this.faction = faction;
	}

}
