package example;

public class Attack extends Action{

	private double damage = 0f; 
	
	public Attack(Character source, Actor target){
		
		super(source,target);
		
		
	}

	public double getDamage() {
		return damage;
	}

	public void setDamage(double damage) {
		this.damage = damage;
	}
	
	public boolean isAttackPossible() {
		if(this.getSource().getName()==this.getTarget().getName()) {
			return false;
		}
		int rangeDifference=Math.abs(this.getSource().getPosition()-this.getTarget().getPosition());
		
		if(rangeDifference>this.getSource().getAttackRange()) {
			System.out.println("tu k");
			return false;
		}
		
		if (this.getSource().getFaction()==this.getTarget().getFaction()) {
			System.out.println("baia");
			return false;			
		}
		return true;
	}
	
	public void attack(double damage) {
		int levelDifference=0;
		System.out.println(this.isAttackPossible());
		if (this.isAttackPossible()) {
			levelDifference = this.getSource().getLevel()-this.getTarget().getLevel();
			if (levelDifference>=5) {
				damage=damage*1.5f;
			} else if (levelDifference<=-5) {
				damage=damage-damage*0.5f;
			}
			this.getTarget().setDamage(damage);
		}
	}
	
}
