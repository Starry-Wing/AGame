package framework;

public class Menu {

	public void startGame() {
		System.out.println("�½���Ϸ");
		Game game=new Game();
		game.initGame();
		game.start();
	}

	public void loadGame(Game game) {
		System.out.println("��ȡ��Ϸ");
		game.start();
	}

	public void setGame(Game game) {
		System.out.println("����");
	}

	public void showAchievement(Game game) {
		System.out.println("��ʾ�ɾ�");
	}

	public void exit() {
		System.out.println("�˳���Ϸ");
		System.exit(0);
	}

}
