package framework;

//�����ࣨ����
public abstract class Item {

	private boolean isAbleInteractive;

	private String name;

	private Model model;

	public boolean getInteractive() {
		return isAbleInteractive;
	}//�Ƿ�Ϊ�ɽ�������

	public String getName() {
		return name;
	}

	public void setModel(Model model) {
		this.model=model;
	}

}
