package example;

public class Heal extends Action{


	private double health = 0f; 
	
	public Heal(Character source, Actor target) {
		super(source,target);
	}

	public double getHealth() {
		return health;
	}

	public void setHealth(double health) {
		this.health = health;
	}
	

	public boolean isHealPossible() {
		if((this.getSource().getName()==this.getTarget().getName())||(this.getSource().getFaction()==this.getTarget().getFaction())) {
			if (this.getTarget() instanceof Thing) {
				return false;
			}
			return true;
		}
		return false;
	}


	public void heal(double heal) {
		if(this.isHealPossible()) {
			this.getTarget().setHeal(heal);
		}
	}
}
