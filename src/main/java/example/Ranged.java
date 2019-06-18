package example;

public class Ranged extends Character {

	private int attackRange= 20;
	

	public Ranged() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Ranged(String name) {
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
