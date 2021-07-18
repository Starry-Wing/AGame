package framework;

//道具类（抽象）
public abstract class Item {

	private boolean isAbleInteractive;

	private String name;

	private Model model;

	public boolean getInteractive() {
		return isAbleInteractive;
	}//是否为可交互道具

	public String getName() {
		return name;
	}

	public void setModel(Model model) {
		this.model=model;
	}

}
