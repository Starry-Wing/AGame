package framework;

public abstract class InteractiveItem extends Item {

	private boolean isAbleInteractive = true;

	private int HP;

	private boolean isAbleAdd;

	public int getHP() {
		return HP;
	}

	public void die() {
		System.out.println("已毁坏");
	}

	public void useResult() {
		System.out.println("产生效果");
	}
	
	public boolean isAbleAdd() {
		return isAbleAdd;
	}//是否为能获得的道具

}
