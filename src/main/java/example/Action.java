package example;

public abstract class Action {
	
	private Actor source = null;
	private Actor target = null;

	public Action(Actor source, Actor target){
		super();
		
		this.source = source;
		this.target = target;
		
	}
	
	public Actor getTarget() {
		return target;
	}
	public void setTarget(Actor target) {
		this.target = target;
	}

	public Actor getSource() {
		return source;
	}

	public void setSource(Actor source) {
		this.source = source;
	}
}
