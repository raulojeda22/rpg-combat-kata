package example;

public class Melee extends Character {

	private int attackRange = 2;
	
	
	public Melee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Melee(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public int getAttackRange() {
		return attackRange;
	}

	public void setAttackRange(int attackRange) {
		this.attackRange = attackRange;
	}
	
}
