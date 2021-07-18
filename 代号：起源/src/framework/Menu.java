package framework;

public class Menu {

	public void startGame() {
		System.out.println("新建游戏");
		Game game=new Game();
		game.initGame();
		game.start();
	}

	public void loadGame(Game game) {
		System.out.println("读取游戏");
		game.start();
	}

	public void setGame(Game game) {
		System.out.println("设置");
	}

	public void showAchievement(Game game) {
		System.out.println("显示成就");
	}

	public void exit() {
		System.out.println("退出游戏");
		System.exit(0);
	}

}
