package framework;

public abstract class InteractiveItem extends Item {

	private boolean isAbleInteractive = true;

	private int HP;

	private boolean isAbleAdd;

	public int getHP() {
		return HP;
	}

	public void die() {
		System.out.println("�ѻٻ�");
	}

	public void useResult() {
		System.out.println("����Ч��");
	}
	
	public boolean isAbleAdd() {
		return isAbleAdd;
	}//�Ƿ�Ϊ�ܻ�õĵ���

}
