package framework;

import java.util.ArrayList;
import java.util.List;

public class Game {

	private List<Map> maps;
	private PlayerRole player;

	//private Map map;

	public void initGame() {
		System.out.println("初始化游戏");
		
		player=new PlayerRole();
		maps=new ArrayList<Map>();
		
	}
	
	private void no_1() {
		Map map0=new Map("哥谭市",10, 8, new MapModel(),true);
		Map map1=new Map("二叉树",20, 20, new MapModel(),false);
		maps.add(map0);
		maps.add(map1);
		

		player.setName("测试者");
		player.setMap(map0);
		map0.addRole(player);
		player.move(4, 5);
		player.move(100,100);
		
		player.changeMap(map1);
	}
	
	private void no_2() {
		maps.get(0).showAllRoles();
		maps.get(1).showAllRoles();
		player.die();
	}
	

	public void start() {
		System.out.println("加载游戏");
		no_1();
		no_2();
	}

}
