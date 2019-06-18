package example;

public abstract class Actor {
	private int faction=0;
	private int attackRange=0;
	private int level=0;
	private String name="Default";
	private double health = 0;
	private int position= 50;
	private boolean alive=true;

	
	public Actor() {}
	
	public Actor(String name) {
		this.name=name;
	}

	public abstract boolean checkStatus() ;
	
	public abstract double getHealth();

	public abstract void setHealth(double health);

	
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public abstract int getFaction();

	public void setFaction(int faction) {
		this.faction = faction;
	}

	public int getAttackRange() {
		return attackRange;
	}

	public void setAttackRange(int attackRange) {
		this.attackRange = attackRange;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	public void setDamage(double damage) {
		System.out.println(damage);
		System.out.println(this.getHealth());
		this.setHealth(this.getHealth()-damage);
		System.out.println(this.getHealth());
		this.alive=this.checkStatus();
	}
	
	public void setHeal(double health) {
		if (this.alive) {
			this.setHealth(this.getHealth()+health);
			this.alive=this.checkStatus();
		}
		
	}

	
	
}
